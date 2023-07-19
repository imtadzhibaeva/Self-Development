package Week4;

public class Store1 {
    // instance fields
    String productType;
    // new instance fields
    int inventoryCount;
    double inventoryPrice;


    // constructor method
    public Store1(String product, int count, double price) {
        productType = product;
        // new parameters
        inventoryCount = count;
        inventoryPrice = price;

    }
// main method
    public static void main(String[] args){
// Store1 lemonadeStand = new Store1 ("lemonade");
// System.out.println(lemonadeStand.productType);

Store1 cookieShop = new Store1 ("cookie", 12, 3.75);
System.out.println(cookieShop.productType);
System.out.println(cookieShop.inventoryCount);
System.out.println(cookieShop.inventoryPrice);
    }
;

}
