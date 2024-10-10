package AD231.antonovskaya.carshop.cars;

public class Ford extends Car {
    int year;
    int manufacturerDiscount;

    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, isSellOut, regularPrice, color);
        this.manufacturerDiscount = manufacturerDiscount;
        this.year = year;
    }

    @Override
    public double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }


}
