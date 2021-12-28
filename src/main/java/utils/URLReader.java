package utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class URLReader {

    private static final Properties properties = new Properties();
    private static final Logger logger = LoggerFactory.getLogger(URLReader.class);

    private URLReader() {
        throw new IllegalStateException("This class could not be instanced");
    }

    static {
        try {
            properties.load(URLReader.class.getClassLoader().getResourceAsStream("uri.properties"));
        } catch (IOException e) {
            logger.info(Arrays.toString(e.getStackTrace()));
        }
    }

    public static String getUrl(String property) {
        return properties.getProperty(property);
    }
}
