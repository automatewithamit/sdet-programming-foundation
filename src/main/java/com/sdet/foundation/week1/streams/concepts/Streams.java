package com.sdet.foundation.week1.streams.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {
    //What is Stream?
    //A Stream is a sequence of elements that can be processed in parallel or sequentially.
    //It is a powerful tool for working with collections of data in a functional programming style.


    //Why do we need Stream?
    //1. It allows us to perform complex operations on collections of data in a concise and readable way.
    //2. It provides a way to process data in parallel, which can improve performance for large datasets.
    //3. It allows us to write code that is more expressive and easier to understand, as it abstracts away the details of how the data is processed.
    //4. It provides a rich set of operations for filtering, mapping, and reducing data, which can help us to write more efficient and effective code.



    //Difference between Stream and Collection:
    //1. Stream is a sequence of elements that can be processed in parallel or sequentially, while Collection is a data structure that holds a group of objects.
    //2. Stream does not store data, it is a view of a data source, while Collection stores data in memory.


    //Different ways to create a Stream:
    //1. From a Collection: You can create a Stream from any Collection (like List, Set, etc.) using the stream() method.
    //2. From an Array: You can create a Stream from an array using the Arrays.stream() method.
    //3. From a Stream Builder: You can create a Stream using the Stream.builder() method, which allows you to build a Stream by adding elements one by one.
    //4. From a Stream of Values: You can create a Stream using the Stream.of() method, which allows you to create a Stream from a fixed set of values.
    //5. From a Stream of Infinite Values: You can create an infinite Stream using the Stream.generate() or Stream.iterate() methods, which allow you to create a Stream that generates values on demand.

    //Example of creating a Stream from a Collection
    //List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
    //Stream<String> nameStream = names.stream();

    //Example of How Streams actually solve the problem of iterating over a collection and performing operations on it in a more concise and readable way
    //List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
    //List<String> filteredNames = names.stream()
    //        .filter(name -> name.startsWith("A")) // Filter names that start with "A"
    //        .collect(Collectors.toList()); // Collect the results into a List
    //System.out.println(filteredNames); // Output: [Alice]


    //reduce() method is used to perform a reduction on the elements of a stream, using an associative accumulation function and an optional identity value. It is typically used to combine the elements of a stream into a single result, such as summing a list of numbers or concatenating a list of strings.
    //Example of using reduce() method to sum a list of numbers
    public static void main(String[] args) {
        System.out.println("Sum using reduce:" + sumUsingReduce());
        System.out.println("Max using reduce:" + findMaxUsingReduce());
        findMaxUsingReduce();
    }
    public static  int sumUsingReduce() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int sum=0;
        // Sums the numbers in the stream
        sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        return sum;
        //System.out.println(sum); // Output: 10
    }
    public static Integer findMaxUsingReduce() {

        List<Integer> numbers = Arrays.asList(3, 125, 112, 9);

        // Finds the maximum value in the stream
        Optional<Integer> max = numbers.stream()
                .reduce((a, b) -> a > b ? a : b);
        return max.orElse(null);
//        max.ifPresent(System.out::println); // Output: 9
    }

}
