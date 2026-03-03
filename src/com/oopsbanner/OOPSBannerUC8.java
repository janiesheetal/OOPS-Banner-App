package com.oopsbanner;

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // Method to build and return pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return patternMap;
    }

    // Method to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        StringBuilder[] output = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            output[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            for (int i = 0; i < 7; i++) {
                output[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : output) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }
}