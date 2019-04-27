## Java Quickstart


In Java, every application begins with a class name, and that class must match the filename.

Let's create our first Java file, called MyClass.java, which can be done in any text editor (like Notepad).

The file should contain a "Hello World" message, which is written with the following code:

(File: MyClass.java)

```java
 public class MyClass {
   public static void main(String[] args) {
   System.out.println("Hello World!");
   }
 }
```

java MyClass

Hello World!

---------------------

**Notice**:

+ Every line of code that runs in Java must be inside a class. In our example, we named the class MyClass. A class should always start with an uppercase first letter.
+ Java is __case-sensitive__: "MyClass" and "myclass" has different meaning.
+ **The name of the java file must match the class name**. When saving the file, save it using the class name and add ".java" to the end of the filename.
+ Each code statement must end with a semicolon in Java
