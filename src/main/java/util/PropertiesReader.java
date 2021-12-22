package util;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesReader {
    final static Logger logger = Logger.getLogger(PropertiesReader.class);
    Properties property = new Properties();

    public PropertiesReader() {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("src/main/resources/config.properties");
            property.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            logger.info("not exist");
            System.err.println("ERROR");
        }
    }

    public String getUrl() {
        return property.getProperty("URL");
    }

    public String getDriverName() {
        return property.getProperty("CHROME_DRIVER_NAME");
    }

    public String getDriverLocation() {
        return property.getProperty("CHROME_DRIVER_LOCATION");
    }

}
