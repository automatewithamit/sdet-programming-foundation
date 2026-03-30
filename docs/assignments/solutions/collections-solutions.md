# Collections Solutions – 40 Problems

This document contains solutions for all collection problems in the same order.

---

# Level 1 – Basics (List)

## 1. Store and Print Test Case Names

```java
List<String> testCases = new ArrayList<>();
testCases.add("LoginTest");
testCases.add("SignupTest");
testCases.add("CheckoutTest");

for(String tc : testCases) {
    System.out.println(tc);
}
```

---

## 2. Print First and Last Element

```java
System.out.println("First: " + list.get(0));
System.out.println("Last: " + list.get(list.size() - 1));
```

---

## 3. Count Number of Elements

```java
System.out.println(list.size());
```

---

## 4. Check if Element Exists

```java
if(list.contains("Safari")) {
    System.out.println("Found");
} else {
    System.out.println("Not Found");
}
```

---

## 5. Remove an Element

```java
list.remove("Signup");
System.out.println(list);
```

---

# Level 2 – List Logic

## 6. Find Duplicate Test Cases

```java
Set<String> seen = new HashSet<>();
Set<String> duplicates = new HashSet<>();

for(String item : list) {
    if(!seen.add(item)) {
        duplicates.add(item);
    }
}

System.out.println(duplicates);
```

### Explanation

- `seen.add()` returns false if already present
- That means it's a duplicate

---

## 7. Remove Duplicate Values

```java
Set<String> set = new HashSet<>(list);
list = new ArrayList<>(set);
```

---

## 8. Sort List

```java
Collections.sort(list);
```

---

## 9. Reverse List

```java
Collections.reverse(list);
```

---

## 10. Find Longest String

```java
String longest = "";

for(String s : list) {
    if(s.length() > longest.length()) {
        longest = s;
    }
}

System.out.println(longest);
```

---

# Level 3 – Filtering

## 11. Filter Failed Test Cases

```java
for(String status : list) {
    if(status.equals("FAIL")) {
        System.out.println(status);
    }
}
```

---

## 12. Count Failed Test Cases

```java
int count = 0;

for(String status : list) {
    if(status.equals("FAIL")) {
        count++;
    }
}

System.out.println(count);
```

---

## 13. Count Strings Length > 3

```java
int count = 0;

for(String s : list) {
    if(s.length() > 3) {
        count++;
    }
}

System.out.println(count);
```

---

## 14. Convert to Uppercase

```java
List<String> result = new ArrayList<>();

for(String s : list) {
    result.add(s.toUpperCase());
}

System.out.println(result);
```

---

# Level 4 – Set

## 15. Store Unique Browsers

```java
Set<String> set = new HashSet<>(list);
System.out.println(set);
```

---

## 16. Check if All Elements are Unique

```java
Set<Integer> set = new HashSet<>(list);

if(set.size() == list.size()) {
    System.out.println("All elements are unique");
}
```

---

## 17. Find Common Elements

```java
Set<Integer> set = new HashSet<>(list1);
set.retainAll(list2);

System.out.println(set);
```

---

## 18. Find Difference

```java
Set<Integer> set = new HashSet<>(list1);
set.removeAll(list2);

System.out.println(set);
```

---

## 19. Check Subset

```java
System.out.println(list2.containsAll(list1));
```

---

# Level 5 – Map

## 20. Store Test Case Status

```java
Map<String, String> map = new HashMap<>();
map.put("TC1", "PASS");
map.put("TC2", "FAIL");

System.out.println(map);
```

---

## 21. Retrieve Value

```java
System.out.println(map.get("TC1"));
```

---

## 22. Count Frequency

```java
Map<String, Integer> freq = new HashMap<>();

for(String s : list) {
    freq.put(s, freq.getOrDefault(s, 0) + 1);
}

System.out.println(freq);
```

---

## 23. Most Frequent Element

```java
String maxKey = "";
int max = 0;

for(Map.Entry<String, Integer> entry : freq.entrySet()) {
    if(entry.getValue() > max) {
        max = entry.getValue();
        maxKey = entry.getKey();
    }
}

System.out.println(maxKey);
```

---

## 24. Validate Login

```java
Map<String, String> users = new HashMap<>();
users.put("user1", "pass123");

if(users.containsKey("user1") && users.get("user1").equals("pass123")) {
    System.out.println("Login Successful");
}
```

---

## 25. Check Key Exists

```java
System.out.println(map.containsKey("TC1"));
```

---

# Level 6 – Combined Logic

## 26. Group by Status

```java
Map<String, List<String>> result = new HashMap<>();

for(Map.Entry<String, String> entry : map.entrySet()) {
    result.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
}

System.out.println(result);
```

---

## 27. Merge Lists Without Duplicates

```java
Set<Integer> set = new HashSet<>(list1);
set.addAll(list2);

System.out.println(set);
```

---

## 28. Second Most Frequent

### Explanation

Sort frequencies and pick second highest.

```java
List<Integer> values = new ArrayList<>(freq.values());
Collections.sort(values, Collections.reverseOrder());

System.out.println(values.get(1));
```

---

## 29. First Non-Repeating

```java
for(String s : list) {
    if(freq.get(s) == 1) {
        System.out.println(s);
        break;
    }
}
```

---

## 30. Count Unique Elements

```java
Set<Integer> set = new HashSet<>(list);
System.out.println(set.size());
```

---

# Level 7 – Automation Use Cases

## 31. Validate API Keys

```java
Set<String> expected = new HashSet<>(Arrays.asList("id", "name"));
Set<String> actual = new HashSet<>(Arrays.asList("id", "name", "age"));

System.out.println(actual.containsAll(expected));
```

---

## 32. Find Missing UI Elements

```java
List<String> missing = new ArrayList<>(expected);
missing.removeAll(actual);

System.out.println(missing);
```

---

## 33. Validate Unique User IDs

```java
Set<String> set = new HashSet<>(list);

if(set.size() != list.size()) {
    System.out.println("Duplicate Found");
}
```

---

## 34. Store Config

```java
Map<String, String> config = new HashMap<>();
config.put("browser", "Chrome");
config.put("url", "test.com");
```

---

## 35. Count Pass/Fail

```java
int pass = 0, fail = 0;

for(String s : map.values()) {
    if(s.equals("PASS")) pass++;
    else fail++;
}

System.out.println("Pass: " + pass);
System.out.println("Fail: " + fail);
```

---

## 36. Find Keys with FAIL

```java
for(Map.Entry<String, String> entry : map.entrySet()) {
    if(entry.getValue().equals("FAIL")) {
        System.out.println(entry.getKey());
    }
}
```

---

## 37. Compare Maps

```java
System.out.println(map1.equals(map2));
```

---

## 38. Maintain Order

```java
List<String> steps = new ArrayList<>();
steps.add("Open Browser");
steps.add("Login");
steps.add("Logout");
```

---

## 39. Execution History

```java
List<String> history = new ArrayList<>();
history.add("TC1");
history.add("TC2");

System.out.println(history);
```

---

## 40. Test Summary

```java
int total = list.size();
int pass = 0;

for(String s : list) {
    if(s.equals("PASS")) pass++;
}

System.out.println("Total: " + total);
System.out.println("Pass: " + pass);
System.out.println("Fail: " + (total - pass));
```