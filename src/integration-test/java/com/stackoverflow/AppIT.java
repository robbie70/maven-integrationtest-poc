package com.stackoverflow;

import static org.junit.Assert.assertEquals;
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
    public void shouldPassIT()
    {
        System.out.println(">>>running integration-test");
        assertEquals(prop.get("environment"), "integration-test-env");
        assertEquals(prop.get("build.profile"), "integration-test");
    }
}
