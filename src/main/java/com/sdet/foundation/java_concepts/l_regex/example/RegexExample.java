package com.sdet.foundation.java_concepts.l_regex.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter String: ");

            String input = scanner.nextLine();
            //what is example non word character : @,#,$,%,^,&,*,(,),_,+,=,|,\,/,?,>,<,~,`
            emailValidation(input);
//            pdfValidation(input);
//            logValidation(input);

//            regexFindMethod(input);


//            wordCharacter(input);
//            nonDigit(input);
//            endsWithA(input);
//            startWithA(input);
//            exactCount(input);
//            optionalCharacter(input);
//            isAlphabet(input);
//            isDigit(input);
//            isDigitUsingPatternAndMatcher(input);
            if(input.equals("0"))
                break;
        }


    }
    public static void emailValidation(String input){
        String emailRegex = "[A-Za-z0-9_.-]+@.+\\.com"; // Regular expression to match a valid email address
        //explain "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$" regex:
        //^ asserts the start of the string.
        //[A-Za-z0-9._%+-]+ matches one or more characters that can be uppercase letters, lowercase letters, digits, dots, underscores, percent signs, plus signs, or hyphens. This represents the local part of the email address.
        //@ matches the literal "@" character, separating the local part from the domain part.
        //[A-Za-z0-9.-]+ matches one or more characters that can be uppercase letters, lowercase letters, digits, dots, or hyphens. This represents the domain part of the email address.
        //\\. matches a literal dot character, separating the domain from the top-level domain (TLD).
        //[A-Za-z]{2,} matches two or more uppercase or lowercase letters, representing the TLD (e.g., "com", "org", "net").
        //$ asserts the end of the string.
        String emailRegex1 = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        boolean isValidEmail =  input.matches(emailRegex); // This will return true if the input matches the pattern, false otherwise
        if (isValidEmail){
            System.out.println("Input is a valid email address.");
        } else {
            System.out.println("Input is not a valid email address. Please enter a valid email address.");
        }
    }


    public static void pdfValidation(String input){
        String excelregex = ".*\\.(xls|xlsx)"; // Regular expression to match a valid email address
        String pdfregex = ".*\\.pdf"; // Regular expression to match a valid email address
        boolean isValidPdf =  input.matches(excelregex); // This will return true if the input matches the pattern, false otherwise
        if (isValidPdf){
            System.out.println("Input is a valid PDF file name.");
        } else {
            System.out.println("Input is not a valid PDF file name. Please enter a valid PDF file name.");
        }
    }

    public static void logValidation(String input){
        String regex = "^\\d{4}-\\d{2}-\\d{2}.*$"; // Regular expression to match a valid email address
        boolean isValidLog =  input.matches(regex); // This will return true if the input matches the pattern, false otherwise
        if (isValidLog){
            System.out.println("Input is a valid Log .");
        } else {
            System.out.println("Input is not a valid log . Please enter a valid log.");
        }
    }


    public static void regexFindMethod(String input){

        String regex = "\\d+"; // Regular expression to match one or more digits

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        matcher.find(); // This will return true if the input matches the pattern, false otherwise
        System.out.println(matcher.group()); // This will print the matched group (the digits found
    }

    public static void wordCharacter(String input){ //alphanumeric characters
        String regex = "\\w+"; // Regular expression to match one or more non-word characters
        boolean isWordCharacter =  input.matches(regex); // This will return true if the input matches the pattern, false otherwise
        if (isWordCharacter){
            System.out.println("Input is valid and contains only word characters.");
        } else {
            System.out.println("Input is invalid. Please enter only word characters.");
        }
    }

    public static void nonWordCharacter(String input){ //special characters
        String regex = "\\W+"; // Regular expression to match one or more non-word characters
        boolean isNonWordCharacter =  input.matches(regex); // This will return true if the input matches the pattern, false otherwise
        if (isNonWordCharacter){
            System.out.println("Input is valid and contains only non-word characters.");
        } else {
            System.out.println("Input is invalid. Please enter only non-word characters.");
        }
    }

    public static void nonDigit(String input){
        String regex = "\\D+"; // Regular expression to match one or more non-digit characters
        boolean isNonDigit =  input.matches(regex); // This will return true if the input matches the pattern, false otherwise
        if (isNonDigit){
            System.out.println("Input is valid and contains only non-digit characters.");
        } else {
            System.out.println("Input is invalid. Please enter only non-digit characters.");
        }
    }

    public static void endsWithA(String input){
        String regex = ".*A$"; // Regular expression to match strings that end with "A"
        boolean isMatch = input.matches(regex); // This will return true if the input matches the pattern, false otherwise
        if (isMatch) {
            System.out.println("Input ends with 'A'.");
        } else {
            System.out.println("Input does not end with 'A'. Please enter a string that ends with 'A'.");
        }
    }

    public static void startWithA(String input){
        String regex = "^A.*"; // Regular expression to match strings that start with "A"
        boolean isMatch = input.matches(regex); // This will return true if the input matches the pattern, false otherwise
        if (isMatch) {
            System.out.println("Input starts with 'A'.");
        } else {
            System.out.println("Input does not start with 'A'. Please enter a string that starts with 'A'.");
        }
    }


    public static void exactCount(String input){
        String regex = "\\d{10}"; // Regular expression to match "colouur"
        boolean isMatch = input.matches(regex); // This will return true if the input matches the pattern, false otherwise
        if (isMatch) {
            System.out.println("input is valid and contains exactly 10 digits.");
        } else {
            System.out.println("Input does not match the pattern. Please enter exactly 10 digits.");
        }
    }

    public static void optionalCharacter(String input){
        String regex = "colou?r"; // Regular expression to match "color" or "colour"
        boolean isMatch = input.matches(regex); // This will return true if the input matches the pattern, false otherwise
        if (isMatch) {
            System.out.println("Input matches the pattern and is either 'color' or 'colour'.");
        } else {
            System.out.println("Input does not match the pattern. Please enter 'color' or 'colour'.");
        }
    }


    public static void isAlphabet(String input){

        String regex = "[A-Za-z]+"; // Regular expression to match one or more alphabetic characters
            boolean isAlphabet =  input.matches(regex); // This will return true if the input matches the pattern, false otherwise
            if (isAlphabet){
                System.out.println("Input is valid and contains only alphabets.");
            } else {
                System.out.println("Input is invalid. Please enter only alphabets.");
            }
    }

    public static void isDigitUsingPatternAndMatcher(String input){
        String regex = "\\d+"; // Regular expression to match one or more digits
        Pattern pattern = Pattern.compile(regex); // Regular expression to match one or more digits
        Matcher matcher = pattern.matcher(input); // This will return true if the input matches the pattern, false otherwise
        boolean isMatch = matcher.matches();
        if (isMatch) {
            System.out.println("Input matches the pattern and contains only digits.");
        } else {
            System.out.println("Input does not match the pattern. Please enter only digits.");
        }
    }

    public static void isDigit(String input){
        String regex = "\\d+";
        boolean isDigit =  input.matches(regex); // This will return true if the input matches the pattern, false otherwise
        if (isDigit){
            System.out.println("Input is valid and contains only digits.");
        } else {
            System.out.println("Input is invalid. Please enter only digits.");
        }
    }

}
