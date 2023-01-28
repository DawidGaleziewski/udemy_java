we install jdk (java developer kit) 17lts

for interactive code we have jshell

## jshell
to enter jshell in terminal:
```bash 
jshell
```

this starts the shell
to exit type

```bash
/exit
```

## basics

To print something out we use

```java
System.out.print("hello tim");
```

We need to use double quotes.


# primitive types
```java

// int for storing whole numbers.
int myNumber = 10; 
int myMinIntValue = Integer.MIN_VALUE; // Integer is a build in class for integer. We can access some data in it. int has only some range and cannot be assigned larger or lower value than that.
int myMaxValue = Integer.MAX_VALUE;

// Integer.MAX_VALUE + 1 this will return a negative min number. It is called value overflow. There is also a underflow possible. We need to be aware of this occuring. However if we try to assign a value that is larger it will simply throw a error. Underflows and overflows can happen when we are using expressions that are not a simple literal value, this is due to the fact that java compiler will not try to evaluate the expression. therefore this will give an error:
int test1 = 2147483648; // error
int test2 = (2147483647 + 1) // overflow

int dataWithCommas = 2_147_483_647 // this is a way of using commas in java 
```


byte for storing small numbers in range of -128 to 128.
```java
byte test = 128
```

short 
```java
short test =  -32768
```

## width of data types
each data type has its own size or width that is expressed in bits
byte - 8 bits
short - 16 bits
int - 32 bits
long - 

## numeric literal character suffix
java allows certain numeric literals to have a suffix appended to the value, to force it to be a different data type from the default value
```java
long test = 100 // 100 is an int, but long is a type that allows its suffix 'L' to be appended to the literal
long betterTest = 100L; // this way we add a suffix making it more explicit about our purpose

// when we try to assing larger numeric literal than int we HAVE to use L suffix, otherwise we will get an error
long largeLiteral = 9999999999999999999999999L;
```

## Wrapper classes for primitives
Java uses concept called wrapper classes for all its primitive types.
some of primitives and their wrapper classes
byte and Byte
short and Short
char and Character
long and Long

wrapper classes start with upper case. wrapper classes store some useful data on their types


