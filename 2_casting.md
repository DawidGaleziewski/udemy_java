# Casting in Java

we can declare multiple variables with same data type in one statment

```java
int valueOne = 2, valueTwo = 15, myAge = 20;
```

when assigning values from variables, java compiler will not know in some examples if the value fits the variable and will throw an error:
```java
byte minByteValue = Byte.MIN_VALUE;
byte newByteValue = (minByteValue/2); // throws error about loosy conversion

```

# casting - converting from one type to another

```java
byte myNewByteValue = (byte) (myMinByteValue/2); // we use (byte) to cast byte type onto result of the equation. Telling java what type it will be
```
