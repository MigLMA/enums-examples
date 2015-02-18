package com.raulavila.enums.states;

public class Oven {

    private OvenState state;

    public Oven() {
        reset();
    }

    public void reset() {
        state = OvenState.getInitialState();
    }

    public void click() {
        if(hasFinished())
            throw new IllegalStateException(
                    "Oven has finished cooking");
            
        state = state.getNext();
    }
    
    public String getState() {
        return state.getValue();
    }
    
    public boolean hasFinished() {
        return !state.hasNext();
    }
}
