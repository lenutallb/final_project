import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    //   static OrderItem orderItem = new OrderItem();
    public static void connectToDB() {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training_management", "root", "pass")) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Test database");
        connectToDB();
    }
}
