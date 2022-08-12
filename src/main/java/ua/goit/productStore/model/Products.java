package ua.goit.productStore.model;

import java.util.*;

public class Products {
    private final String productName;
    private final Double productPrice;
    private final Double productDiscount;
    private final Integer productQuantity;

    public Products(String productName, double productPrice, int productQuantity, double productDiscount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productDiscount = productDiscount;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Double getProductDiscount() {
        return productDiscount;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(productName, products.productName)
                && Objects.equals(productPrice, products.productPrice)
                && Objects.equals(productDiscount, products.productDiscount)
                && Objects.equals(productQuantity, products.productQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, productDiscount, productQuantity);
    }
}
