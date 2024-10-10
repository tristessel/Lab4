package AD231.antonovskaya.carshop.cars;

public abstract class Car {
     int speed;
     boolean isSellOut;
     double regularPrice;
     String color;

     public Car(int speed, boolean isSellOut, double regularPrice, String color) {
          this.speed = speed;
          this.isSellOut = isSellOut;
          this.regularPrice = regularPrice;
          this.color = color;
     }

     public abstract double getSalePrice();

     public int getSpeed() {
          return speed;
     }

     public boolean isSellOut() {
          return isSellOut;
     }

     public double getRegularPrice() {
          return regularPrice;
     }

     public String getColor() {
          return color;
     }

     public void setSellOut(boolean sellOut) {
          isSellOut = sellOut;
     }
}
