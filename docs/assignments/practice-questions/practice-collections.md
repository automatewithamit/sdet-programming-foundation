# Practice Problems – Collections

This document contains practice problems to strengthen your understanding of:

- List (ArrayList)
- Set (HashSet)
- Map (HashMap)
- Using collections in real-world automation scenarios

The problems are arranged in **increasing order of difficulty**.

---

# Level 1 – Basic List Practice

Recommended: `List`, `ArrayList`

---

## 1. Store and Print Test Case Names

A **List** is used to store multiple values in order.

Write a program to store test case names and print them.

Example Input

```
["LoginTest", "SignupTest", "CheckoutTest"]
```

Example Output

```
LoginTest
SignupTest
CheckoutTest
```

---

## 2. Print First and Last Element

Write a program to print the first and last element from a list.

Example Input

```
["google.com", "amazon.com", "flipkart.com"]
```

Example Output

```
First: google.com
Last: flipkart.com
```

Explanation

First element → index 0  
Last element → size - 1

---

## 3. Count Number of Elements

Write a program to count how many elements are present in a list.

Example Input

```
["Chrome", "Firefox", "Edge"]
```

Example Output

```
3
```

---

## 4. Check if Element Exists

Write a program to check if a given browser exists in the list.

Example Input

```
["Chrome", "Firefox", "Edge"]
Search: Safari
```

Example Output

```
Not Found
```

---

## 5. Remove an Element

Write a program to remove a specific test case from the list.

Example Input

```
["Login", "Signup", "Logout"]
Remove: Signup
```

Example Output

```
["Login", "Logout"]
```

---

# Level 2 – List Logic (Automation Use Cases)

---

## 6. Find Duplicate Test Cases

A duplicate is a value that appears more than once.

Write a program to find duplicate test case names.

Example Input

```
["TC1", "TC2", "TC1", "TC3"]
```

Example Output

```
TC1
```

---

## 7. Remove Duplicate Values

Write a program to remove duplicate elements from a list.

Example Input

```
["TC1", "TC2", "TC1"]
```

Example Output

```
["TC1", "TC2"]
```

---

## 8. Sort List of Numbers

Write a program to sort numbers in ascending order.

Example Input

```
[30, 10, 20]
```

Example Output

```
[10, 20, 30]
```

---

## 9. Reverse a List

Write a program to reverse a list.

Example Input

```
[1, 2, 3]
```

Example Output

```
[3, 2, 1]
```

---

## 10. Find Longest String

Write a program to find the longest string from a list.

Example Input

```
["api", "automation", "qa"]
```

Example Output

```
automation
```

Explanation

Compare length of each string.

---

# Level 3 – Filtering & Counting

---

## 11. Filter Failed Test Cases

Write a program to print only failed test cases.

Example Input

```
["PASS", "FAIL", "PASS", "FAIL"]
```

Example Output

```
FAIL
FAIL
```

---

## 12. Count Failed Test Cases

Write a program to count how many test cases failed.

Example Input

```
["PASS", "FAIL", "FAIL"]
```

Example Output

```
2
```

---

## 13. Count Strings with Length Greater than 3

Write a program to count strings whose length is greater than 3.

Example Input

```
["api", "test", "automation"]
```

Example Output

```
2
```

---

## 14. Convert Strings to Uppercase

Write a program to convert all strings in a list to uppercase.

Example Input

```
["qa", "test"]
```

Example Output

```
["QA", "TEST"]
```

---

# Level 4 – Set (Uniqueness)

A **Set** stores only unique elements (no duplicates allowed).

---

## 15. Store Unique Browser Names

Write a program to store unique browser names using Set.

Example Input

```
["Chrome", "Chrome", "Firefox"]
```

Example Output

```
["Chrome", "Firefox"]
```

---

## 16. Check if All Elements are Unique

Write a program to check if all elements in a list are unique.

Example Input

```
[1, 2, 3]
```

Example Output

```
All elements are unique
```

---

## 17. Find Common Elements Between Two Lists

Write a program to find common elements.

Example Input

```
[1, 2, 3]
[2, 3, 4]
```

Example Output

```
2
3
```

---

## 18. Find Difference Between Two Lists

