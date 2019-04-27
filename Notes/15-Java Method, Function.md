## Java Method/Function

A __method__ is a block of code which only runs when it is called.

You can pass data, known as __parameters__, into a method.

Methods are used to perform certain actions, and they are also known as __functions__.

#### Create a Method

A method must be __declared within a class__. It is defined with the name of the method, followed by __parentheses()__.

```java
public class MyClass {
  static void myMethod() {
    // code to be executed
  }
}
```

- `myMethod()` is the name of the method
- `static` means that the method belongs to the MyClass class and not an object of the MyClass class. You will learn more about objects and how to access methods through objects later in this tutorial.
- `void` means that this method does not have a return value. You will learn more about return values later in this chapter

#### Call a Method

To call a method in Java, write the method's name followed by two __parentheses()__ and a semicolon;

In the following example, `myMethod()` is used to print a text (the action), when it is called:

```java
public class MyClass {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod(); // Inside main, call the myMethod() method:
  }
}

// Outputs "I just got executed!"

```


#### Method Parameters

Information can be passed to functions as parameter.

Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

The following example has a method that takes a `String` called __fname__ as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:

```java
public class MyClass {
  static void myMethod(String fname) {
    System.out.println(fname + " Shao");
  }

  public static void main(String[] args) {
    myMethod("Jesse");
    myMethod("Larry");
    myMethod("Anja");
  }
}
// Jesse Shao
// Larry Shao
// Anja Shao
```


#### Return Values

The `void` keyword, used in the examples above, indicates that the method __should not return a value__. If you want the method to return a value, you can use a __primitive data type__ (such as `int`, `char`, etc.) 

Instead of `void`, and use the `return` keyword inside the method:

```java
public class MyClass {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
// Outputs 8 (5 + 3)

public class MyClass {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}
// Outputs 8 (5 + 3)
```

You can also store the result in a variable (recommended):

```java
public class MyClass {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int z = myMethod(5, 3);
    System.out.println(z);
  }
}
// Outputs 8 (5 + 3)
```

#### A Method with If...Else

It is common to use `if...else` statements inside methods:

```java
public class MyClass {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!"); 

    // If age is greater than 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!"); 
    }

  } 

  public static void main(String[] args) { 
    checkAge(20); // Call the checkAge method and pass along an age of 20
  } 
}

// Outputs "Access granted - You are old enough!"
```

