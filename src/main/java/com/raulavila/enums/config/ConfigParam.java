package com.raulavila.enums.config;

public enum ConfigParam {
    
    SYSTEM_NAME("systemName", String.class),
    CONCURRENT_USERS("concurrentUsers", Integer.class);
    
    private final String paramName;
    private final Class<?> type;

    ConfigParam(String paramName, Class<?> type) {
        this.paramName = paramName;
        this.type = type;
    }

    public boolean hasValidTypeFor(Object value) {
        if (value == null) {
            return false;
        }
        
        return value.getClass().isAssignableFrom(type);
    }

    public String getParamName() {
        return paramName;
    }

    public String getTypeName() {
        return type.getSimpleName();
    }
}
