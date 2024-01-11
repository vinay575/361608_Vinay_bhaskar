import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Connection con = null;
        PrintWriter pw = response.getWriter();

        try {
            String url = "jdbc:mysql://localhost:3306/serverdata";
            String uname = "root";
            String pwd = "vinay@123";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, uname, pwd);

            String name = request.getParameter("Username");
            String pass = request.getParameter("password");

            // Create a LoginDAO object and pass the connection
            BankDAO loginDAO = new    BankDAO(con);

            if (loginDAO.validateUser(name, pass)) {
                // Forward to the result page on successful login
                RequestDispatcher rd = request.getRequestDispatcher("Welcome.html");
                rd.forward(request, response);
            } else {
                pw.println("<font color=red >Login failed !</font><br>");
                pw.println(" Try To Login Again:<a href=Login.html><input type=\"submit\" value=\"Login_in\" ></a><br>");
                pw.println(
                        "New User Register Here :<a href=Sign_up.html><input type=\"submit\" value=\"Register\" ></a><br>");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection in a finally block
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
