# 50 Regex Practice Questions for SDETs in Java

## Introduction

This practice guide is designed specifically for:
- Automation Test Engineers
- SDETs
- API Testers
- QA Engineers
- Beginners learning Regex in Java

The questions are arranged in the following order:

1. Very Basic
2. Beginner to Intermediate
3. Intermediate
4. Advanced

Each question is designed to help you practice a different Regex concept.

---

# Level 1 — Very Basic (Questions 1–15)

## Concepts Covered
- Exact matching
- Digits
- Alphabets
- Character classes
- Quantifiers
- Start and end anchors

---

## Question 1 — Validate Exact Word

### Problem
Check whether the input exactly matches:

```text
Login
```

### Example

Valid:
```text
Login
```

Invalid:
```text
login
Login123
```

### Concept Practiced
- Exact text matching

---

## Question 2 — Validate Single Digit

### Problem
Accept only one digit from 0–9.

### Example

Valid:
```text
5
```

Invalid:
```text
55
A
```

### Concept Practiced
- `\d`
- Single character matching

---

## Question 3 — Validate Single Capital Letter

### Problem
Accept only one uppercase letter.

### Example

Valid:
```text
A
Z
```

Invalid:
```text
AA
abc
```

### Concept Practiced
- Character range `[A-Z]`

---

## Question 4 — Validate Single Lowercase Letter

### Problem
Accept only one lowercase letter.

### Example

Valid:
```text
a
z
```

Invalid:
```text
A
ab
```

### Concept Practiced
- Character range `[a-z]`

---

## Question 5 — Validate Only Alphabets

### Problem
Accept strings containing only alphabets.

### Example

Valid:
```text
Amit
John
```

Invalid:
```text
Amit123
John_1
```

### Concept Practiced
- Multiple alphabet matching
- Character groups

---

## Question 6 — Validate Only Numbers

### Problem
Accept strings containing only digits.

### Example

Valid:
```text
12345
9876
```

Invalid:
```text
12A45
98_76
```

### Concept Practiced
- `\d`
- Quantifier `+`

---

## Question 7 — Validate Exactly 5 Digits

### Problem
Accept only 5-digit numbers.

### Example

Valid:
```text
12345
```

Invalid:
```text
1234
123456
```

### Concept Practiced
- Exact quantifier `{n}`

---

## Question 8 — Validate Exactly 10 Digits (Mobile Number)

### Problem
Validate a 10-digit mobile number.

### Example

Valid:
```text
9876543210
```

Invalid:
```text
98765
98765432101
```

### Concept Practiced
- Exact length validation
- Anchors `^` and `$`

---

## Question 9 — Validate Username

### Problem
Allow:
- alphabets
- numbers
- underscore

### Example

Valid:
```text
amit_123
john99
```

Invalid:
```text
amit@123
john-99
```

### Concept Practiced
- Character classes
- Combining ranges

---

## Question 10 — Validate String Starting with A

### Problem
Validate strings that start with uppercase A.

### Example

Valid:
```text
Amit
Apple
```

Invalid:
```text
sumit
Ball
```

### Concept Practiced
- Start anchor `^`

---

## Question 11 — Validate String Ending with Z

### Problem
Validate strings ending with uppercase Z.

### Example

Valid:
```text
TESTZ
QUIZZ
```

Invalid:
```text
TESTA
HELLO
```

### Concept Practiced
- End anchor `$`

---

## Question 12 — Validate String Containing Spaces

### Problem
Check whether the string contains spaces.

### Example

Valid:
```text
Hello World
```

Invalid:
```text
HelloWorld
```

### Concept Practiced
- Whitespace `\s`

---

## Question 13 — Validate Optional Character

### Problem
Accept both:

```text
color
colour
```

### Concept Practiced
- Optional quantifier `?`

### Hint
One character may or may not exist.

---

## Question 14 — Validate One or More Digits

### Problem
Accept one or more digits.

### Example

Valid:
```text
1
123
99999
```

Invalid:
```text
abc
```

### Concept Practiced
- Quantifier `+`

---

## Question 15 — Validate Zero or More Digits

### Problem
Accept:
- empty string
- one digit
- multiple digits

### Example

Valid:
```text
(empty)
123
```

### Concept Practiced
- Quantifier `*`

---

# Level 2 — Beginner to Intermediate (Questions 16–30)

## Concepts Covered
- Real-world validations
- Extraction basics
- Structured formats
- Practical automation scenarios

---

## Question 16 — Validate Basic Email Address

### Problem
Validate basic email format.

### Example

Valid:
```text
test@gmail.com
john123@yahoo.com
```

Invalid:
```text
test@gmail
john@.com
```

### Concept Practiced
- Special characters
- Character groups
- Quantifiers

---

## Question 17 — Validate Indian PIN Code

### Problem
Validate Indian PIN code.

### Rules
- Exactly 6 digits

### Example

Valid:
```text
411033
```

Invalid:
```text
41103
4110335
```

### Concept Practiced
- Exact count validation

---

