
package myapp;


//Database connection for Login
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class database {

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull",
                    "root", "");
            System.out.print("Database is connected !");
            Component rootPane = null;

        }

        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return conn;
    }

}
