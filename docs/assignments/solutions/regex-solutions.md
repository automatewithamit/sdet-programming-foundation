# Regex Solutions for SDETs in Java

## Introduction

This document contains solutions for all 50 Regex practice questions.

Each solution includes:
- Regex pattern
- Java example
- Explanation
- Regex breakdown
- Important concepts used

The questions are arranged in the exact same order as the practice file.

---

# Level 1 — Very Basic (Questions 1–15)

---

## Question 1 — Validate Exact Word

### Regex

```regex
Login
```

### Java Solution

```java
String input = "Login";
System.out.println(input.matches("Login"));
```

### Explanation
This regex checks for an exact match.
The input must contain only the word:

```text
Login
```

Anything else fails.

---

## Question 2 — Validate Single Digit

### Regex

```regex
\d
```

### Java Solution

```java
String input = "5";
System.out.println(input.matches("\\d"));
```

### Explanation
- `\d` means any digit from 0–9.
- Since no quantifier is used, only one digit is allowed.

---

## Question 3 — Validate Single Capital Letter

### Regex

```regex
[A-Z]
```

### Java Solution

```java
String input = "A";
System.out.println(input.matches("[A-Z]"));
```

### Explanation
- `[A-Z]` means any uppercase English alphabet.
- Only one character is allowed.

---

## Question 4 — Validate Single Lowercase Letter

### Regex

```regex
[a-z]
```

### Java Solution

```java
String input = "a";
System.out.println(input.matches("[a-z]"));
```

### Explanation
- `[a-z]` represents lowercase alphabets.
- Only one lowercase character is allowed.

---

## Question 5 — Validate Only Alphabets

### Regex

```regex
^[A-Za-z]+$
```

### Java Solution

```java
String input = "Amit";
System.out.println(input.matches("^[A-Za-z]+$"));
```

### Explanation
- `^` → start of string
- `[A-Za-z]` → any alphabet
- `+` → one or more alphabets
- `$` → end of string

This ensures only alphabets exist.

---

## Question 6 — Validate Only Numbers

### Regex

```regex
^\d+$
```

### Java Solution

```java
String input = "12345";
System.out.println(input.matches("^\\d+$"));
```

### Explanation
- `\d` → digit
- `+` → one or more digits
- Anchors ensure only digits exist.

---

## Question 7 — Validate Exactly 5 Digits

### Regex

```regex
^\d{5}$
```

### Java Solution

```java
String input = "12345";
System.out.println(input.matches("^\\d{5}$"));
```

### Explanation
- `{5}` means exactly 5 digits.

---

## Question 8 — Validate Exactly 10 Digits (Mobile Number)

### Regex

```regex
^\d{10}$
```

### Java Solution

```java
String mobile = "9876543210";
System.out.println(mobile.matches("^\\d{10}$"));
```

### Explanation
Ensures:
- exactly 10 digits
- no extra characters

---

## Question 9 — Validate Username

### Regex

```regex
^[A-Za-z0-9_]+$
```

### Java Solution

```java
String username = "amit_123";
System.out.println(username.matches("^[A-Za-z0-9_]+$"));
```

### Explanation
Allows:
- uppercase letters
- lowercase letters
- digits
- underscore

---

## Question 10 — Validate String Starting with A

### Regex

```regex
^A.*
```

### Java Solution

```java
String input = "Amit";
System.out.println(input.matches("^A.*"));
```

### Explanation
- `^A` → string must start with A
- `.*` → any characters after A

---

## Question 11 — Validate String Ending with Z

### Regex

```regex
.*Z$
```

### Java Solution

```java
String input = "TESTZ";
System.out.println(input.matches(".*Z$"));
```

### Explanation
- `Z$` ensures string ends with Z.

---

## Question 12 — Validate String Containing Spaces

### Regex

```regex
.*\s.*
```

### Java Solution

```java
String input = "Hello World";
System.out.println(input.matches(".*\\s.*"));
```

### Explanation
- `\s` means whitespace.
- `.*` allows any characters before and after.

---

## Question 13 — Validate Optional Character

### Regex

```regex
colou?r
```

### Java Solution

```java
String input = "colour";
System.out.println(input.matches("colou?r"));
```

### Explanation
- `u?` means u is optional.
- Matches:
  - color
  - colour

---

## Question 14 — Validate One or More Digits

### Regex

```regex
^\d+$
```

### Java Solution

```java
String input = "12345";
System.out.println(input.matches("^\\d+$"));
```

### Explanation
- `+` means one or more.

---

## Question 15 — Validate Zero or More Digits

### Regex

```regex
^\d*$
```

### Java Solution

