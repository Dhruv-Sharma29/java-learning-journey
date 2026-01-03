package com.learning.projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {

        /*
         * ---------------- JAVA MUSIC PLAYER ----------------
         *
         * Java supports playing audio files using
         * the javax.sound.sampled package.
         *
         * Supported audio formats:
         * - .wav
         * - .au
         * - .aiff
         *
         * (MP3 is NOT supported by default)
         */

        String filePath = "music/Iris.wav";
        File file = new File(filePath);

        /*
         * try-with-resources:
         * - Scanner implements AutoCloseable
         * - AudioInputStream implements AutoCloseable
         * - Resources are closed automatically
         */
        try (
                Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)
        ) {

            /*
             * Clip:
             * - Used to play short audio files
             * - Loads the entire audio into memory
             */
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")) {

                System.out.println("╔════════════════════════════════╗");
                System.out.println("║   🎧  CONSOLE MUSIC PLAYER     ║");
                System.out.println("╠════════════════════════════════╣");
                System.out.println("║   ▶  P  | Play                 ║");
                System.out.println("║   ■  S  | Stop                 ║");
                System.out.println("║   ↻  R  | Restart              ║");
                System.out.println("║   ✖  Q  | Quit                 ║");
                System.out.println("╚════════════════════════════════╝");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        /*
         * Thrown if the audio file cannot be found
         */
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        /*
         * Thrown if file format is not supported
         */
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        }
        /*
         * Thrown if audio line is unavailable
         */
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        /*
         * Safety net for input/output errors
         */
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}