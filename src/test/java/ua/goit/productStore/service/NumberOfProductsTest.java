package ua.goit.productStore.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.goit.productStore.model.Products;
import ua.goit.productStore.repository.DataBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class NumberOfProductsTest {
    private final String productString = "AAA";
    private final DataBase dataBase = new DataBase();
    private NumberOfProducts number = new NumberOfProducts();

    @Test
    void getNumberOfProductTestIsOk() {
        //given
        Products product = dataBase.getProductA();
        //when
        int actualCount = number.getNumberOfProduct(productString,product);
        //then
        int expectedCount = 3;
        assertEquals(expectedCount, actualCount);

    }

    @Test
    void getNumberOfProductWithMockito() {
        //given
        String s = "AACDB";
        Products someProduct = Mockito.mock(Products.class);
        Mockito.when(someProduct.getProductName()).then(name -> "A");

        Products product = dataBase.getProductA();
        //when
        int actualNumber = number.getNumberOfProduct(s, someProduct);
        //then
        int expectedNumber = 2;
        assertEquals(expectedNumber, actualNumber);
    }
}