```java
String input = "";
System.out.println(input.matches("^\\d*$"));
```

### Explanation
- `*` means zero or more.
- Empty string is also valid.

---

# Level 2 — Beginner to Intermediate (Questions 16–30)

---

## Question 16 — Validate Basic Email Address

### Regex

```regex
^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$
```

### Java Solution

```java
String email = "test@gmail.com";
System.out.println(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"));
```

### Explanation
- First part validates username.
- `@` is mandatory.
- Last part validates domain.

---

## Question 17 — Validate Indian PIN Code

### Regex

```regex
^\d{6}$
```

### Java Solution

```java
String pin = "411033";
System.out.println(pin.matches("^\\d{6}$"));
```

### Explanation
Indian PIN codes contain exactly 6 digits.

---

## Question 18 — Validate Date Format

### Regex

```regex
^\d{2}/\d{2}/\d{4}$
```

### Java Solution

```java
String date = "12/05/2026";
System.out.println(date.matches("^\\d{2}/\\d{2}/\\d{4}$"));
```

### Explanation
- 2 digits → day
- slash
- 2 digits → month
- slash
- 4 digits → year

---

## Question 19 — Validate Time Format

### Regex

```regex
^([01]\d|2[0-3]):[0-5]\d$
```

### Java Solution

```java
String time = "23:59";
System.out.println(time.matches("^([01]\\d|2[0-3]):[0-5]\\d$"));
```

### Explanation
Hour:
- 00–19 using `[01]\d`
- 20–23 using `2[0-3]`

Minutes:
- 00–59 using `[0-5]\d`

---

## Question 20 — Validate Employee ID

### Regex

```regex
^EMP\d{4}$
```

### Java Solution

```java
String empId = "EMP1234";
System.out.println(empId.matches("^EMP\\d{4}$"));
```

### Explanation
- Must start with EMP
- Followed by exactly 4 digits

---

## Question 21 — Validate Test Case ID

### Regex

```regex
^TC_\d+$
```

### Java Solution

```java
String tc = "TC_101";
System.out.println(tc.matches("^TC_\\d+$"));
```

### Explanation
- Exact prefix TC_
- One or more digits

---

## Question 22 — Validate Order ID

### Regex

```regex
^ORD-\d{4}-\d{4}$
```

### Java Solution

```java
String order = "ORD-2025-1001";
System.out.println(order.matches("^ORD-\\d{4}-\\d{4}$"));
```

### Explanation
Structured order format using fixed digit groups.

---

## Question 23 — Validate API Response Status

### Regex

```regex
^(SUCCESS|FAILED|PENDING)$
```

### Java Solution

```java
String status = "SUCCESS";
System.out.println(status.matches("^(SUCCESS|FAILED|PENDING)$"));
```

### Explanation
- `|` means OR.
- Only listed values are accepted.

---

## Question 24 — Extract OTP from Message

### Regex

```regex
\d{6}
```

### Java Solution

```java
import java.util.regex.*;

String text = "Your OTP is 456789";
Pattern p = Pattern.compile("\\d{6}");
Matcher m = p.matcher(text);

if(m.find()) {
    System.out.println(m.group());
}
```

### Explanation
- Searches for exactly 6 digits.
- `find()` locates the match.
- `group()` extracts the value.

---

## Question 25 — Extract All Numbers from String

### Regex

```regex
\d+
```

### Java Solution

```java
import java.util.regex.*;

String text = "Order123Amount500Tax20";
Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher(text);

while(m.find()) {
    System.out.println(m.group());
}
```

### Explanation
- `+` extracts one or more digits.
- `find()` helps retrieve multiple matches.

---

## Question 26 — Validate Password (Basic)

### Regex

```regex
^.{8,}$
```

### Java Solution

```java
String password = "password1";
System.out.println(password.matches("^.{8,}$"));
```

### Explanation
- `.` means any character.
- `{8,}` means minimum 8 characters.

---

## Question 27 — Validate Password (Intermediate)

### Regex

```regex
^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).{8,}$
```

### Java Solution

```java
String password = "Test1234";
System.out.println(password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$"));
```

### Explanation
Lookaheads:
- `(?=.*[a-z])` → lowercase exists
- `(?=.*[A-Z])` → uppercase exists
- `(?=.*\d)` → digit exists

---

## Question 28 — Validate URL

### Regex

```regex
^(https?://).+$
```

### Java Solution

```java
String url = "https://google.com";
System.out.println(url.matches("^(https?://).+$"));
```

### Explanation
- `https?` allows:
  - http
  - https

---

## Question 29 — Validate File Name

### Regex

```regex
^[A-Za-z0-9_]+\.[A-Za-z]+$
```

