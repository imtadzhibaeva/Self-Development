package Week5;

public class Store1 {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store1(String product, double initialPrice) {
productType = product;
price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // main method
    public static void main(String[] args) {
        Store1 lemonadeStand = new Store1("Lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
    }
    
}
