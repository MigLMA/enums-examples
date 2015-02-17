package com.raulavila.enums.calculator;

public class Calculator {

    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public int performOperation(int operand1,
                                int operand2) {
        
        return operation.perform(operand1, operand2);
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
