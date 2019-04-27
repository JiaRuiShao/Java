
**1. The main method**

The `main()` method is required and you will see it in every Java program:

```java
public static void main(String[] args)

```
__Any code inside the `main()` method will be executed__. You don't have to understand the keywords before and after main. You will get to know them bit by bit while reading this tutorial.

For now, just remember that:

- every Java program has a class name which must match the filename
- every program must contain the main() method


**2. System.out.println()**

Inside the `main()` method, we can use the `println()` method to print a line of text to the screen:

`println` is short for “print line”. We’ll use `System.out.println()` whenever we want a program to write a message to the screen.

```java
public static void main(String[] args) {
  System.out.println("Hello World");
}
```
**3. String[] args** 

String[] args is a placeholder for information we want to pass into our program.
