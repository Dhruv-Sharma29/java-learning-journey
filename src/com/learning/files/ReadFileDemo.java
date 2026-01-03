package com.learning.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
    public static void main(String[] args) {

        /*
         * ---------------- FILE READING IN JAVA ----------------
         *
         * Common ways to read files:
         *
         * 1️⃣ BufferedReader + FileReader
         *    - Best for reading text files
         *    - Reads data line-by-line
         *    - Efficient and commonly used
         *
         * 2️⃣ FileInputStream
         *    - Used for binary files (images, audio, videos)
         *
         * 3️⃣ RandomAccessFile
         *    - Used to read/write specific parts of large files
         */

        /*
         * Relative path to the file
         * File is located inside:
         * src/com/learning/files/
         */
        String filePath = "src/com/learning/files/test.txt";

        /*
         * try-with-resources:
         * - Automatically closes BufferedReader and FileReader
         * - Prevents memory leaks
         */
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            /*
             * Reads file line-by-line
             * readLine() returns:
             * - A line of text
             * - null when end of file is reached
             */
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        /*
         * Thrown if file path is invalid or file doesn't exist
         */
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        /*
         * Safety net for input/output errors
         */
        catch (IOException e) {
            System.out.println("Something went wrong while reading the file");
        }
    }
}