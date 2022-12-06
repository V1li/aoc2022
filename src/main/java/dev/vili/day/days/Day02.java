package dev.vili.day.days;

import dev.vili.Main;
import dev.vili.day.Day;

import java.io.File;
import java.util.Scanner;

public class Day02 extends Day {
    private final static String input = "input/input2.txt";

    public static void solvePart1() {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(input));
            int total = 0;

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                total += eval(line);
            }
            Main.logger.info("Total: " + total);

        } catch (Exception e) {
            Main.logger.severe("Could not find input file");
        }
    }

    public static void solvePart2() {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(input));
            int total = 0;

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                total += eval2(line);
            }
            Main.logger.info("Total: " + total);
        } catch (Exception e) {
            Main.logger.severe("Could not find input file");
        }
    }

    private static int eval(String strat) {
        int score = 0;
        String[] choices = strat.split(" ");
        int otherChoice = choices[0].compareTo("A");
        int myChoice = choices[1].compareTo("X");
        int diffMod3 = Math.floorMod((otherChoice - myChoice),3);

        switch (diffMod3) {
            case 0: score += 3; break;
            case 1: break;
            case 2: score += 6; break;
        }

        score += myChoice + 1;
        return score;
    }

    private static int eval2(String strat) {
        int score = 0;
        String[] choices = strat.split(" ");
        int otherChoice = choices[0].compareTo("A");
        int result = choices[1].compareTo("X");

        switch (result) {
            case 0 -> score += Math.floorMod(otherChoice - 1, 3) + 1;
            case 1 -> score += (otherChoice + 1) + 3;
            case 2 -> score += Math.floorMod(otherChoice + 1, 3) + 6 + 1;
        }
        return score;
    }
}
