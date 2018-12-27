package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    private static String baseUrl;
    private static String login;
    private static String password;

    private static FileInputStream propertiesFile;
    private static Properties property;

    static {
        property = new Properties();

        try {
            propertiesFile = new FileInputStream("src/main/resources/test.properties");
            property.load(propertiesFile);
            baseUrl = property.getProperty("baseUrl");
            login = property.getProperty("login");
            password = property.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }
}
