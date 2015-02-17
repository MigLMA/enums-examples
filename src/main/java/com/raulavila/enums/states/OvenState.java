package com.raulavila.enums.states;

enum OvenState {
    
    END("Oven finished cooking", null),
    COOLING("Oven is cooling", END),
    COOKING("Oven is cooking", COOLING),
    HEATING("Oven is heating", COOKING),
    BEGIN("Oven is starting", HEATING);

    private final String value;
    private final OvenState next;
    
    OvenState(String value, OvenState next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public OvenState getNext() {
        return next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
