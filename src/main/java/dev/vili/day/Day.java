package dev.vili.day;

import dev.vili.Main;
import dev.vili.day.days.*;

import java.util.ArrayList;

public class Day {
    private static final ArrayList<Day> days = new ArrayList<>();

    public ArrayList<Day> Day() {
        days.add(new Day01());
        days.add(new Day02());
        days.add(new Day03());

        return days;
    }

    public static void solvePart1() {
    }

    public static void solvePart2() {
    }
}
