package com.stackoverflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Properties;

/**
 * Unit test for simple App.
 */
public class AppIT
{
    private Properties prop = ConfigPropertiesReader.getProp();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void ITPass()
    {
        assertEquals(prop.get("environment"), "integration-test-env");
        assertEquals(prop.get("build.profile"), "integration-test");
    }
}
