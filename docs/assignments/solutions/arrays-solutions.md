# Array Solutions

---

## 1. Print elements

```java
for(int num : arr)
    System.out.print(num + " ");
```

---

## 2. Even index

```java
for(int i = 0; i < arr.length; i++) {
    if(i % 2 == 0)
        System.out.print(arr[i] + " ");
}
```

---

## 3. Reverse

```java
for(int i = arr.length - 1; i >= 0; i--)
    System.out.print(arr[i] + " ");
```

---

## 4. Sum

```java
int sum = 0;

for(int num : arr)
    sum += num;

System.out.println(sum);
```

---

## 5. Max

```java
int max = arr[0];

for(int num : arr)
    if(num > max)
        max = num;

System.out.println(max);
```

---

## 8. Replace negative

```java
for(int i = 0; i < arr.length; i++) {
    if(arr[i] < 0)
        arr[i] = 0;
}
```

---

## 11. Search

```java
boolean found = false;

for(int num : arr)
    if(num == key)
        found = true;

System.out.println(found ? "Found" : "Not Found");
```

---

## 13. Duplicate check

```java
boolean duplicate = false;

for(int i = 0; i < arr.length; i++) {
    for(int j = i + 1; j < arr.length; j++) {
        if(arr[i] == arr[j])
            duplicate = true;
    }
}
System.out.println(duplicate ? "Duplicate Found" : "No Duplicate");
```

---

## 16. Reverse in-place

```java
int start = 0, end = arr.length - 1;

while(start < end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}
```

---

## 19. Move zeros

```java
int index = 0;

for(int num : arr)
    if(num != 0)
        arr[index++] = num;

while(index < arr.length)
    arr[index++] = 0;
```

---

## 22. Missing number

```java
int n = arr.length + 1;

int expected = n * (n + 1) / 2;

int actual = 0;

for(int num : arr)
    actual += num;

System.out.println(expected - actual);
```

---

## 23. Pair sum

```java
for(int i = 0; i < arr.length; i++) {
    for(int j = i+1; j < arr.length; j++) {
        if(arr[i] + arr[j] == target)
            System.out.println(arr[i] + ", " + arr[j]);
    }
}
```

---

## 26. Frequency

```java
for(int i = 0; i < arr.length; i++) {

    int count = 1;

    for(int j = i+1; j < arr.length; j++) {
        if(arr[i] == arr[j])
            count++;
    }

    System.out.println(arr[i] + " -> " + count);
}
```

---

## 30. Equilibrium index

### Logic

Left sum = sum of elements before index  
Right sum = after index

```java
for(int i = 0; i < arr.length; i++) {

    int left = 0, right = 0;

    for(int j = 0; j < i; j++)
        left += arr[j];

    for(int j = i+1; j < arr.length; j++)
        right += arr[j];

    if(left == right) {
        System.out.println(i);
        break;
    }
}
```