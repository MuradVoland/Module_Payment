package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties getPropertyObject() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        return prop;
    }
    public static String getUrl() throws IOException {
        return getPropertyObject().getProperty("url");
    }
    public static String getPhone() throws IOException {
        return getPropertyObject().getProperty("loginPhone");
    }
    public static String getId() throws IOException {
        return getPropertyObject().getProperty("loginId");
    }
    public static String getCardId() throws IOException {
        return getPropertyObject().getProperty("cardId");
    }
}