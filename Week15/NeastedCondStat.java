package Week15;

public class NeastedCondStat {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;
  
    public NeastedCondStat(boolean filled, double cost, String shippingMethod, String coupon) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shippingMethod = shippingMethod;
        couponCode = coupon;
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
        if (shipping.equals("Regular")) {
            return 0;
        } else if (shipping.equals("Express")) {

        } else {
            return .50;
        }
     }
}