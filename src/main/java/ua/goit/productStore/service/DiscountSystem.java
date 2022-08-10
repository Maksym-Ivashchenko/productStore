package ua.goit.productStore.service;

import ua.goit.productStore.model.Products;

public class DiscountSystem extends NumberOfProducts {
    private Double getSalePrice(Products products){
        if (products.getProductDiscount() == 0.0)
            return 0.0;
        return products.getProductDiscount() / products.getProductQuantity();
    }
    public Double getPriceWithDiscount(String productString, Products products){
        NumberOfProducts numberOfProducts = new NumberOfProducts();
        double d = getSalePrice(products);
        double price = products.getProductPrice();
        double quantity = numberOfProducts.getNumberOfProduct(productString, products);
        double count = quantity;
        double countSale = products.getProductQuantity();
        if (countSale == 0) {
            return quantity * price;
        } else
            while (countSale <= quantity) {
                countSale = countSale + products.getProductQuantity();
                if (count >= products.getProductDiscount()){
                    count = count - products.getProductQuantity();
                }
            }
        return (count * price) + ((countSale - products.getProductQuantity()) * d);
    }
}
