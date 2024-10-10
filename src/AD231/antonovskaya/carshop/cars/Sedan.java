package AD231.antonovskaya.carshop.cars;

public class Sedan extends Car {
    int length;

    public Sedan(int speed, boolean isSellOut, double regularPrice, String color, int length) {
        super(speed, isSellOut, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if(length > 20){
            return regularPrice * 0.95;
        }
        return 0;
    }
}
