package com.stackoverflow;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Properties;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private Properties prop = ConfigPropertiesReader.getProp();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void unitTestPass()
    {
        System.out.println(">>>running dev test");
        assertEquals(prop.get("environment"), "dev-env");
        assertEquals(prop.get("build.profile"), "dev");
    }
}
