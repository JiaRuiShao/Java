## Java Booleans

Very often, in programming, you will need a data type that can only have one of two values, like:

- YES / NO
- ON / OFF
- TRUE / FALSE

For this, Java has a `boolean` data type, which can take the values `true` or `false`.

A boolean type is declared with the boolean keyword and can only take the values true or false:

```java
boolean isJavaFun = true;
System.out.println(isJavaFun);     // Outputs true
```

### Boolean Expression

A __Boolean expression__ is a Java expression that returns a Boolean value: `true` or `false`.

You can use a comparison operator, such as the greater than (`>`) operator to find out if an expression (or a variable) is true:

```java
int x = 10;
int y = 9;
System.out.println(x > y); // returns true, because 10 is higher than 9

int x = 10;
System.out.println(x == 10); // returns true, because the value of x is equal to 10
```

OR

```java
System.out.println(10 > 9); // returns true, because 10 is higher than 9

System.out.println(10 == 15); // returns false, because 10 is not equal to 15

```

### Boolean Operators: Precedence

The three Boolean operators `&&`, `||`, and `!` can also be used together and used multiple times to form larger Boolean expressions.

However, just like numerical operators, Boolean operators follow rules that specify the order in which they are evaluated. This order is called **Boolean operator precedence**.

The __precedence__ of each Boolean operator is as follows:

1. ! is evaluated first
2. && is evaluated second
3. || is evaluated third

Like numerical expressions, every expression within parentheses is evaluated first. Expressions are also read from left to right.

The following statement demonstrates how Boolean operator precedence works:

```java
System.out.println( !(false) || true && false);
```

The example above will print out `true`. In order, the expression is evaluated as follows:

1. First, the `!` Boolean operator in `!(false)` returns `true`.
2. Second, `true && false` evaluates to `false`.
3. Finally, the remaining expression `true || false` evaluates to true.