import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private Connection connection;

    // Constructor that takes a Connection parameter
    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    // Method for registering a user
    public boolean registerUser(UserDTO userDTO) throws SQLException {
      String query = "INSERT INTO logindata (name, phone_no, address, email, pass, confirm_pass) VALUES (?, ?, ?, ?, ?, ?)";

        
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, userDTO.getUsername());
            ps.setString(2, userDTO.getPhoneNo());
            ps.setString(3, userDTO.getAddress());
            ps.setString(4, userDTO.getEmail());
            ps.setString(5, userDTO.getPassword());
            ps.setString(6, userDTO.getConfirmPassword());

            int count = ps.executeUpdate();

            return count > 0;
        }
    }

    // Method for validating a user during login
    public boolean validateUser(String username, String password) throws SQLException {
        String loginQuery = "SELECT name FROM logindata WHERE name=? AND pass=?";
        
        try (PreparedStatement ps = connection.prepareStatement(loginQuery)) {
            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); // Returns true if the user exists, false otherwise
            }
        }
    }

    // Other methods for user-related database operations
    // ...
}
