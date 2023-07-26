package Week5;

public class Store2 {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store2(String product, double initialPrice) {
        productType = product;
        price = initialPrice;

    }

    // increase price method
    public void initialPrice(double priceToAdd){
        double newPrice = price +priceToAdd;
        price = newPrice;
    }

    // get pricewith tax method
  
    // main method
    public static void main(String[] args) {
        Store2 lemonadeStand = new Store2("Lemonade", 3.75);
        
    }
    

}
