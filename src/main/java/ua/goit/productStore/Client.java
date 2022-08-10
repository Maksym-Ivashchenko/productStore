package ua.goit.productStore;

import ua.goit.productStore.service.CalculateTotalCost;

public class Client {
    public static void main(String[] args) {
        CalculateTotalCost calculateTotalCost = new CalculateTotalCost();

        System.out.println(calculateTotalCost.getResult("ABCDABA"));
        System.out.println(calculateTotalCost.getResult("BD"));

    }
}
