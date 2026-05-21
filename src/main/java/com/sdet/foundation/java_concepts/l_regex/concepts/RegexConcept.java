package com.sdet.foundation.java_concepts.l_regex.concepts;

public class RegexConcept {
        // What is Regex?
        // Regular Expressions (Regex) are a powerful tool for pattern matching and manipulation of strings.
        // They allow you to define search patterns that can be used for string matching, validation, and replacement.

//        Common Regex Patterns in Java
//        1. Email Validation: A regex pattern to validate email addresses.
//        2. Phone Number Validation: A regex pattern to validate phone numbers in a specific format (e.g., 123-456-7890).
//        3. URL Validation: A regex pattern to validate URLs.
//        4. Password Validation: A regex pattern to enforce password complexity requirements (e.g., at least 8 characters, including uppercase, lowercase, digits, and special characters).
//        5. Date Validation: A regex pattern to validate date formats (e.g., MM/DD/YYYY).
//        6. Only Letters: A regex pattern to validate that a string contains only letters (both uppercase and lowercase).
//        7. Only Digits: A regex pattern to validate that a string contains only digits.
//        8. Alphanumeric: A regex pattern to validate that a string contains only letters and digits.
//        9. Whitespace Validation: A regex pattern to validate that a string does not contain any whitespace characters.
//        10. Custom Patterns: You can create custom regex patterns to match specific formats or requirements based on your needs




    public static void validateEmailWithoutRegex(String email) {
        // A simple validation without regex (not recommended for real-world use)
        if (email.contains("@") && email.contains(".") && email.indexOf("@") < email.lastIndexOf(".")) {
            System.out.println("Valid email: " + email);
            //automatewithamit@gmail.com

        } else {
            System.out.println("Invalid email: " + email);
        }
    }
    public static void validateEmailWithRegex(String email) {
        // A simple regex for validating email addresses (not exhaustive)
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (email.matches(emailRegex)) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email: " + email);
        }
    }
    public static void validateOnlyStringWithRegex(String input) {
        // A regex to validate that the input contains only letters (both uppercase and lowercase)

        String stringRegex = "^[A-Z]+$";
        if (input.matches(stringRegex)) {
            System.out.println("Valid string: " + input);
        } else {
            System.out.println("Invalid string: " + input);
        }
    }
    public static void lengthOfStringWithRegex(String input) {
        // A regex to validate that the input is exactly 5 characters long
        String lengthRegex = "^.{5}$";
        if (input.matches(lengthRegex)) {
            System.out.println("Valid string of length 5: " + input);
        } else {
            System.out.println("Invalid string (not length 5): " + input);
        }
    }
    public static void validatePhoneNumberWithRegex(String phoneNumber) {
        // A simple regex for validating phone numbers (e.g., 123-456-7890)
        String phoneRegex = "^\\d{3}-\\d{3}-\\d{4}$";
        if (phoneNumber.matches(phoneRegex)) {
            System.out.println("Valid phone number: " + phoneNumber);
        } else {
            System.out.println("Invalid phone number: " + phoneNumber);
        }
    }

    //Example of using regex in Java
    public static void main(String[] args) {
        //Patterns in regex:
        //1. Character classes: [abc] matches any one of the characters a, b, or c.
        //2. Quantifiers: a* matches zero or more occurrences of the character a, a+ matches one or more occurrences of a, and a? matches zero or one occurrence of a.
        //3. Anchors: ^ matches the start of a string, and $ matches the end of a string.
        //4. Groups and capturing: (abc) matches the sequence "abc" and captures it as a group that can be referenced later.
        //5. Alternation: a|b matches either a or b.
        //6. Escape sequences: \d matches any digit, \w matches any word character, and \s matches any whitespace character.


        validateOnlyStringWithRegex("HELLO"); // Valid string
        validateOnlyStringWithRegex("Hello123"); // Invalid string


//        String input = "The rain in Spain stays mainly in the plain.";
//        String regex = "\\b\\w+ain\\b"; // This regex matches words that end with "ain"
//        //Ways to use regex in Java
//        //1. Using String.matches() method
//        boolean matches = input.matches(".*\\b\\w+ain\\b.*");
//        System.out.println("Does the input match the regex? " + matches);
//        //2. Using Pattern and Matcher classes
//        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
//        java.util.regex.Matcher matcher = pattern.matcher(input);
//        System.out.println("Words that match the regex:");
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
    }
}
