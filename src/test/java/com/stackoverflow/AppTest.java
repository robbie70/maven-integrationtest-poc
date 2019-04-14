package com.stackoverflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertEquals(prop.get("environment"), "dev-test-env");
        assertEquals(prop.get("build.profile"), "dev");
    }
}
