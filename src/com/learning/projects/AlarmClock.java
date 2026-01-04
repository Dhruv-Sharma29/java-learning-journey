package com.learning.projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    /*
     * Instance variables
     */
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    /*
     * Constructor
     */
    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    /*
     * run() executes in a separate thread
     */
    @Override
    public void run() {

        /*
         * Loop runs until current time reaches alarm time
         */
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000); // update every second

                LocalTime now = LocalTime.now();

                // Display live clock on same console line
                System.out.printf("\r%02d:%02d:%02d",
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond());
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        // Alarm triggered
        System.out.println("\n*Alarm ringing*");
        playSound(filePath);
    }

    /*
     * Plays alarm sound using Clip
     */
    private void playSound(String filePath) {

        File audioFile = new File(filePath);

        try (AudioInputStream audioStream =
                     AudioSystem.getAudioInputStream(audioFile)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("Press *Enter* to stop the alarm: ");
            scanner.nextLine();

            clip.stop();
            scanner.close();
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported");
        }
        catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        }
        catch (IOException e) {
            System.out.println("Error reading audio file");
        }
    }
}
