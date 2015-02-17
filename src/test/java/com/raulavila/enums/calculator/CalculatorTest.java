package com.raulavila.enums.calculator;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void testCalculator() throws Exception {
        Calculator calculator = new Calculator(Operation.ADD);

        assertThat(calculator.performOperation(8, 2)).isEqualTo(10);
        
        calculator.setOperation(Operation.SUBSTRACT);

        assertThat(calculator.performOperation(8, 2)).isEqualTo(6);

        calculator.setOperation(Operation.MULTIPLY);

        assertThat(calculator.performOperation(8, 2)).isEqualTo(16);

        calculator.setOperation(Operation.DIVIDE);

        assertThat(calculator.performOperation(8, 2)).isEqualTo(4);
    }
}
