# BIT235Workshop2

BIT235 – Object Oriented Programming (OOP)
Workshop 2 – Fundamental Programming Structures in Java
Variables – Primitive Datatypes and String

## Contents

| Exercise | File | Description |
|----------|------|-------------|
| 1.1 | `src/main/java/Exercise1_1.java` | Difference of two integers entered by the user (Scanner) |
| 1.2 | `src/main/java/Exercise1_2.java` | Convert Celsius to Fahrenheit (`F = C*9/5 + 32`) |
| 1.3 | `src/main/java/Exercise1_3.java` | Area of a circle (`pi * r^2`, `Math.pow`, pi = 3.14) |
| 1.4 | `src/main/java/Exercise1_4.java` | Compound interest (`A = P * (1 + r)^n`) |
| 1.5 | `src/main/java/Exercise1_5.java` | Volume of the Earth and the Sun, and their ratio |
| 1.6 | `src/main/java/Exercise1_6.java` | Fuel consumption on normal and rough roads |
| 1.7 | `src/main/java/Exercise1_7.java` | Length and value of `"I love java programming".substring(7, 11)` |
| 1.8 | `src/main/java/Exercise1_8.java` | Compare two strings (`equals`), compare first characters (`charAt`) |

## Answers (short version)

1. **1.7** – `substring(7, 11)` starts at index 7 (the character `j`) and stops
   before index 11, so the returned string is `"java"` and its length is **4**.

2. **1.2 / 1.5** – Integer division is a common trap: `9 / 5` gives `1` and
   `4 / 3` gives `1`, so the code uses `9.0 / 5.0` and `4.0 / 3.0`.

## How to run in VS Code

1. Open the folder `BIT235Workshop2` in VS Code (**File → Open Folder**).
2. Wait a few seconds for the Java extension to finish loading the project.
3. Open any `Exercise1_x.java` file and click the **Run** (▷) button above
   `main`, or press `F5`. The result appears in the Terminal panel.
4. For Exercise 1.1 and 1.8, type the input in the terminal and press Enter.

## How to compile and run from a terminal

```bash
cd src/main/java
javac *.java
java Exercise1_1      # change the number for each exercise, e.g. java Exercise1_5
```

Requirements: JDK 8 or later.

## Sample output

```
=== Exercise 1.1 : Difference of two integers ===
Enter the first integer  : 25
Enter the second integer : 10

Calculation : 25 - 10 = 15
The difference of the two numbers is 15.
```

```
=== Exercise 1.2 : Celsius -> Fahrenheit ===
Celsius      Fahrenheit
0.00         32.00
37.00        98.60
100.00       212.00
-40.00       -40.00
```

```
=== Exercise 1.3 : Area of a circle ===
Radius     Area
1.00       3.14
2.50       19.63
5.00       78.50
10.00      314.00
12.75      510.45
```

```
=== Exercise 1.4 : Compound Interest ===
Principal (P)          : $5,000.00
Interest rate (r)      : 4% per year
Time periods (n)       : 10 years
------------------------------------------------
Formula                : A = 5000.00 * (1 + 0.04)^10
Amount (A)             : $7,401.22
Interest earned        : $2,401.22
------------------------------------------------
After 10 years, $5,000.00 grows to $7,401.22.
```

```
=== Exercise 1.5 : Volume of the Earth and the Sun ===
Sun diameter           : 865,000 miles
Earth diameter         : 7,600 miles
-----------------------------------------------------
a) Volume of the Earth : 229,730,773,333.33 cubic miles
b) Volume of the Sun   : 3.3871e+17 cubic miles
c) Sun / Earth ratio   : 1,474,373.60
-----------------------------------------------------
The Sun is about 1,474,373.60 times larger than the Earth.
```

```
=== Exercise 1.6 : Fuel Consumption ===
Tank capacity                : 40 litres
Normal road consumption      : 8.00 L / 100 km
Rough road consumption       : 9.20 L / 100 km (15% more)
--------------------------------------------------
Distance on normal roads     : 500.00 km
Distance on rough roads      : 434.78 km
Difference                   : 65.22 km
```

```
=== Exercise 1.7 : String substring ===
Original string      : "I love java programming"
Index of each char   : 0123456789012345678901
                       I love java programming
substring(7, 11)     : "java"
Length of the string : 4 characters

Answer: the returned string is "java" and its length is 4.
```

```
=== Exercise 1.8 : Compare two strings ===
Enter the first string  : Java
Enter the second string : Python

First string  : "Java"
Second string : "Python"
The two given strings are equal: false
First character of string 1 : 'J'
First character of string 2 : 'P'
The first characters are the same: false
```
