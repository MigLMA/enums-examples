package com.raulavila.enums.calculator;

public enum Operation {
    ADD("+") {
        @Override
        public int perform(int operand1, int operand2) {
            return operand1 + operand2;
        }
    },
    SUBSTRACT("-"){
        @Override
        public int perform(int operand1, int operand2) {
            return operand1 - operand2;
        }
    },
    MULTIPLY("*"){
        @Override
        public int perform(int operand1, int operand2) {
            return operand1 * operand2;
        }
    },
    DIVIDE("/"){
        @Override
        public int perform(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };
    
    private final String operator;

    Operation(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public abstract int perform(int operand1, int operand2);
}
