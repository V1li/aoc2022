package dev.vili.day.days;

import dev.vili.Main;
import dev.vili.day.Day;

import java.io.File;
import java.util.Scanner;

public class Day03 extends Day {
    private final static String input = "input/input3.txt";

    public static void solvePart1() {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(input));
            int total = 0;

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                int half = line.length() / 2;
                String firstHalf = line.substring(0,half);
                String secondHalf = line.substring(half);
                for (int i = 0; i < firstHalf.length(); i++) {
                    String c = firstHalf.substring(i,i+1);

                    if (secondHalf.contains(c)) {
                        total += decode(c);
                        break;
                    }
                }
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
                String[] rucksacks = new String[3];
                for (int i = 0; i < 3; i++) {
                    rucksacks[i] = scanner.nextLine();
                }
                for (int i = 0; i < rucksacks[0].length(); i++) {
                    String curr = rucksacks[0].substring(i,i+1);
                    if(rucksacks[1].contains(curr) && rucksacks[2].contains(curr)) {
                        total += decode(curr);
                        break;
                    }
                }


            }
            Main.logger.info("Total: " + total);
        } catch (Exception e) {
            Main.logger.severe("Could not find input file");
        }
    }

    private static int decode(String c) {
        if(c.compareTo("a")>=0) {
            return c.compareTo("a") + 1;
        } else {
            return c.compareTo("A") + 27;
        }
    }

}
