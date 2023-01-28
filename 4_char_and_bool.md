# char
char is used to store only one single character and we need to use single quotes

```java
char test = 'D';
```

width of char is 16 bits. Char is stored as a 2 byte number, similar to short. Java uses unicode underneath.
We can type in the unicode of char to get it

```java
char myUnicode = '\u0044'; // returns D
char myUnicode2 = 68; // decimal number for D

char question = '?', question2 = '\u003f', question3 = 63 // saving ? in 3 formats
```

# string
is a bit special. It is a class that contains a sequence of characters.
Unlike other primitive data types we use String class to declare a variable of type string

```java
String someTextHere = "Howdy there!"; // we need to use double quotes for strings
```

# boolean
```java
boolean isFun = true;
```

