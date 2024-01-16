import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get parameters from the request
        String username = request.getParameter("Username");
        String phoneNo = request.getParameter("Phone_No");
        String address = request.getParameter("Address");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("ConformPassword");

        // Check if any field is empty
        if (username.isEmpty() || phoneNo.isEmpty() || address.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            PrintWriter pw = response.getWriter();
            pw.println("<script>alert('All fields must be filled.'); window.location.href='Sign_up.html';</script>");
            return;
        }

        // Check if password and confirmPassword match
        if (!password.equals(confirmPassword)) {
            PrintWriter pw = response.getWriter();
            pw.println("<script>alert('Password and Confirm Password do not match.'); window.location.href='Registration.html';</script>");
            return;
        }

        // Create a UserDTO object and set values
        UserDTO userDTO = new UserDTO(username, phoneNo, address, email, password, confirmPassword);

        // Create JDBCConnectionDAO instance
        BankDAO connectionDAO = new BankDAO();

        try (Connection con = connectionDAO.connect()) {
            // Create a UserDAO object and pass the connection
            UserDAO userDAO = new UserDAO(con);

            if (userDAO.registerUser(userDTO)) {
                RequestDispatcher rd = request.getRequestDispatcher("Login.html");
                rd.forward(request, response);
            } else {
                PrintWriter pw = response.getWriter();
                pw.println("Registration failed");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
