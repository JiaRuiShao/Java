## Java Packages

A package in Java is used to group related classes. Think of it as __a folder in a file__ directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

- Built-in Packages (packages from the Java API)
- User-defined Packages (create your own packages)

### I. Built-in Package

The library contains components for managing input, database programming, and much much more. The complete list can be found at [Oracles website](https://docs.oracle.com/javase/8/docs/api/)

The library is divided into __packages__ and __classes__. Meaning you can either import a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.

To use a class or a package from the library, you need to use the `import` keyword:

```java
import package.name.Class; // Import a single class 
import package.name.*; // Import the whole package
```

1. **Import a Class**

If you find a class you want to use, for example, the `Scanner` class, which is used to get user input, write the following code:

```java
import java.util.Scanner;
```

In the example above, `java.util` is a package, while `Scanner` is a class of the `java.util` package.

To use the `Scanner` class, create an object of the class and use any of the available methods found in the `Scanner` class documentation. In our example, we will use the `nextLine()`` method, which is used to read a complete line:

```java
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine(); 
    System.out.println("Username is: " + userName); 
  }
}
```

2. **Import a Package**

To import a whole package, end the sentence with an asterisk sign (`*`). The following example will import ALL the classes in the `java.util` package:

```java
import java.util.*;
```

### II. User-defined Packages

To create your own package, you need to understand that Java use a file system directory to store them. Just like folders on your computer:

```
└── root
  └── mypack
    └── MyPackageClass.java
```

