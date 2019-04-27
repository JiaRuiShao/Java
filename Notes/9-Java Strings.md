## 9-Java Strings

**String**

A String contains a collection of characters surrounded by double quotes:

**String Length**

A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the `length()` method:

```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length()); // Outputs: The length of the txt string is: 26
```

**More String Methods**

There are many string methods available, for example `toUpperCase()` and `toLowerCase()`:

```java
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"
```

**Finding a String in a String**

The `indexOf()` method returns the index (the position) of the first occurrence of a specified text in a string (__including whitespace__):

```java
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
```

Note: Java is zero based.

**String Concatenation**

The `+` operator can be used between strings to add them together to make a new string. This is called concatenation:

```java
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName); //Output: John Doe
```

You can also use the `concat()` method to concatenate two strings:

```java
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName)); // Output: John Doe
```

**Special Characters**

Because strings must be written within quotes, Java will misunderstand this string, and generate an error:

```java
String txt = "We are the so-called "Vikings" from the north.";
```

The solution to avoid this problem, is to use the _backslash escape character_.

__The backslash (`\`) escape character turns special characters into string characters__:

Escape character	|Result	|Description
--------------------|-------|------------
`\'`	|`'`	|Single quote
`\"`	|`"`	|Double quote
`\\`	|`\`	|Backslash

```java
String txt = "We are the so-called \"Vikings\" from the north."; // We are the so-called "Vikings" from the north.

String txt = "It\'s alright."; // It's alright.

String txt = "The character \\ is called backslash."; // The character \ is called backslash.
```

Code	|Result
--------|---------
`\n`	|New Line	
`\r`	|Carriage Return	
`\t`	|Tab	
`\b`	|Backspace	
`\f`	|Form Feed

**Complete String Reference**

For a complete reference of String methods, go to our [Java String Methods Reference](https://www.w3schools.com/java/java_ref_string.asp).

The reference contains descriptions and examples of all string methods.


