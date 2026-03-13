# Practice Problems – Conditional Statements

These problems are designed to strengthen your understanding of:

- Variables and data types
- Taking input using Scanner
- if statements
- if-else statements
- if-else-if statements
- nested if conditions
- switch statements

The problems are arranged in **increasing difficulty**.

---

# Level 1 – Basic Conditions

## 1. Even or Odd

Write a program to check whether a number is **even or odd**.

Example:

Input:
```
8
```

Output:
```
Even
```

---

## 2. Positive or Negative

Write a program that checks whether a number is **positive or negative**.

Example:

Input:
```
-5
```

Output:
```
Negative
```

---

## 3. Voting Eligibility

Write a program that checks whether a person is eligible to vote.

Condition:
A person is eligible if age is **18 or above**.

Example:

Input:
```
Age = 20
```

Output:
```
Eligible to vote
```

Example 2:

Input:
```
Age = 15
```

Output:
```
Not eligible to vote
```

---

## 4. Largest of Two Numbers

Write a program that finds the **largest of two numbers**.

Example:

Input:
```
10
25
```

Output:
```
25 is larger
```

---

## 5. Temperature Check

Write a program that classifies temperature as:

- Hot
- Moderate
- Cold

Conditions:

Temperature > 30 → Hot  
Temperature between 20 and 30 → Moderate  
Temperature < 20 → Cold

Example:

Input:
```
Temperature = 35
```

Output:
```
Hot
```

---

# Level 2 – Multiple Conditions

## 6. Student Grade Calculator

Write a program that prints the grade based on marks.

Conditions:

Marks >= 90 → Grade A  
Marks >= 75 → Grade B  
Marks >= 50 → Grade C  
Marks < 50 → Fail

Example:

Input:
```
Marks = 82
```

Output:
```
Grade B
```

---

## 7. Largest of Three Numbers

Write a program that finds the **largest among three numbers**.

Example:

Input:
```
10
45
30
```

Output:
```
45 is the largest number
```

---

## 8. Number Classification

Write a program that classifies a number as:

- Positive
- Negative
- Zero

Example:

Input:
```
0
```

Output:
```
Zero
```

---

## 9. Divisible by 5 Check

Write a program that checks whether a number is divisible by **5**.

Example:

Input:
```
25
```

Output:
```
Divisible by 5
```

Example 2:

Input:
```
23
```

Output:
```
Not divisible by 5
```

---

## 10. Pass or Fail

Write a program that checks whether a student has passed or failed.

Condition:

Marks >= 40 → Pass  
Marks < 40 → Fail

Example:

Input:
```
Marks = 55
```

Output:
```
Pass
```

---

# Level 3 – Logical Thinking

## 11. Leap Year Check

Write a program to check whether a year is a **leap year**.

Rules:

- Year divisible by 4 → Leap year
- Year divisible by 100 → Not leap year
- Year divisible by 400 → Leap year

Example:

Input:
```
2024
```

Output:
```
Leap Year
```

Example 2:

Input:
```
2023
```

Output:
```
Not a Leap Year
```

---

## 12. Age Category

Write a program that categorizes a person's age.

Conditions:

0–12 → Child  
13–19 → Teenager  
20–59 → Adult  
60 and above → Senior Citizen

Example:

Input:
```
Age = 25
```

Output:
```
Adult
```

Example 2:

Input:
```
Age = 65
```

Output:
```
Senior Citizen
```

---

## 13. Electricity Usage Category

Write a program that categorizes electricity usage.

Conditions:

Units <= 100 → Low usage  
Units <= 300 → Medium usage  
Units > 300 → High usage

Example:

Input:
```
Units = 80
```

Output:
```
Low usage
```

Example 2:

Input:
```
Units = 250
```

Output:
```
Medium usage
```

---

## 14. Salary Tax Category

Write a program that categorizes salary into tax brackets.

Conditions:

Salary < 300000 → No Tax  
Salary < 700000 → Medium Tax  
Salary >= 700000 → High Tax

Example:

Input:
```
Salary = 500000
```

Output:
```
Medium Tax
```

---

# Level 4 – Switch Case Practice

## 15. Day of Week

Write a program that prints the day of the week using `switch`.

Example:

Input:
```
1
```

Output:
```
Monday
```

---

## 16. Simple Calculator

Create a simple calculator using `switch`.

Menu:

1 → Addition  
2 → Subtraction  
3 → Multiplication  
4 → Division

Example:

Input:
```
Choice = 1
Numbers = 10 and 5
```

Output:
```
Result = 15
```

---

## 17. Month Name

Write a program that prints the month name based on the month number.

Example:

Input:
```
3
```

Output:
```
March
```

---

# Level 5 – Slightly Challenging

## 18. Login Validation

Write a program that checks login credentials.

Conditions:

Correct username AND correct password → Login successful  
Else → Invalid login

Example:

Input:
```
Username = admin
Password = 1234
```

Output:
```
Login successful
```

---

## 19. Number Range Classification

Write a program that classifies numbers into ranges.

Conditions:

1–50 → Low range  
51–100 → Medium range  
Above 100 → High range

Example:

Input:
```
75
```

Output:
```
Medium range
```

---

## 20. Triangle Validity

Write a program that checks if three angles form a valid triangle.

Rule:

Sum of all angles must equal **180**.

Example:

Input:
```
60
60
60
```

Output:
```
Valid triangle
```

Example 2:

Input:
```
90
45
30
```

Output:
```
Invalid triangle
```