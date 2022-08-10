package ua.goit.productStore.repository;

import ua.goit.productStore.model.Products;

public class DataBase {
    private final Products productA = new Products("A", 1.25, 3, 3.0);
    private final Products productB = new Products("B", 4.25, 0, 0.0);
    private final Products productC = new Products("C", 1.0, 6, 5.0);
    private final Products productD = new Products("D", 0.75, 0, 0.0);

    public Products getProductA() {
        return productA;
    }

    public Products getProductB() {
        return productB;
    }

    public Products getProductC() {
        return productC;
    }

    public Products getProductD() {
        return productD;
    }
}
