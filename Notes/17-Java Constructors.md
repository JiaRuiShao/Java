## Java Constructors

A constructor in Java is a **special method** that is used to **initialize objects**. The constructor is called when an object of a class is created. It can be used to **set initial values for object attributes**:

```java
// Create a MyClass class
public class MyClass {
  int x;  // Create a class attribute

  // Create a class constructor for the MyClass class
  public MyClass() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```

```java
public class Car {
  public Car() {
  //constructor method starts after curly brace

    //instructions for creating a Car instance

  }
  //constructor method ends after curly brace

  public static void main(String[] args) {

    // program tasks

  }
}
```

We create instances by calling or invoking the constructor within `main()`. This example assigns an instance to the variable `ferrari`:

```java
public class Car {

  public Car() {
  }

  public static void main(String[] args) {
    /*
    invoke a constructor using 
    'new', the name, and parentheses:
    new Car()
    */
    Car ferrari = new Car(); // call the constructor 
    // Variables that reference an instance have a type of the class name.
  }
}
```

We invoke the constructor method: `Car()`, and use the keyword `new` to **indicate that we’re creating an instance**. Omitting `new` causes an error.

**Note**:

- The constructor name must match the class name, and it cannot have a return type (like `void`/`int`).

- The constructor is called when the object is created.

- All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

```java
public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1998, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1998 Mustang
```


**Review the order of the printed messages**:

1. Running the program invokes `main()`
2. We create an instance so we move from `main()` to `Store()`
3. The code inside `Store()` runs
4. When `Store()` finishes execution, we return to `main()`