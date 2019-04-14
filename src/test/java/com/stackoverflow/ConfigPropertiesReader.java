package com.stackoverflow;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class ConfigPropertiesReader {

    private static Properties prop;

    static {

        try (InputStream input = ConfigPropertiesReader.class.getClassLoader().getResourceAsStream("config.properties")) {

            prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
            }

            //load a properties file from class path, inside static method
            prop.load(input);

            //get the property value and print it out
            System.out.println(prop.getProperty("environment"));
            System.out.println(prop.getProperty("build.profile"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private ConfigPropertiesReader(){}

    static Properties getProp() {
        return prop;
    }
}
