package ua.goit.productStore.service;

import org.junit.jupiter.api.Test;
import ua.goit.productStore.repository.DataBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountSystemTest {
    private final DataBase dataBase = new DataBase();
    private final DiscountSystem discountSystem = new DiscountSystem();

    @Test
    void getPriceWithDiscountTest() {
        //given
        String inputData = "AAAA";
        //when
        Double actualPrice = discountSystem.getPriceWithDiscount(inputData, dataBase.getProductA());
        //then
        Double expectedPrice = 4.25;
        assertEquals(expectedPrice, actualPrice);
    }
    @Test
    void getPriceWithDiscountTestIfDiscountOfZero() {
        //given
        String inputData = "AA";
        //when
        Double actualPrice = discountSystem.getPriceWithDiscount(inputData, dataBase.getProductB());
        //then
        Double expectedPrice = 0.0;
        assertEquals(expectedPrice, actualPrice);
    }

}