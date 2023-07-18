package Week4;

public class Store {
  // new method: constructor!
  public Store() {
    System.out.println("I am inside the constructor method.");

  }  
  // main method is where we create instances!
  public static void main(String[] args) {
    Store lemonadeStand = new Store();
    System.out.println(lemonadeStand);
    System.out.println("Start of the main method.");
  }
}
