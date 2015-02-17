package com.raulavila.enums.config;

import org.apache.commons.lang3.Validate;

public abstract class AbstractConfigDAO implements ConfigDAO {
    
    @Override
    public void save(ConfigParam param, Object value) {
        validate(param, value);

        doSave(param.getParamName(), value);
    }

    private void validate(ConfigParam param, Object value) {
        Validate.notNull(param, "Param can't be null");
        Validate.notNull(value, "Value can't be null");

        if (!param.hasValidTypeFor(value)) {
            throw new IllegalArgumentException(
                    param.getParamName()+
                            " value must be an instance of " +
                            param.getType().getSimpleName());
        }

    }

    protected abstract void doSave(String paramName, Object value);
}
