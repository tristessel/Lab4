package AD231.antonovskaya.carshop.impl;

import AD231.antonovskaya.carshop.cars.Car;
import AD231.antonovskaya.carshop.cars.Ford;
import AD231.antonovskaya.carshop.cars.Sedan;
import AD231.antonovskaya.carshop.cars.Truck;
import AD231.antonovskaya.carshop.interfaces.Admin;
import AD231.antonovskaya.carshop.interfaces.Customer;

public class MyOwnAutoShop implements Admin, Customer {
    Sedan sedan;
    Ford ford1, ford2;
    Truck truck1, truck2;
    Car[] cars;

    public MyOwnAutoShop() {
        sedan = new Sedan(180, false, 20000, "Red", 22);
        ford1 = new Ford(150, false, 25000, "Blue", 2022, 100);
        ford2 = new Ford(170, true, 22000, "Green", 2021, 50);
        truck1 = new Truck(120, false, 28000, "White", 3000);
        truck2 = new Truck(110, true, 26000, "Black", 1500);

        cars = new Car[5];
        cars[0] = sedan;
        cars[1] = ford1;
        cars[2] = ford2;
        cars[3] = truck1;
        cars[4] = truck2;
    }

    private Car getCarById(int id){
        return cars[id-1];
    }

    @Override
    public double getCarsPrice() {
        return getIncome();
    }

    @Override
    public String getCarColors() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<cars.length; i++){
            sb.append(cars[i].getColor());
            if(i != cars.length-1){
                sb.append(", ");
            }
        }
       return String.valueOf(sb);
    }

    @Override
    public double getCarPrice(int id) {
       return getCarById(id).getSalePrice();
    }

    @Override
    public String getCarColor(int id) {
        return getCarById(id).getColor();
    }

    @Override
    public void purchaseCar(int id) {
        getCarById(id).setSellOut(true);
        System.out.println("Car with ID " + id + " is purchased: " + getCarById(id).isSellOut());
    }

    @Override
    public double getIncome() {
        double sumIncome = 0;
       for(Car car: cars){
           sumIncome+=car.getSalePrice();
       }
       return sumIncome;
    }
}
