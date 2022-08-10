package ua.goit.productStore.service;

import org.junit.jupiter.api.Test;
import ua.goit.productStore.model.Products;
import ua.goit.productStore.repository.DataBase;
import ua.goit.productStore.service.NumberOfProducts;

import static org.junit.jupiter.api.Assertions.*;

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
}