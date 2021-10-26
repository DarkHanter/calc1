package com.company;

public class Romans {
    protected static String[] romans = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

    public static int RomanNum(String str) {
        return switch (str) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> 0;
        };
    }

    public static void Res (Integer calc) {
        if (calc == 100)
            System.out.print("C");
        else {
            while (calc / 90 != 0) {
                System.out.print("XC");
                calc -= 90;
            }
            while (calc / 50 != 0) {
                System.out.print("L");
                calc -= 50;
            }
            while (calc / 40 != 0){
                System.out.print("XL");
                calc -= 40;
            }
            while (calc / 10 != 0){
                System.out.print("X");
                calc -= 10;
            }
            while (calc / 9 != 0){
                System.out.print("IX");
                calc -= 9;
            }
            while (calc / 8 != 0){
                System.out.print("VIII");
                calc -= 8;
            }
            while (calc / 7 != 0){
                System.out.print("VII");
                calc -= 7;
            }
            while (calc / 6 != 0){
                System.out.print("VI");
                calc -= 6;
            }
            while (calc / 5 != 0){
                System.out.print("V");
                calc -= 5;
            }
            while (calc / 4 != 0){
                System.out.print("IV");
                calc -= 4;
            }

            while (calc != 0){
                System.out.print("I");
                calc -= 1;
            }
        }
    }
}
