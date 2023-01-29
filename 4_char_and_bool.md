# char
char is used to store only one single character and we need to use single quotes

```java
char test = 'D';
```

width of char is 16 bits. Char is stored as a 2 byte number, similar to short. Java uses unicode underneath.
We can type in the unicode of char to get it
Chars are stored as 2 byte numbers in memory. Adding two chars will not concatenate them! It will result in a number

```java
   ...>     char test1 = 'A';
   ...>     char test2= 'B';
   ...>     System.out.print(test1 + test2); // => 131
	
// we can fix it by chagning data type to string
	System.out.print("" + test1 + test2); // => AB
```

```java
char myUnicode = '\u0044'; // returns D
char myUnicode2 = 68; // decimal number for D

char question = '?', question2 = '\u003f', question3 = 63 // saving ? in 3 formats
```

# string
is a bit special. It is a class that contains a sequence of characters. In practice we use it as a primitive type, despite the fact it is not, it is a class.
Unlike other primitive data types we use String class to declare a variable of type string

```java
String someTextHere = "Howdy there!"; // we need to use double quotes for strings
String textWithUnicode = "I have \u002411,000,00.00 on my credit card" // we can use unicode notation and string will compliate this to unicode characters
```
Strings are immutable in java same as in javascript. (new string is created each time we do concatenation).
If we do heavy operations on strings the StringBuilder class is much better for this purpose.

# boolean
```java
boolean isFun = true;
```

