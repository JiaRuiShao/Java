## Java Loop

### 1. While Loop

The `while` loop loops through a block of code as long as a specified condition is `true`:

**While Loop**

```java
while (condition) {
  // code block to be executed
}
```

```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```

**The Do/While Loop**

The `do/while` loop is a variant of the `while` loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

```java
do {
  // code block to be executed
}
while (condition);
```

The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested.

```java
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
```

### 2. For Loop

The `for` loop loops through a block of code a number of times.

**Syntax**

```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```

__Statement 1__ is executed (one time) before the execution of the code block.

__Statement 2__ defines the condition for executing the code block.

__Statement 3__ is executed (every time) after the code block has been executed.

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

**For-Each Loop**

There is also a "__for-each__" loop, which is used exclusively to loop through elements in an __array__:

```java
for (type variable : arrayname) {
  // code block to be executed
}
```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

```
