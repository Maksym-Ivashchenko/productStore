package ua.goit.productStore.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ua.goit.productStore.model.Products;
import ua.goit.productStore.repository.DataBase;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DiscountSystemTest {
    private static final DataBase dataBase = new DataBase();
    private final DiscountSystem discountSystem = new DiscountSystem();


    @ParameterizedTest(name = "#{index} - Run test")
    @MethodSource("predefinedData")
    void getPriceWithDiscountTest(String currentString, Products product, Double expectedPrice) {
        //given
        //when
        Double actualPrice = discountSystem.getPriceWithDiscount(currentString, product);
        //then
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

    static Stream<Arguments> predefinedData() {
        return Stream.of(
                Arguments.arguments("AAAA", dataBase.getProductA(), 4.25),
                Arguments.arguments("BBB", dataBase.getProductB(), 12.75),
                Arguments.arguments("CCC", dataBase.getProductC(), 3.0),
                Arguments.arguments("DDD", dataBase.getProductD(), 2.25)
        );
    }

}