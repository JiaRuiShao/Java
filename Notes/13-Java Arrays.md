## Java Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with __square brackets__:

```java
String[] cars;
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```

**Access**

You access an array element by referring to the index number.

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```

Note: Java is zero based. Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

**Change an Array Element**

To change the value of a specific element, refer to the index number:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo
```

**Array Length**

To find out how many elements an array has, use the __length property__:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4
```

**Loop Through an Array**

You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}
```

**Loop Through an Array with For-Each**

There is also a "__for-each__" loop, which is used exclusively to loop through elements in arrays:

```java
for (type variable : arrayname) {
  ...
}
```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```

The example above can be read like this: for each String element (called i - as in index) in cars, print out the value of i.

**Multidimensional Arrays**

A multidimensional array is an array containing one or more arrays.

To create a two-dimensional array, add each array within its own set of __curly braces__:

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```

__myNumbers__ is now an array with two arrays as its elements.

To access the elements of the __myNumbers__ array, specify two indexes: one for the array, and one for the element inside that array. 

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2];
System.out.println(x); // Outputs 7
```

This example accesses the third element (2) in the second array (1) of __myNumbers__.

We can also use a for loop inside another for loop, AKA __nested loop__ to get the elements of a two-dimensional array (we still have to point to the two indexes):

```java
public class MyClass {
  public static void main(String[] args) {
    int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
```