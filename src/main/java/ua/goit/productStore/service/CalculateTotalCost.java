package ua.goit.productStore.service;

import ua.goit.productStore.repository.DataBase;

public class CalculateTotalCost {
    private final DiscountSystem discountSystem = new DiscountSystem();
    private final DataBase dataBase = new DataBase();

    public double getResult(String data) {
        return discountSystem.getPriceWithDiscount(data, dataBase.getProductA()) +
                discountSystem.getPriceWithDiscount(data, dataBase.getProductB()) +
                discountSystem.getPriceWithDiscount(data, dataBase.getProductC()) +
                discountSystem.getPriceWithDiscount(data, dataBase.getProductD());
    }
}
