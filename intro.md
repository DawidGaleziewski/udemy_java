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

## Wrapper classes for primitives
Java uses concept called wrapper classes for all its primitive types.
some of primitives and their wrapper classes
byte and Byte
short and Short
char and Character
long and Long

wrapper classes start with upper case. wrapper classes store some useful data on their types


