import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Arrays;
import java.util.Properties;

public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        City city = new City(10,52,226,150);
        //city.nextIncomeCall();
        //city.nextPaiement();

        for(int i = 0; i < city.getContribuableList().size(); i++) {
            System.out.println(city.getContribuableList().get(i).toString());
        }

        //externalisation des params du jdbc driver
//        Properties props = new Properties();
//        try (FileInputStream fis= new FileInputStream("src/config.properties")) {
//            props.load(fis);
//        }
//        Class.forName(props.getProperty("jdbc.driver.class"));
//        String url = props.getProperty("jdbc.url");
//        String login = props.getProperty("jdbc.login");
//        String password = props.getProperty("jdbc.password");
//
//        try (Connection connection = DriverManager.getConnection(url,login,password)) {
//            String strSql = "INSERT INTO contacts(ID, nom) VALUES (10, 'dupont')";
//            try (Statement statement = connection.createStatement()) {
//                statement.executeUpdate(strSql);
//            }
////            String strSql = "SELECT * FROM contacts";
////            try (Statement statement = connection.createStatement()) {
////                try (ResultSet resultSet = statement.executeQuery(strSql) ) {
////                    while ( resultSet.next()) {
////                        int ID = resultSet.getInt( 1 );
////                        String name = resultSet.getNString("nom");
////
////                        System.out.printf( "%d: %s", ID, name);
////                    }
////                }
////
////            }
//        }


    }


}
