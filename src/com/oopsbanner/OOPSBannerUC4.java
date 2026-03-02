package com.oopsbanner;

public class OOPSBannerUC4 {

    public static void main(String[] args) {

        String line1 = String.join("", " *****  ", " *****  ", " *****  ", " *****  ");
        String line2 = String.join("", "*     * ", "*     * ", "*     * ", "*       ");
        String line3 = String.join("", "*     * ", "*     * ", " *****  ", " *****  ");
        String line4 = String.join("", "*     * ", "*     * ", " *     ", "      * ");
        String line5 = String.join("", " *****  ", " *****  ", " *      ", " *****  ");

        // Store all lines inside array
        String[] banner = { line1, line2, line3, line4, line5 };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}