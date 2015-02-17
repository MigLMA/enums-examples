package com.raulavila.enums.config;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DummyConfigDAOTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    
    private ConfigDAO configDAO = new DummyConfigDAO();

    @Test
    public void testCorrectSystemName() throws Exception {
        configDAO.save(ConfigParam.SYSTEM_NAME, "mySystem");
    }

    @Test
    public void testIncorrectSystemName() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(
                "systemName value must be an instance of String");
        
        configDAO.save(ConfigParam.SYSTEM_NAME, Integer.valueOf(1));
    }

    @Test
    public void testCorrectConcurrentUsers() throws Exception {
        configDAO.save(ConfigParam.CONCURRENT_USERS, Integer.valueOf(2));
    }

    @Test
    public void testIncorrectConcurrentUsers() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(
                "concurrentUsers value must be an instance of Integer");

        configDAO.save(ConfigParam.CONCURRENT_USERS, "stringValue");
    }

    @Test
    public void testNullParam() throws Exception {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Param can't be null");

        configDAO.save(null, "stringValue");
    }

    @Test
    public void testNullValue() throws Exception {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Value can't be null");

        configDAO.save(ConfigParam.SYSTEM_NAME, null);
    }
}
