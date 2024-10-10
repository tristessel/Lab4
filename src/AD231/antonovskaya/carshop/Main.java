package AD231.antonovskaya.carshop;

import AD231.antonovskaya.carshop.impl.MyOwnAutoShop;

public class Main {
    public static void main(String[] args) {
        MyOwnAutoShop autoShop = new MyOwnAutoShop();

        System.out.println("Total income: " + autoShop.getIncome());
        System.out.println("Car colors: " + autoShop.getCarColors());
        System.out.println("Price of car with ID 1: " + autoShop.getCarPrice(1));
        System.out.println("Total cars price: " + autoShop.getCarsPrice());
        System.out.println("Color of car with ID 1: " + autoShop.getCarColor(1));

        autoShop.purchaseCar(1);
    }
}
