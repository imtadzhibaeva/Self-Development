package Week4;

public class Store2 {
    // instance field
    String productType;

    // constructor method
    public Store2(String product){
        productType = product;
    }

    // advertise method
    public void advertise(){
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }

    // main method 
public static void main(String[] args) {
    String cookie = "Cookies";
    Store2 cookieShop = new Store2(cookie);

    cookieShop.advertise();
}
}
