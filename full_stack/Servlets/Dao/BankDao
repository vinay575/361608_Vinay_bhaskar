import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankDAO {

    public Connection connect() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/serverdata";
            String uname = "root";
            String pwd = "vinay@123";

            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, uname, pwd);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Database driver not found", e);
        }
    }

    public void disconnect(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately
        }
    }
}

