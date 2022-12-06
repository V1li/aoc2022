package dev.vili.day.days;

import dev.vili.Main;
import dev.vili.day.Day;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day01 extends Day {
    private final static String input = "input/input1.txt";

    public static void solvePart1() {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(input));
        } catch (Exception e) {
            Main.logger.severe("Could not find input file");
            return;
        }

        int mostCalories = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int calories = 0;

            while (!line.equals("") && scanner.hasNext()) {
                calories += Integer.parseInt(line);
                line = scanner.nextLine();
            }

            if (calories > mostCalories) mostCalories = calories;
        }

        Main.logger.info("Most calories: " + mostCalories);
    }

    public static void solvePart2() {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(input));
        } catch (Exception e) {
            Main.logger.severe("Could not find input file");
            return;
        }
        
        ArrayList<Integer> calorieList = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int calories = 0;

            while (!line.equals("")) {
                calories += Integer.parseInt(line);
                if (scanner.hasNext()) line = scanner.nextLine();
                else break;
            }

            calorieList.add(calories);
        }

        Collections.sort(calorieList);
        Collections.reverse(calorieList);
        Main.logger.info(String.valueOf(calorieList.remove(0) + calorieList.remove(0) + calorieList.remove(0)));
    }
}
