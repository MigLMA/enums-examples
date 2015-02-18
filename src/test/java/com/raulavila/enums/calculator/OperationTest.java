package com.raulavila.enums.calculator;

import org.fest.assertions.api.Assertions;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.*;

public class OperationTest {

    @Test
    public void testAdd() throws Exception {
        Operation operation = Operation.ADD;

        assertThat(operation.getOperator()).isEqualTo("+");
        assertThat(operation.perform(6, 2)).isEqualTo(8);
    }

    @Test
    public void testSubstract() throws Exception {
        Operation operation = Operation.SUBSTRACT;

        assertThat(operation.getOperator()).isEqualTo("-");
        assertThat(operation.perform(6, 2)).isEqualTo(4);
    }

    @Test
    public void testMultiply() throws Exception {
        Operation operation = Operation.MULTIPLY;

        assertThat(operation.getOperator()).isEqualTo("*");
        assertThat(operation.perform(6, 2)).isEqualTo(12);
    }

    @Test
    public void testDividet() throws Exception {
        Operation operation = Operation.DIVIDE;

        assertThat(operation.getOperator()).isEqualTo("/");
        assertThat(operation.perform(6, 2)).isEqualTo(3);
    }
}
