## Java Operators

Operators are used to perform operations on variables and values.

The value is called an operand, while the operation (to be performed between the two operands) is defined by an __operator__:

Java divides the operators into the following groups:

- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators

### Arithmetic Operators

Arithmetic operators are used to perform common mathematical operations.

Operator|Name			|Description						   |Example	
--------|---------------|--------------------------------------|--------
`+`	    |Addition		|Adds together two values			   |x + y	
`-`		|Subtraction	|Subtracts one value from another	   |x - y	
`*`		|Multiplication |Multiplies two values				   |x * y	
`/`		|Division		|Divides one value from another		   |x / y	
`%`		|Modulus		|Returns the division remainder		   |x % y	
`++`	|Increment		|Increases the value of a variable by 1|++x	
`--`	|Decrement		|Decreases the value of a variable by 1|--x

Note:

++x is called preincrement(increments the value of x and then returns x) while x++ is called postincrement(returns the value of x and then increments).

```java
int x = 5, y = 5;

System.out.println(++x); // outputs 6
System.out.println(x); // outputs 6

System.out.println(y++); // outputs 5
System.out.println(y); // outputs 6
```
```java
public class Test {

  public static void main(String args[]) {
     int a = 10;
     int b = 20;
     int c = 25;
     int d = 25;
     System.out.println("b / a = " + (b / a) ); // b / a = 2
     System.out.println("b % a = " + (b % a) ); // b % a = 0
     System.out.println("c % a = " + (c % a) ); // c % a = 5
     System.out.println("a++   = " +  (a++) ); // a++ = 10
     System.out.println("a--   = " +  (a--) ); // a-- = 11
      System.out.println("a    = " +  (a) ); // a = 10
     // note that the difference between d++ and ++d
     System.out.println("d++   = " +  (d++) ); // d++ = 25
     System.out.println("++d   = " +  (++d) ); // ++d = 27
  }
} 

```

```java
public class selfAddMinus{
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("a=" + a + ", x=" + x); //a=6, x=12
        System.out.println("b=" + b + ", y=" + y); // b=6, y=10
    }
}
```


### Assignment Operators

Assignment operators are used to assign values to variables.

In the example below, we use the __assignment operator__ (`=`) to assign the value 10 to a variable called x:

```java
int x = 10;
```
The __addition assignment__ operator (`+=`) adds a value to a variable:

```java
int x = 10;
x += 5
System.out.println(x); // Outputs 15
```

A list of all assignment operators:

Operator|Example	|Same As
--------|-----------|----------
`=`		|x = 5		|x = 5	
`+=`	|x += 3		|x = x + 3	
`-=`	|x -= 3		|x = x - 3	
`*=`	|x *= 3		|x = x * 3	
`/=`	|x /= 3		|x = x / 3	
`%=`	|x %= 3		|x = x % 3	
`&=`	|x &= 3		|x = ???	
`|=`	|x |= 3		|x = ???	
`^=`	|x ^= 3		|x = ???	
`>>=`	|x >>= a	|x = x/2^a	
`<<=`	|x <<= a	|x = x*2^a	

Examples:

```java
public class MyClass {
  public static void main(String[] args) {
    int x = 5;
    x &= 3;
    System.out.println(x); // Outputs 1
  }
}

```

```java
public class MyClass {
  public static void main(String[] args) {
    int x = 5;
    x |= 3; // equals to x = x | 3
    System.out.println(x); // Outputs 7
  }
}

```

```java
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c ); // c = a + b =30
        c += a ; 
        System.out.println("c += a  = " + c ); // c += a = 40
        c -= a ;
        System.out.println("c -= a = " + c ); // c -= a = 30
        c *= a ;
        System.out.println("c *= a = " + c ); // c *= a = 300
        a = 10 ;
        c = 15 ;
        c /= a ;
        System.out.println("c /= a = " + c ); // c /= a = 1
        a = 10 ;
        c = 15 ;
        c %= a ; 
        System.out.println("c %= a  = " + c ); // c %= a = 5
        c <<= 2 ; 
        System.out.println("c <<= 2 = " + c ); // c <<= 2 = c*2^2 = 20
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c ); // c >>= 2 = 5
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c ); // c >>= 2 = 1
        c &= a ;
        System.out.println("c &= a  = " + c ); // c &= a = 0
        c ^= a ;
        System.out.println("c ^= a   = " + c ); // c ^= a = 10
        c |= a ;
        System.out.println("c |= a   = " + c ); // c |= a = 10
    }
}
```

### Comparison Operators

Comparison operators are used to compare two values:

Operator	|Name						|Example
------------|---------------------------|--------	
`==`		|Equal to					|x == y	
`!=`		|Not equal					|x != y	
`>`			|Greater than				|x > y	
`<`			|Less than					|x < y	
`>=`		|Greater than or equal to	|x >= y	
`<=`		|Less than or equal to		|x <= y

### Logical Operators

Logical operators are used to determine the logic between variables or values:

Operator	|Name						|Description
------------|---------------------------|------------------------------------------------------
`&&`			|Logical and				|Returns true if both statements are true	
`||`		|Logical or					|Returns true if one of the statements is true	
`!`			|Logical not				|Reverse the result, returns false if the result is true	


