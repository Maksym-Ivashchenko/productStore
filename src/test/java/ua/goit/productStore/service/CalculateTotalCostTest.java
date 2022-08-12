package ua.goit.productStore.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateTotalCostTest {
    private final CalculateTotalCost totalCost = new CalculateTotalCost();

    @Test
    public void resultSumTestIsOk() {
        //given
        String productString = "AABBCCABCD";
        //when
        double actual = totalCost.getResult(productString);
        //then
        Double expected = 19.5;
        assertEquals(expected, actual);
    }

}