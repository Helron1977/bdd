import java.util.Properties;

public class MySqlTable {
    String nom;
    String prenom;
    String age;

    public MySqlTable(String nom, String prenom, String age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    void create() throws ClassNotFoundException {
        Properties props = new Properties();
        Class.forName(props.getProperty("jdbc.driver.class"));
        String url = props.getProperty("jdbc.url");
        String login = props.getProperty("jdbc.login");
        String password = props.getProperty("jdbc.password");
        String strsql= " CREATE TABLE "+ this.getClass()+ " (";

    }
}
