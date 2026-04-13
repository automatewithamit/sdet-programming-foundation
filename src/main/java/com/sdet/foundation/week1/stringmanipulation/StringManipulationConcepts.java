package com.sdet.foundation.week1.stringmanipulation;

import java.util.Arrays;

public class StringManipulationConcepts {
    public static void main(String[] args) {

        //Topics to cover:

        //1. String Creation and Immutability
        String str1 = "Hello"; // String literal

        String str2 = new String("Hello"); // Using constructor
        //String literals are stored in the string pool, and if you create a string using a string literal, it will check the pool for an existing string with the same content. If it finds one, it will return a reference to that string. If not, it will create a new string in the pool. On the other hand, when you create a string using the constructor, it will always create a new string object in the heap, even if an identical string already exists in the string pool. This is because the constructor does not check the string pool for existing strings and directly creates a new object in the heap memory.
        //String immutability means that once a String object is created,
        // its value cannot be changed. Any operation that seems to modify a string actually creates a new string object with the modified value, while the original string remains unchanged.
        // This is because strings are stored in a special area of memory called the string pool, which allows for efficient memory usage and performance.

        //Example of String Immutability
        String original = "Hello";
        String modified = original.concat(" World");
        System.out.println("Original String: " + original); // Output: Hello
        System.out.println("Modified String: " + modified); // Output: Hello World
        //In this example, the original string "Hello" remains unchanged, and a new string "Hello World" is created as a result of the concatenation operation.
        //This demonstrates the immutability of strings in Java.
        //When you perform operations on a string, such as concatenation, substring, or replacement, a new string object is created to hold the result of the operation.
        //The original string remains unchanged, and any references to it will still point to the original string object in memory.
        //This is an important aspect of string manipulation in Java and is a key reason why strings are immutable.

        //Example of String methods and immutability
        String str = "Hello";
        String upperStr = str.toUpperCase();
        System.out.println("Original String: " + str); // Output: Hello
        System.out.println("Uppercase String: " + upperStr); // Output: HELLO
        System.out.println("------------------------------------------------");
        //In this example, the original string "Hello" remains unchanged, and a new string "HELLO" is created as a result of the toUpperCase() method. This further illustrates
        //Example of String Methods
        String greeting = "Hello, World!";
        int length = greeting.length(); // Returns the length of the string
        char firstChar = greeting.charAt(0); // Returns the character at the specified index
        char lastChar = greeting.charAt(greeting.length() - 1); // Returns the last character of the string
        String substring = greeting.substring(0, 5); // Returns a substring from index
        int indexOfComma = greeting.indexOf(','); // Returns the index of the first occurrence of a character
        int lastIndexOfO = greeting.lastIndexOf('o'); // Returns the index of the last occurrence of a character
        String upperCaseGreeting = greeting.toUpperCase(); // Converts the string to uppercase
        String lowerCaseGreeting = greeting.toLowerCase(); // Converts the string to lowercase
        String trimmedGreeting = greeting.trim(); // Removes leading and trailing whitespace
        String replacedGreeting = greeting.replace("World", "Java"); // Replaces occurrences of a substring with another substring
        String concatenatedGreeting = greeting + " Welcome!"; // Concatenates two strings using the + operator
        String concatenatedGreetingUsingConcat = greeting.concat(" Welcome!"); // Concatenates two strings using the concat() method
        String splitGreeting[] = greeting.trim().split(","); // Splits the string into an array based on a delimiter
        String splitGreetingUsingSplit = greeting.trim().split(",")[0]; // Splits the string and retrieves the first part


        System.out.println("Original String: " + greeting);
        System.out.println("Length: " + length);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: " + lastChar);
        System.out.println("Substring: " + substring);
        System.out.println("Index of ',': " + indexOfComma);
        System.out.println("Last Index of 'o': " + lastIndexOfO);
        System.out.println("Uppercase Greeting: " + upperCaseGreeting);
        System.out.println("Lowercase Greeting: " + lowerCaseGreeting);
        System.out.println("Trimmed Greeting: " + trimmedGreeting);
        System.out.println("Replaced Greeting: " + replacedGreeting);
        System.out.println("Concatenated Greeting using + operator: " + concatenatedGreeting);
        System.out.println("Concatenated Greeting using concat() method: " + concatenatedGreeting);
        System.out.println("Split Greeting: " + Arrays.toString(splitGreeting));
        System.out.println("Split Greeting using split() method: " + splitGreetingUsingSplit);

        System.out.println("------------------------------------------------");
        // StringBuffer and StringBuilder are mutable classes that allow you to modify strings without creating new string objects.
        //StringBuffer is synchronized, which means it is thread-safe and can be used in multi-threaded environments.
        //However, it is generally slower than StringBuilder due to the overhead of synchronization.
        // They provide methods for appending, inserting, deleting, and replacing characters in a string.
        // Code Examples of StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World"); // Appends the specified string to the end of this sequence
        System.out.println("StringBuffer after append: " + stringBuffer);
        stringBuffer.insert(5, ","); // Inserts the specified string at the specified position in this sequence
        System.out.println("StringBuffer after insert: " + stringBuffer);
        stringBuffer.delete(5, 6); // Removes the characters in a substring of this sequence
        System.out.println("StringBuffer after delete: " + stringBuffer);
        stringBuffer.replace(0, 5, "Hi"); // Replaces the characters in a substring of this sequence with characters in the specified String
        System.out.println("StringBuffer after replace: " + stringBuffer);
        stringBuffer.reverse(); // Reverses the sequence of characters in this StringBuffer
        System.out.println("StringBuffer after reverse: " + stringBuffer);
        stringBuffer.setLength(5); // Sets the length of this character sequence
        System.out.println("StringBuffer after setLength: " + stringBuffer);
        stringBuffer.setCharAt(0, 'h'); // Sets the character at the specified index to the specified character
        System.out.println("StringBuffer after setCharAt: " + stringBuffer);

        System.out.println("------------------------------------------------");

        // StringBuilder is a mutable class that provides an API for modifying strings without creating new string objects.
        // It is not synchronized, which means it is not thread-safe but offers better performance in single-threaded scenarios.
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World"); // Appends the specified string to the end of this sequence
        System.out.println("StringBuilder after append: " + stringBuilder);
        stringBuilder.insert(5, ","); // Inserts the specified string at the specified position in this sequence
        System.out.println("StringBuilder after insert: " + stringBuilder);
        stringBuilder.delete(5, 6); // Removes the characters in a substring of this sequence
        System.out.println("StringBuilder after delete: " + stringBuilder);
        stringBuilder.replace(0, 5, "Hi"); // Replaces the characters in a substring of this sequence with characters in the specified String
        System.out.println("StringBuilder after replace: " + stringBuilder);
        stringBuilder.reverse(); // Reverses the sequence of characters in this StringBuilder
        System.out.println("StringBuilder after reverse: " + stringBuilder);
        stringBuilder.setLength(5); // Sets the length of this character sequence
        System.out.println("StringBuilder after setLength: " + stringBuilder);
        stringBuilder.setCharAt(0, 'h'); // Sets the character at the specified index to the specified character
        System.out.println("StringBuilder after setCharAt: " + stringBuilder);
        System.out.println("------------------------------------------------");

        //Difference between String, StringBuilder, and StringBuffer in Java:
        //1. Mutability: String is immutable, while StringBuilder and StringBuffer are mutable.
        //2. Thread Safety: StringBuffer is synchronized and thread-safe, while StringBuilder is not synchronized and not thread-safe. String is immutable, so it is inherently thread-safe.
        //3. Performance: StringBuilder is generally faster than StringBuffer due to the lack of synchronization overhead.
        //4. Usage: String is used when you need to represent fixed text that does not change, while StringBuilder and StringBuffer are used when you need to manipulate strings frequently, such as in loops or when building complex strings dynamically.


    }

}
