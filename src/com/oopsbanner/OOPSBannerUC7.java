package com.oopsbanner;

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC7 {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));

        String word = "OOPS";
        StringBuilder[] output = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            output[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {
            String[] pattern = patternMap.get(ch).getPattern();

            for (int i = 0; i < 7; i++) {
                output[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : output) {
            System.out.println(line);
        }
    }
}