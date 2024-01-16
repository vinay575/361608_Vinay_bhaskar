import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
	private Connection con;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter pw = response.getWriter();

        // Create JDBCConnectionDAO instance
        BankDAO connectionDAO = new BankDAO();

        try (Connection con = connectionDAO.connect()) {
            

        	String name = request.getParameter("Username");
        	String pass = request.getParameter("password");

        	if (name.isEmpty() || pass.isEmpty()) {
        	    // alert for empty 
        	    pw.println("<script>alert('Username and password cannot be empty!'); window.location.href='Login.html';</script>");
        	} else {
        	    // Create a UserDAO object 
        	    UserDAO userDAO = new UserDAO(con);

        	    if (userDAO.validateUser(name, pass)) {
        	        RequestDispatcher rd = request.getRequestDispatcher("Welcome.html");
        	        rd.forward(request, response);
        	    } else {
        	        // Display login failure messages
        	        pw.println("<div style=\"color: red; font-size: 18px; font-weight: bold; background-color: #ffe6e6; padding: 10px; border: 1px solid #ff3333; height: 30px; width: 500px; text-align: center; margin: 0 auto; margin-top :10px;\">Login failed!</div>");
        	        pw.println("<div style=\"color: green; font-size: 18px; font-weight: bold; background-color: #ffe6e6; padding: 10px; border: 1px solid #ff3333; height: 30px; width: 500px; text-align: center; margin: 0 auto; margin-top :10px;\">Try To Login Again: <a href=\"Login.html\"><input type=\"submit\" value=\"Login_in\"></a><br></div>");
        	        pw.println("<div style=\"color: green; font-size: 18px; font-weight: bold; background-color: #ffe6e6; padding: 10px; border: 1px solid #ff3333; height: 30px; width: 500px; text-align: center; margin: 0 auto; margin-top :10px;\">New User Register Here: <a href=\"Sign_up.html\"><input type=\"submit\" value=\"Register\"></a><br></div>");
        	    }
        	}

 


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Disconnect from the database
            connectionDAO.disconnect(con);
        }
    }
}
