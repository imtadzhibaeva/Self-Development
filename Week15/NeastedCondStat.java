package Week15;

public class NeastedCondStat {
    boolean isFilled;
    double billAmount;
    String shipping;
    String coupoCode;
  
    public NeastedCondStat(boolean filled, double cost, String shippingMethod, String coupon) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        
    }
}
