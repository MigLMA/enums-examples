package com.raulavila.enums.config;

public class DummyConfigDAO extends AbstractConfigDAO {

    @Override
    protected void doSave(String paramName, Object value) {
        System.out.println("Saving param " + paramName + 
                                " with value " + value.toString());
    }
}
