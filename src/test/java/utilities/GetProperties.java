package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {
    private Properties properties = new Properties();

    public GetProperties() throws IOException {
        InputStream config = getClass().getResourceAsStream("/config.properties");
        properties.load(config);
    }

    public String getString(String propName){

        return properties.getProperty(propName);
    }
}
