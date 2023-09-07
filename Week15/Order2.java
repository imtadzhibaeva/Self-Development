package Week15;

public class Order2 {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order(boolean filled, double cost, String shippingMethod) {
        if (cost> 24.00) {
            System.out.println("High value item!");
        } 
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship(){
        if(filled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        // declare a conditional statement here

    }

    public ststaic void main(String[] args){
        // do not alter the main method!
        Order book = new Order(true, 9.99, "Express");
        Order chemistrySet = new Order(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }

}