## Question 18 — Validate Date Format

### Problem
Validate date in format:

```text
DD/MM/YYYY
```

### Example

Valid:
```text
12/05/2026
```

Invalid:
```text
12-05-2026
1/5/2026
```

### Concept Practiced
- Escaping special characters
- Grouped digit validation

---

## Question 19 — Validate Time Format

### Problem
Validate time format:

```text
HH:MM
```

### Example

Valid:
```text
23:59
09:30
```

Invalid:
```text
25:99
9:5
```

### Concept Practiced
- Numeric ranges
- Colon separator

---

## Question 20 — Validate Employee ID

### Problem
Validate employee ID format.

### Format

```text
EMP1234
```

### Rules
- Starts with EMP
- Followed by 4 digits

### Concept Practiced
- Exact prefixes
- Quantifiers

---

## Question 21 — Validate Test Case ID

### Problem
Validate test case IDs.

### Format

```text
TC_101
```

### Example

Valid:
```text
TC_101
TC_999
```

Invalid:
```text
TC101
TEST_101
```

### Concept Practiced
- Literal characters
- Underscore matching

---

## Question 22 — Validate Order ID

### Problem
Validate order ID.

### Format

```text
ORD-2025-1001
```

### Concept Practiced
- Hyphen-separated patterns
- Structured format validation

---

## Question 23 — Validate API Response Status

### Problem
Accept only these values:

```text
SUCCESS
FAILED
PENDING
```

### Concept Practiced
- OR operator `|`

### Hint
Multiple exact words need to be accepted.

---

## Question 24 — Extract OTP from Message

### Problem
Extract OTP from message.

### Input

```text
Your OTP is 456789
```

### Expected Output

```text
456789
```

### Concept Practiced
- Number extraction
- Matcher and group

---

## Question 25 — Extract All Numbers from String

### Problem
Extract all numbers.

### Input

```text
Order123Amount500Tax20
```

### Expected Output

```text
123
500
20
```

### Concept Practiced
- Multiple matches
- `find()` usage

---

## Question 26 — Validate Password (Basic)

### Problem
Validate password with minimum 8 characters.

### Example

Valid:
```text
password1
```

Invalid:
```text
pass
```

### Concept Practiced
- Minimum length validation

---

## Question 27 — Validate Password (Intermediate)

### Problem
Password must contain:
- 1 uppercase letter
- 1 lowercase letter
- 1 digit
- minimum 8 characters

### Concept Practiced
- Lookaheads
- Multiple conditions

### Hint
You may need multiple validations together.

---

## Question 28 — Validate URL

### Problem
Validate URLs.

### Example

Valid:
```text
https://google.com
http://test.com
```

Invalid:
```text
google
http:/test.com
```

### Concept Practiced
- Protocol matching
- Optional patterns

---

## Question 29 — Validate File Name

### Problem
Validate filenames.

### Example

Valid:
```text
report.pdf
testdata.xlsx
```

Invalid:
```text
report@
file?.txt
```

### Concept Practiced
- Dot escaping
- File extensions

---

## Question 30 — Validate Browser Name

### Problem
Accept only supported browsers:

```text
chrome
firefox
edge
safari
```

### Concept Practiced
- Alternation `|`

---

# Level 3 — Intermediate (Questions 31–40)

## Concepts Covered
- Groups
- Alternation
- Structured extraction
- Real automation validations

---

## Question 31 — Extract Error Codes from Logs

### Problem
Extract error codes.

### Input

```text
ERROR_500
ERROR_404
```

### Expected Output

```text
500
404
```

### Concept Practiced
- Group extraction
- Numeric matching

---

## Question 32 — Validate IPv4 Address (Basic)

### Problem
Validate IPv4 format.

### Example

Valid:
```text
192.168.1.1
```

Invalid:
```text
999.999.999.999
192.168.1
```

### Concept Practiced
- Repeated groups
- Dot escaping

### Hint
IP contains 4 sections separated by dots.

---

## Question 33 — Extract Email IDs from Text

### Problem
Extract all email IDs.

### Input

```text
Contact: amit@gmail.com and test@yahoo.com
```

### Concept Practiced
- Multiple extraction
- Character groups

---

## Question 34 — Validate Currency Amount

### Problem
Validate currency values.

### Example

Valid:
```text
₹500
$1000
```

Invalid:
```text
500$
Rs500
```

### Concept Practiced
- Special character matching

---

## Question 35 — Validate Decimal Numbers

### Problem
Validate integers and decimal numbers.

### Example

Valid:
```text
12.5
99.99
100
```

Invalid:
```text
12.
99..99
```

### Concept Practiced
- Optional decimal group

---

## Question 36 — Validate Version Number

### Problem
Validate version numbers.

### Example

Valid:
```text
v1.0
v2.5.10
```

Invalid:
```text
1.0
v1
```

### Concept Practiced
- Repeating grouped patterns

---

## Question 37 — Validate Log Level

### Problem
Accept only:

```text
INFO
DEBUG
WARN
ERROR
```

