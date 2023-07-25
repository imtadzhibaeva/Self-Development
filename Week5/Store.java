package Week5;

public class Store {
    // Adding parameters

    // instance fields
    String productType;

    // constructor method
    public Store(String product) {
        productType = product;
    }
     // greetCustomer method
     public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
     }

     // advertise method
     public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
     }

     // main method
     public static void main(String[] args) {
        Store lemonadeStand = new Store ("Lemonade");
        lemonadeStand.greetCustomer("Madina");
     }

    
}