Write elements present in first list but not in second.

Example Input

```
[1, 2, 3]
[2, 3]
```

Example Output

```
1
```

---

## 19. Check Subset

Check if one list is subset of another.

Example Input

```
[1, 2]
[1, 2, 3]
```

Example Output

```
True
```

---

# Level 5 – Map (Key-Value)

A **Map** stores data in key-value pairs.

---

## 20. Store Test Case Status

Store test case ID and its status.

Example Input

```
TC1 → PASS
TC2 → FAIL
```

Example Output

```
{TC1=PASS, TC2=FAIL}
```

---

## 21. Retrieve Value Using Key

Write a program to retrieve status of a test case.

Example Input

```
TC1 → PASS
```

Example Output

```
PASS
```

---

## 22. Count Frequency of Elements

Write a program to count frequency of each value.

Example Input

```
["PASS", "FAIL", "PASS"]
```

Example Output

```
PASS → 2
FAIL → 1
```

---

## 23. Find Most Frequent Element

Write a program to find the most frequent value.

Example Input

```
["PASS", "PASS", "FAIL"]
```

Example Output

```
PASS
```

---

## 24. Validate Login Using Map

Store username and password and validate login.

Example Input

```
user1 → pass123
Input: user1, pass123
```

Example Output

```
Login Successful
```

---

## 25. Check if Key Exists

Write a program to check if a key exists in map.

Example Input

```
Map contains TC1
```

Example Output

```
True
```

---

# Level 6 – Combined Collections Logic

---

## 26. Group Test Cases by Status

Group test cases into PASS and FAIL.

Example Input

```
TC1 → PASS
TC2 → FAIL
```

Example Output

```
PASS → [TC1]
FAIL → [TC2]
```

---

## 27. Merge Lists Without Duplicates

Write a program to merge two lists without duplicates.

Example Input

```
[1, 2]
[2, 3]
```

Example Output

```
[1, 2, 3]
```

---

## 28. Find Second Most Frequent Element

Write a program to find the second most frequent value.

Example Input

```
[1, 1, 2, 2, 2, 3]
```

Example Output

```
1
```

---

## 29. Find First Non-Repeating Element

Write a program to find first element that appears only once.

Example Input

```
[1, 2, 2, 3, 3]
```

Example Output

```
1
```

---

## 30. Count Unique Elements

Write a program to count distinct elements.

Example Input

```
[1, 2, 2, 3]
```

Example Output

```
3
```

---

# Level 7 – Automation Use Cases

---

## 31. Validate API Response Keys

Check if expected keys exist in actual response.

Example Input

```
Expected → ["id", "name"]
Actual → ["id", "name", "age"]
```

Example Output

```
Valid
```

---

## 32. Find Missing UI Elements

Find elements missing in actual UI.

Example Input

```
Expected → ["Login", "Signup"]
Actual → ["Login"]
```

Example Output

```
Signup missing
```

---

## 33. Validate Unique User IDs

Check if duplicate user IDs exist.

Example Input

```
["U1", "U2", "U1"]
```

Example Output

```
Duplicate Found
```

---

## 34. Store Environment Configuration

Store config like browser and URL.

Example Input

```
browser → Chrome
url → test.com
```

Example Output

```
Map created
```

---

## 35. Count Pass/Fail from Map

Count total pass and fail.

Example Input

```
TC1 → PASS
TC2 → FAIL
TC3 → PASS
```

Example Output

```
Pass: 2
Fail: 1
```

---

## 36. Find Keys with Specific Value

Find test cases that failed.

Example Input

```
TC1 → FAIL
TC2 → PASS
```

Example Output

```
TC1
```

---

## 37. Compare Two Maps

Compare expected vs actual results.

Example Output

```
Match / Mismatch
```

---

## 38. Maintain Execution Order

Store test steps in order and print.

Example Input

```
["Open Browser", "Login", "Logout"]
```

Example Output

```
Same order
```

---

## 39. Track Execution History

Store executed test cases and print history.

---

## 40. Generate Test Summary

Create summary of execution.

Example Input

```
["PASS", "FAIL", "PASS"]
```

Example Output

```
Total: 3
Pass: 2
Fail: 1
```