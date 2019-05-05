public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // advertise method
  public void advertise() {
    System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
  // greet customers
  public void greetCustomer(String customer){
    System.out.println("Welcome to the store, " + customer + "!");
  }

  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // get price with tax method
  public double getPriceWithTax(){
    double totalPrice = price + price * 0.08;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    lemonadeStand.advertise();
    lemonadeStand.greetCustomer("Jesse");

    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);

    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
  }
}

// Output:
// Selling Lemonade!
// Come spend some money!
// Welcome to the store, Jesse!
// 5.25
// 5.67
