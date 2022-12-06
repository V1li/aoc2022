package dev.vili;

import dev.vili.day.Day;
import dev.vili.day.days.Day01;
import dev.vili.day.days.Day02;
import dev.vili.day.days.Day03;

import java.util.logging.Logger;


public class Main {
    public static Logger logger = Logger.getLogger("Logger");

    public static void main(String[] args) {
        logger.info("Advent of Code 2022");

        logger.info("Day 1");
        Day01.solvePart1();
        Day01.solvePart2();

        logger.info("--------------------");

        logger.info("Day 2");
        Day02.solvePart1();
        Day02.solvePart2();

        logger.info("--------------------");

        logger.info("Day 3");
        Day03.solvePart1();
        Day03.solvePart2();
    }
}