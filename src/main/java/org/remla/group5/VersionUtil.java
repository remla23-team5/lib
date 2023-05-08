package org.remla.group5;

import java.io.IOException;
import java.util.Properties;

public class VersionUtil {
    public static String getVersion() throws IOException {
        final Properties properties = new Properties();
        properties.load(VersionUtil.class.getClassLoader().getResourceAsStream("application.properties"));
        return properties.getProperty("version");
    }
}
