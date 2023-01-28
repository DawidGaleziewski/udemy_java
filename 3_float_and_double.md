# double
double is default data type for real numbers in java and can store the larger number
double test = 2.9;

#float
float is the lower precision value and we cannot just assing a number literal to it. We need to use the f suffix
```java
float test = 2.9f
```

Java uses double by default and it is more beneficial in most cases to stick to it unless we are sure we do not need it.

in general it is a good ifea to just use suffixes even when we dont need them

```java
float myFloat = 5.0f;
double myDouble = 5.0d;
```

we can also use casting instead of suffix to override the default literal type
```java
float myFloat = (float)5.2; //generally bad idea. Better to use just f as it is better known
```

# math and types
when dividing numbers its important to keep floats in mind
5/2 => 2 (java will keep in mind the type)
5f/2f => 2.5 (expected result as we use floats)


# general point about real numbers
when it comes to very specific calculations neaither float or double should be used but a class called BigDecimal.


