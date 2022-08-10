package ua.goit.productStore.service;

import ua.goit.productStore.model.Products;

public class NumberOfProducts {

    public int getNumberOfProduct(String productString, Products products) {
        String[] productsArray = productString.split("");
        String productName = products.getProductName();
        int count = 0;
        for (String string : productsArray) {
            if (string.equals(productName))
                count++;
        }
        return count;
    }
}
