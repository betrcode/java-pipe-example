package se.bettercode;

import java.util.Scanner;

/**
 * Simple example of a Java command line app that uses pipes
 * for input and output
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            outputLine(processLine(input.nextLine()));
        }
    }

    /**
     * Just an example of how a line might be processed. Change to whatever you need.
     */
    private static String processLine(String line) {
        return String.format("%03d", line.length()) + " " + line + " " + line.toLowerCase().contains("java");
    }

    private static void outputLine(String line) {
        System.out.println(line);
    }

}
