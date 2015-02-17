package com.raulavila.enums.states;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class OvenTest {

    @Test
    public void testOven() throws Exception {
        Oven oven = new Oven();
        assertThat(oven.getState()).isEqualTo("Oven is starting");

        oven.click();
        assertThat(oven.getState()).isEqualTo("Oven is heating");

        oven.click();
        assertThat(oven.getState()).isEqualTo("Oven is cooking");

        oven.click();
        assertThat(oven.getState()).isEqualTo("Oven is cooling");

        oven.click();
        assertThat(oven.getState()).isEqualTo("Oven finished cooking");

        try {
            oven.click();
        } catch (IllegalStateException e) {
            assertThat(e.getMessage()).isEqualTo(
                    "Oven has finished cooking");
        }

        oven.reset();
        assertThat(oven.getState()).isEqualTo("Oven is starting");

    }
}
