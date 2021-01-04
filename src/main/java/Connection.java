import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class Connection {
    private static java.sql.Connection connection;
    static {
        try {
            Properties props = new Properties();
        try (FileInputStream fis= new FileInputStream("src/config.properties")) {
                props.load(fis);
            }
            Class.forName(props.getProperty("jdbc.driver.class"));
            String url = props.getProperty("jdbc.url");
            String login = props.getProperty("jdbc.login");
            String password = props.getProperty("jdbc.password");

            connection = DriverManager.getConnection(url, login, password);
            } catch (Exception ex) {
                System.out.println(""+ex.getMessage());
            }
        }
        public java.sql.Connection getConnection() {
            return connection;
        }
}
