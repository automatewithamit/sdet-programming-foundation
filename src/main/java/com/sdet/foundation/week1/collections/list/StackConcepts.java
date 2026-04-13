package com.sdet.foundation.week1.collections.list;

import java.util.Stack;

public class StackConcepts {
    public static void main(String[] args) {
        //Stack is a linear data structure that follows the Last In First Out (LIFO) principle, where the last element added to the stack is the first one to be removed. It can be implemented using arrays or linked lists.
        //Example of Stack
        //Differnce between Stack and Vector
        //1. Stack is a subclass of Vector, which means that Stack inherits all the methods of Vector. However, Stack is designed to be used as a last-in-first-out (LIFO) data structure, while Vector is a more general-purpose dynamic array that can be used for various purposes.
        //2. Stack provides additional methods such as push(), pop(), peek(), and search() that are specific to stack operations, while Vector does not have these methods.
        //3. Stack is synchronized, which means that it is thread-safe and can be used in multi-threaded environments without the need for external synchronization. Vector is also synchronized, but it is generally considered less efficient than Stack for stack operations due to its more general-purpose design.
        Stack<String> stack = new Stack<String>();

        //Adding elements to the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after pushing elements: " + stack);
        //Removing elements from the stack
        String removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack after popping an element: " + stack);
        //Peeking at the top element of the stack
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        //Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
        //Getting the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
        //Searching for an element in the stack
        int position = stack.search("Cherry");
        if (position != -1) {
            System.out.println("Element 'Cherry' found at position: " + position);
        } else {
            System.out.println("Element 'Cherry' not found in the stack.");
        }
        //Clearing the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
        stack.add("Date");
        stack.add("Elderberry");
        System.out.println("Stack after adding new elements: " + stack);
        //All the mentions methods are available in Stack class because Stack class extends Vector class, which is a part of the Java Collections Framework. Therefore, Stack inherits all the methods of the Vector class, allowing you to use them with Stack objects.

        System.out.println(reverseString("Hello World"));
    }

    //Create a method to reverse a string using stack
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        // Push each character of the string onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);// Push each character of the string onto the stack
        }
        StringBuilder reversed = new StringBuilder();
        // Pop characters from the stack and append to the reversed string
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());// Pop characters from the stack and append to the reversed string
        }
        return reversed.toString();
    }
}