### Concept Practiced
- Alternation
- Exact matching

---

## Question 38 — Extract All Dates from Text

### Problem
Extract all dates.

### Input

```text
Started on 12/05/2026 and ended on 15/05/2026
```

### Concept Practiced
- Multiple grouped matches

---

## Question 39 — Validate Hex Color Code

### Problem
Validate hex color codes.

### Example

Valid:
```text
#FFFFFF
#000000
#A1B2C3
```

Invalid:
```text
FFFFFF
#ZZZZZZ
```

### Concept Practiced
- Hexadecimal characters

---

## Question 40 — Validate HTML Tag

### Problem
Validate HTML tags.

### Example

Valid:
```html
<div>
<p>
<h1>
```

Invalid:
```html
<div
p>
```

### Concept Practiced
- Angle bracket escaping
- Word matching

---

# Level 4 — Advanced (Questions 41–50)

## Concepts Covered
- Lookaheads
- Backreferences
- Advanced extraction
- Real-world automation validations
- Log and API pattern validation

---

## Question 41 — Validate Strong Password

### Problem
Password must contain:
- 1 uppercase letter
- 1 lowercase letter
- 1 digit
- 1 special character
- minimum 8 characters

### Example

Valid:
```text
Test@123
```

Invalid:
```text
test123
```

### Concept Practiced
- Positive lookaheads
- Multiple validations together

### Hint
This problem requires checking multiple independent conditions.

---

## Question 42 — Extract JSON Values

### Problem
Extract values from JSON.

### Input

```json
{
  "id": 101,
  "name": "Amit"
}
```

### Expected Output

```text
101
Amit
```

### Concept Practiced
- Group capturing
- Quoted text extraction

### Hint
You may need capturing groups `( )`.

---

## Question 43 — Validate API Token Format

### Problem
Validate JWT-like API token.

### Example

```text
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9
```

### Concept Practiced
- Alphanumeric validation
- Special character handling

### Hint
Tokens often contain letters, numbers, underscores, and dots.

---

## Question 44 — Extract Dynamic Session IDs from Logs

### Problem
Extract session ID.

### Input

```text
SessionID=ABC123XYZ
```

### Expected Output

```text
ABC123XYZ
```

### Concept Practiced
- Capturing groups
- Dynamic text extraction

---

## Question 45 — Validate Credit Card Format (Basic)

### Problem
Validate card format.

### Example

Valid:
```text
1234-5678-9876-5432
```

Invalid:
```text
1234567898765432
```

### Concept Practiced
- Grouped digit validation
- Structured separators

---

## Question 46 — Validate SQL Query Type

### Problem
Accept queries starting only with:

```sql
SELECT
INSERT
UPDATE
DELETE
```

### Example

Valid:
```sql
SELECT * FROM users
```

Invalid:
```sql
DROP TABLE users
```

### Concept Practiced
- Start anchors
- Alternation

### Hint
The query must begin with one of multiple keywords.

---

## Question 47 — Extract URLs from API Response

### Problem
Extract URLs from API response.

### Input

```json
{
 "url":"https://example.com"
}
```

### Concept Practiced
- URL matching
- Extraction using groups

---

## Question 48 — Validate XML Tag Pair

### Problem
Validate matching XML tags.

### Example

Valid:
```xml
<name>Amit</name>
```

Invalid:
```xml
<name>Amit</user>
```

### Concept Practiced
- Backreferences
- Capturing groups

### Hint
The opening and closing tag names must match.

---

## Question 49 — Detect Duplicate Words

### Problem
Detect duplicate consecutive words.

### Input

```text
hello hello world
```

### Expected Output

```text
hello
```

### Concept Practiced
- Backreferences
- Word boundaries

### Hint
You need to compare a word with the next word.

---

## Question 50 — Validate Complex Log Format

### Problem
Validate log format.

### Input

```text
2026-05-12 10:45:22 INFO Login Successful
```

### Validation Requirements
- Date
- Time
- Log level
- Message

### Concept Practiced
- Large structured regex
- Multiple grouped validations

### Hint
Break the regex into smaller parts:
1. Date
2. Time
3. Log level
4. Message

---

# Recommended Java Practice Template

```java
import java.util.regex.*;

public class RegexPractice {

    public static void main(String[] args) {

        String input = "9876543210";

        boolean result =
                input.matches("\\d{10}");

        System.out.println(result);
    }
}
```

---

# Final Advice for SDETs

Do not try to memorize Regex.

Instead:
- Read patterns slowly
- Break regex into smaller parts
- Practice one concept at a time
- Use real automation examples

Regex mastery comes from repeated practical usage.

---

# Suggested Next Topics

After completing these 50 questions, continue with:

1. Greedy vs Lazy Matching
2. Capturing Groups
3. Non-Capturing Groups
4. Lookaheads
5. Lookbehinds
6. Backreferences
7. Regex in Selenium
8. Regex in API Automation
9. Regex for Log Validation
10. Regex for Dynamic Data Extraction

