package com.learning.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
    public static void main(String[] args) {

        /*
         * ---------------- FILE WRITING IN JAVA ----------------
         *
         * Java provides multiple ways to write data to a file:
         *
         * 1️⃣ FileWriter
         *    - Used for writing text files
         *    - Suitable for small to medium-sized files
         *    - Overwrites existing content by default
         *
         * 2️⃣ BufferedWriter
         *    - Wraps FileWriter
         *    - Faster for large amounts of text
         *
         * 3️⃣ PrintWriter
         *    - Best for formatted / structured text (logs, reports)
         *
         * 4️⃣ FileOutputStream
         *    - Used for binary files (images, audio, videos)
         */

        /*
         * Relative file path
         * File will be created inside:
         * src/com/learning/files/
         */
        String filePath = "src/com/learning/files/test.txt";

        /*
         * Text block (Java 15+)
         * Allows multi-line string without escape characters
         */
        String textContent = """
                ===================================
                   ACCESS GRANTED
                   Welcome back, DarkKernel
                   Initializing system...
                   Loading modules ████████░░ 80%
                   Status: ONLINE
                ===================================
                """;

        /*
         * try-with-resources:
         * - Automatically closes FileWriter
         * - Prevents resource leaks
         */
        try (FileWriter writer = new FileWriter(filePath)) {

            // Writes content to the file (overwrites existing data)
            writer.write(textContent);

            System.out.println("File has been written successfully");

        }
        /*
         * Thrown if file path is invalid
         */
        catch (FileNotFoundException e) {
            System.out.println("File location not found");
        }
        /*
         * Safety net for I/O related errors
         */
        catch (IOException e) {
            System.out.println("Error while writing to file");
        }
    }
}