### Java Solution

```java
String file = "report.pdf";
System.out.println(file.matches("^[A-Za-z0-9_]+\\.[A-Za-z]+$"));
```

### Explanation
- Filename
- dot
- extension

---

## Question 30 — Validate Browser Name

### Regex

```regex
^(chrome|firefox|edge|safari)$
```

### Java Solution

```java
String browser = "chrome";
System.out.println(browser.matches("^(chrome|firefox|edge|safari)$"));
```

### Explanation
Only listed browser names are allowed.

---

# Level 3 — Intermediate (Questions 31–40)

---

## Question 31 — Extract Error Codes from Logs

### Regex

```regex
ERROR_(\d+)
```

### Java Solution

```java
import java.util.regex.*;

String text = "ERROR_500 ERROR_404";
Pattern p = Pattern.compile("ERROR_(\\d+)");
Matcher m = p.matcher(text);

while(m.find()) {
    System.out.println(m.group(1));
}
```

### Explanation
- `( )` creates capturing group.
- `group(1)` extracts digits only.

---

## Question 32 — Validate IPv4 Address (Basic)

### Regex

```regex
^((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)\.){3}(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)$
```

### Java Solution

```java
String ip = "192.168.1.1";
System.out.println(ip.matches("^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$"));
```

### Explanation
Ensures:
- 4 sections
- separated by dots
- each section between 0–255

---

## Question 33 — Extract Email IDs from Text

### Regex

```regex
[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}
```

### Java Solution

```java
import java.util.regex.*;

String text = "Contact amit@gmail.com and test@yahoo.com";
Pattern p = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");
Matcher m = p.matcher(text);

while(m.find()) {
    System.out.println(m.group());
}
```

### Explanation
Extracts all valid email patterns.

---

## Question 34 — Validate Currency Amount

### Regex

```regex
^[₹$]\d+$
```

### Java Solution

```java
String amount = "$1000";
System.out.println(amount.matches("^[₹$]\\d+$"));
```

### Explanation
- Starts with ₹ or $
- Followed by digits

---

## Question 35 — Validate Decimal Numbers

### Regex

```regex
^\d+(\.\d+)?$
```

### Java Solution

```java
String num = "12.5";
System.out.println(num.matches("^\\d+(\\.\\d+)?$"));
```

### Explanation
- Decimal part is optional.
- `?` makes decimal section optional.

---

## Question 36 — Validate Version Number

### Regex

```regex
^v\d+(\.\d+)+$
```

### Java Solution

```java
String version = "v2.5.10";
System.out.println(version.matches("^v\\d+(\\.\\d+)+$"));
```

### Explanation
- Starts with v
- Multiple dot-separated numeric sections

---

## Question 37 — Validate Log Level

### Regex

```regex
^(INFO|DEBUG|WARN|ERROR)$
```

### Java Solution

```java
String level = "INFO";
System.out.println(level.matches("^(INFO|DEBUG|WARN|ERROR)$"));
```

### Explanation
Alternation used to validate exact log levels.

---

## Question 38 — Extract All Dates from Text

### Regex

```regex
\d{2}/\d{2}/\d{4}
```

### Java Solution

```java
import java.util.regex.*;

String text = "Started on 12/05/2026 and ended on 15/05/2026";
Pattern p = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
Matcher m = p.matcher(text);

while(m.find()) {
    System.out.println(m.group());
}
```

### Explanation
Extracts all dates matching DD/MM/YYYY format.

---

## Question 39 — Validate Hex Color Code

### Regex

```regex
^#[A-Fa-f0-9]{6}$
```

### Java Solution

```java
String color = "#FFFFFF";
System.out.println(color.matches("^#[A-Fa-f0-9]{6}$"));
```

### Explanation
Allows:
- # symbol
- hexadecimal digits
- exactly 6 characters

---

## Question 40 — Validate HTML Tag

### Regex

```regex
^<\w+>$
```

### Java Solution

```java
String tag = "<div>";
System.out.println(tag.matches("^<\\w+>$"));
```

### Explanation
- `<` opening bracket
- `\w+` tag name
- `>` closing bracket

---

# Level 4 — Advanced (Questions 41–50)

---

## Question 41 — Validate Strong Password

### Regex

```regex
^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@#$%^&+=!]).{8,}$
```

### Java Solution

```java
String password = "Test@123";
System.out.println(password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$"));
```

### Explanation
Lookaheads validate:
- lowercase
- uppercase
- digit
- special character

---

## Question 42 — Extract JSON Values

### Regex

```regex
"(.*?)"\s*:\s*"?(.*?)"?(,|})
```

### Java Solution

