package com.sdet.foundation.java_concepts.n_keywords;

import java.io.FileWriter;
import java.io.IOException;

public class TryKeyword {
    //Can we use try without catch or finally block?
    // The catch block is used to handle exceptions that may occur within the try block, while the finally block is used to execute code that must run regardless of whether an exception was thrown or caught.


        public static void main(String[] args) throws IOException {
            //Garbage collection and try-with-resources are examples of using try without catch or finally block.
            // Using try-with-resources without catch or finally block
            try(FileWriter fw = new FileWriter("output.txt"))
            {
                fw.write("Hello, World!");
            }
            // fw is automatically closed here
        }
}
