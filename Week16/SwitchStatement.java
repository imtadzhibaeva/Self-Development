package Week16;

public class SwitchStatement {

    boolean isFilled;
    double billAmount;
    String shipping;
    
  
    public SwitchStatement(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
       
    }
     public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
     }

     public double calculateShipping() {
        double shippingCost;
        // declare switch statement here

        return shippingCost;
     }
     public static void main(String[] args) {
        // do not alter the main method!
       
}
}