```java
import java.util.regex.*;

String json = "{\"id\":101,\"name\":\"Amit\"}";

Pattern p = Pattern.compile("\"(.*?)\"\\s*:\\s*\"?(.*?)\"?(,|})");
Matcher m = p.matcher(json);

while(m.find()) {
    System.out.println(m.group(1) + " : " + m.group(2));
}
```

### Explanation
Captures:
- key
- value

Using groups.

---

## Question 43 — Validate API Token Format

### Regex

```regex
^[A-Za-z0-9._-]+$
```

### Java Solution

```java
String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
System.out.println(token.matches("^[A-Za-z0-9._-]+$"));
```

### Explanation
Allows:
- alphabets
- digits
- underscore
- hyphen
- dot

---

## Question 44 — Extract Dynamic Session IDs from Logs

### Regex

```regex
SessionID=(\w+)
```

### Java Solution

```java
import java.util.regex.*;

String log = "SessionID=ABC123XYZ";
Pattern p = Pattern.compile("SessionID=(\\w+)");
Matcher m = p.matcher(log);

if(m.find()) {
    System.out.println(m.group(1));
}
```

### Explanation
Captures dynamic session ID after `SessionID=`.

---

## Question 45 — Validate Credit Card Format (Basic)

### Regex

```regex
^\d{4}-\d{4}-\d{4}-\d{4}$
```

### Java Solution

```java
String card = "1234-5678-9876-5432";
System.out.println(card.matches("^\\d{4}-\\d{4}-\\d{4}-\\d{4}$"));
```

### Explanation
Ensures:
- 4 digit groups
- separated by hyphen

---

## Question 46 — Validate SQL Query Type

### Regex

```regex
^(SELECT|INSERT|UPDATE|DELETE)\s+.*
```

### Java Solution

```java
String query = "SELECT * FROM users";
System.out.println(query.matches("^(SELECT|INSERT|UPDATE|DELETE)\\s+.*"));
```

### Explanation
- Query must start with allowed keyword.
- `\s+` ensures space after keyword.

---

## Question 47 — Extract URLs from API Response

### Regex

```regex
https?://[^\s"']+
```

### Java Solution

```java
import java.util.regex.*;

String response = "{\"url\":\"https://example.com\"}";
Pattern p = Pattern.compile("https?://[^\\s\"']+");
Matcher m = p.matcher(response);

while(m.find()) {
    System.out.println(m.group());
}
```

### Explanation
Extracts complete URL.

---

## Question 48 — Validate XML Tag Pair

### Regex

```regex
^<([A-Za-z]+)>.*</\1>$
```

### Java Solution

```java
String xml = "<name>Amit</name>";
System.out.println(xml.matches("^<([A-Za-z]+)>.*</\\1>$"));
```

### Explanation
- `([A-Za-z]+)` captures opening tag.
- `\\1` references same tag.

This ensures both tags match.

---

## Question 49 — Detect Duplicate Words

### Regex

```regex
\b(\w+)\s+\1\b
```

### Java Solution

```java
import java.util.regex.*;

String text = "hello hello world";
Pattern p = Pattern.compile("\\b(\\w+)\\s+\\1\\b");
Matcher m = p.matcher(text);

while(m.find()) {
    System.out.println(m.group(1));
}
```

### Explanation
- Captures word
- Matches same word again using backreference

---

## Question 50 — Validate Complex Log Format

### Regex

```regex
^\d{4}-\d{2}-\d{2}\s\d{2}:\d{2}:\d{2}\s(INFO|DEBUG|WARN|ERROR)\s.+$
```

### Java Solution

```java
String log = "2026-05-12 10:45:22 INFO Login Successful";

System.out.println(
    log.matches(
        "^\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}\\s(INFO|DEBUG|WARN|ERROR)\\s.+$"
    )
);
```

### Explanation
Breakdown:

- `\\d{4}-\\d{2}-\\d{2}` → date
- `\\s` → space
- `\\d{2}:\\d{2}:\\d{2}` → time
- `(INFO|DEBUG|WARN|ERROR)` → log level
- `.+` → message

This is a common real-world log validation pattern.

---

# Final Advice

Regex becomes easy when you:

1. Break patterns into smaller parts
2. Practice regularly
3. Use real-world automation examples
4. Read regex slowly
5. Avoid memorizing huge patterns

---

# Recommended Next Topics

1. Greedy vs Lazy Matching
2. Capturing Groups
3. Non-Capturing Groups
4. Lookaheads
5. Lookbehinds
6. Backreferences
7. Regex in Selenium
8. Regex in API Automation
9. Regex for Log Validation
10. Advanced Extraction Techniques

