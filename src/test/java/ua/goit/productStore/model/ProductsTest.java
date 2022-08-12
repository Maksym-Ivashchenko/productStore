package ua.goit.productStore.model;

import org.junit.jupiter.api.Test;
import ua.goit.productStore.repository.DataBase;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {
    private static DataBase dataBase = new DataBase();
    private static Products someProduct = dataBase.getProductA();
    private static Products product = dataBase.getProductA();
    private static Products nullProduct1;


    @Test
    void testEquals() {
        boolean actual = true;
        boolean expected = someProduct.equals(product);

        assertTrue(expected && someProduct.getProductName().equals(product.getProductName()) &&
                someProduct.getProductDiscount().equals(product.getProductDiscount()) &&
                someProduct.getProductPrice().equals(product.getProductPrice()) &&
                someProduct.getProductQuantity().equals(product.getProductQuantity()) &&
                someProduct.hashCode() == product.hashCode());
        assertNull(nullProduct1);
        assertFalse(product.equals(dataBase));
        assertEquals(expected, actual);

    }
}