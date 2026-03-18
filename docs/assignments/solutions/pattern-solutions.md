# Pattern Programming – Solutions

This document contains solutions and explanations for the pattern problems.

The numbering here **matches exactly with the practice problems**.

---

# Pattern 1

```
*
**
***
****
*****
```

## Logic

- Each row prints stars equal to the row number.
- Row 1 → 1 star
- Row 2 → 2 stars
- Row 3 → 3 stars

Outer loop controls rows.  
Inner loop prints stars.

## Java Program

```java
for(int i = 1; i <= 5; i++) {

    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

# Pattern 2

```
*****
****
***
**
*
```

## Logic

Stars decrease each row.

Row 1 → 5 stars  
Row 2 → 4 stars

## Java Program

```java
for(int i = 5; i >= 1; i--) {

    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

# Pattern 3

```
*
**
***
****
*****
****
***
**
*
```

## Logic

Two parts:

1. Increasing stars
2. Decreasing stars

## Java Program

```java
for(int i = 1; i <= 5; i++) {

    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}

for(int i = 4; i >= 1; i--) {

    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

# Pattern 4

```
1
12
123
1234
12345
```

## Logic

Numbers increase from **1 to row number**.

Row 4 prints:

```
1234
```

## Java Program

```java
for(int i = 1; i <= 5; i++) {

    for(int j = 1; j <= i; j++) {
        System.out.print(j);
    }

    System.out.println();
}
```

---

# Pattern 5

```
1
22
333
4444
55555
```

## Logic

Row number is printed repeatedly.

Row 4 prints:

```
4444
```

## Java Program

```java
for(int i = 1; i <= 5; i++) {

    for(int j = 1; j <= i; j++) {
        System.out.print(i);
    }

    System.out.println();
}
```

---

# Pattern 6

```
1
21
321
4321
54321
```

## Logic

Numbers decrease from the row number down to 1.

Row 4 prints:

```
4321
```

## Java Program

```java
for(int i = 1; i <= 5; i++) {

    for(int j = i; j >= 1; j--) {
        System.out.print(j);
    }

    System.out.println();
}
```

---

# Pattern 7

```
1
23
456
78910
```

## Logic

Numbers continue increasing using a variable.

## Java Program

```java
int num = 1;

for(int i = 1; i <= 4; i++) {

    for(int j = 1; j <= i; j++) {
        System.out.print(num);
        num++;
    }

    System.out.println();
}
```

---

# Pattern 8

```
A
AB
ABC
ABCD
ABCDE
```

## Logic

Characters increase each row.

## Java Program

```java
for(char i = 'A'; i <= 'E'; i++) {

    for(char j = 'A'; j <= i; j++) {
        System.out.print(j);
    }

    System.out.println();
}
```

---

# Pattern 9

```
ABCDE
ABCD
ABC
AB
A
```

## Logic

Characters decrease each row.

## Java Program

```java
for(int i = 5; i >= 1; i--) {

    for(int j = 0; j < i; j++) {
        System.out.print((char)('A' + j));
    }

    System.out.println();
}
```

---

# Pattern 10

```
    *
   **
  ***
 ****
*****
```

## Logic

Two parts:

1. Print spaces
2. Print stars

Spaces decrease every row.

## Java Program

```java
for(int i = 1; i <= 5; i++) {

    for(int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
    }

    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

# Pattern 11

```
*****
 ****
  ***
   **
    *
```

## Logic

Spaces increase and stars decrease.

## Java Program

```java
for(int i = 5; i >= 1; i--) {

    for(int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
    }

    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

# Pattern 12

```
    *
   ***
  *****
 *******
*********
```

## Logic

Stars follow formula:

```
2 * row - 1
```

## Java Program

```java
for(int i = 1; i <= 5; i++) {

    for(int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
    }

    for(int j = 1; j <= 2*i - 1; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

# Pattern 13

```
    1
   121
  12321
 1234321
123454321
```

## Logic

Three parts:

1. spaces
2. increasing numbers
3. decreasing numbers

## Java Program

```java
for(int i = 1; i <= 5; i++) {

    for(int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
    }

    for(int j = 1; j <= i; j++) {
        System.out.print(j);
    }

    for(int j = i - 1; j >= 1; j--) {
        System.out.print(j);
    }

    System.out.println();
}
```

---

# Pattern 14

```
1
10
101
1010
10101
```

## Logic

Alternate 1 and 0.

## Java Program

```java
for(int i = 1; i <= 5; i++) {

    for(int j = 1; j <= i; j++) {

        if(j % 2 == 1)
            System.out.print("1");
        else
            System.out.print("0");
    }

    System.out.println();
}
```

---

# Pattern 15

```
1
2 3
4 5 6
7 8 9 10
```

## Logic

Numbers increase continuously.

## Java Program

```java
int num = 1;

for(int i = 1; i <= 4; i++) {

    for(int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
    }

    System.out.println();
}
```