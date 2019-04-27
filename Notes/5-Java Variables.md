## Java Variables

There are different types of variables in Java, for example:

+ __String__ - stores text, such as "Hello". String values are surrounded by double quotes
+ __int__ - stores integers (whole numbers), without decimals, such as 123 or -123
+ __float__ - stores floating point numbers, with decimals, such as 19.99 or -19.99
+ __char__ - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
+ __boolean__ - stores values with two states: true or false

**1. Declaring (Creating) Variables**

To create a variable, you must specify the type and assign it a value:

> *type variable_name = value*;

```java
String name = "Jesse Shao";
System.out.println(name);
```

```java
int myNum = 15;
System.out.println(myNum);
```
which could also write as:
```java
int myNum;
myNum = 15;
System.out.println(myNum);
```

Other types of variables:

```java
int myNum = 11;
float myFloatNum = 6.66f;
char myLetter = 'C';
boolean myBool = true;
String myText = "Yooooooooo~";
```

**2. Display Variables**

The `println()` method is often used to display variables.

To combine both text and a variable, use the `+`character:

```java
String name = "Jesse";
System.out.println("What's up " + name + "!");
```

You can also use the `+` character to add a variable to another variable:

```java
String firstName = "Jesse";
String lastName = "Shao";
String fullName = firstName + lastName;
System.out.println(fullName);
```

For numeric values, the `+` character works as a mathematical operator (notice that we use int (integer) variables here):

```java
int x = 5;
int y = 6;
System.out.println(x + y); // Print the value of x + y
```

**3. Declare Many Variables**

To declare more than one variable of the __same type__, use a comma-separated list:

```java
int x = 5, y = 6, z = 55;
System.out.println(x + y + z);
```

**4. Java Identifiers**

**All Java variables must be identified with unique names.** These unique names are called __identifiers__.

Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

The general rules for constructing names for variables (unique identifiers) are:

- Names can contain letters, digits, underscores, and dollar signs
- Names should begin with a letter
- Names can also begin with $ and _ (but we will not use it in this tutorial)
- Names are case sensitive ("myVar" and "myvar" are different variables)
- Names should start with a lowercase letter and it cannot contain whitespace
- Reserved words (like Java keywords, such as `int` or `String`) cannot be used as names
