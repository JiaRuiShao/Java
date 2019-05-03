## Java Classes

### I. Classes & Objects

Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has **attributes**, such as weight and color, and **methods**, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

1. **Create a Class**

```java
public class MyClass {
  int x = 5;
}
```

Note: a class should always start with an uppercase first letter, and that the name of the java file should match the class name.

2. **Create an Object**

```java
public class MyClass {
  int x = 5;
  int y = 10;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // Object 1
    MyClass myObj2 = new MyClass();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.y);
  }
}
```

You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the `main()` method (code to be executed)).

```java
// Under MyClass.java
public class MyClass{
	int x = 5; // attribute in class MyClass
}

// Under OtherClass.java
public class OtherClass{
	public static void main(String[] args) {
	MyClass myObj = new MyClass();
	System.out.println(myObj.x);
	}
}
```

### II. Class Attributes/Variables/fields

1. **Accessing Attributes**

You can access attributes by creating an object of the class, and by using the dot syntax (`.`):

```java
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
```

2. **Modify Attributes**

Set the value of x to 66:

```java
public class MyClass {
  int x;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 66; // x is now 66
    System.out.println(myObj.x);
  }
}
```

Override existing values:

```java
public class MyClass {
  int x = 11;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 55; // x is now 55
    System.out.println(myObj.x); 
  }
}
```

If you don't want the ability to override existing values, declare the attribute as `final`:

The `final` keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

```java
public class MyClass {
  final int x = 10;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x); 
  }
}
```

If you create **multiple objects of one class**, you can change the attribute values in one object, without affecting the attribute values in the other:

```java
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // Object 1
    MyClass myObj2 = new MyClass();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
```


### III. Class Methods

1. **Create and call a method**

Create a method named myMethod() in MyClass:

```java
public class MyClass {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod(); //Outputs "Hello World!"
  }
}
```

`myMethod()` prints a text (the action), when it is **called**. To call a method, write the method's name followed by two parentheses **()** and a semicolon;

2. **Static or Public**

You will often see Java programs that have either static or public attributes and methods.

The differences between static and public method:

```java
public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
```

Example:

```java
// Create a Car class
public class Car {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method/function
    myCar.speed(200);          // Call the speed() method/function
  }
}

// The car is going as fast as it can!
// Max speed is: 200

```

Note: 

- `main()` method, which is a built-in Java method that runs your program (any code inside main is executed).

- The dot (`.`) is used to __access the object's attributes and methods__.

- To call a (static) method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (`;`).

- To call a (public) method in Java, object_name.method_name();

- A class must have a matching filename (Car and Car.java).

