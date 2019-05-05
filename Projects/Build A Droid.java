// Build A Droid

public class Droid {
  int batteryLevel; 
  String name;
  
  public String toString(){
    return "Hello, I’m the droid: " + name + "!";
  }
  
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }
  
  public Droid(String droidName){// constructor
    name = droidName;
    batteryLevel = 100;
  }

  public static void main(String[] args) {
    Droid mydroid = new Droid("Codey");
    mydroid.toString();
    System.out.println(mydroid.batteryLevel);
    mydroid.performTask("cleaning");
		System.out.println(mydroid.batteryLevel);

    mydroid.performTask("levitating");
    System.out.println(mydroid.batteryLevel);

  }
}
