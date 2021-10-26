package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.Romans.*;

public class Calculations {
    private static int number_1, number_2;
    private static void calc_arab(int number_1, int number_2, String str_2) throws Exception {
        int res = 0;
        switch (str_2) {
            case "+" -> {
                res = number_1 + number_2;
                System.out.println(number_1 + " + " + number_2 + " = " + res);
            }
            case "-" -> {
                res = number_1 - number_2;
                System.out.println(number_1 + " - " + number_2 + " = " + res);
            }
            case "*" -> {
                res = number_1 * number_2;
                System.out.println(number_1 + " * " + number_2 + " = " + res);
            }
            default -> {
                res = number_1 / number_2;
                System.out.println(number_1 + " / " + number_2 + " = " + res);
            }
        }
    }

    private static void calc_roman(String str_2, String str_1, String str_3) throws Exception {
        int res = 0;
        number_1 = RomanNum(str_1);
        number_2 = RomanNum(str_3);
        if (number_1 < 1 || number_1 > 10 || number_2 < 1 || number_2 > 10) {
            throw new Exception("Первое и/или второе число больше 10 и/или меньше 1");
        }
        switch (str_2) {
            case "+" -> {
                res = number_1 + number_2;
                System.out.print(str_1 + " + " + str_3 + " = ");
                Res(res);
            }
            case "-" -> {
                if (number_1 < number_2) {
                    throw new Exception("Римские числа не могут быть отрицательными");
                }
                if (number_1 == number_2) {
                    throw new Exception("Не может быть ноль");
                }
                res = number_1 - number_2;
                System.out.print(str_1 + " - " + str_3 + " = ");
                Res(res);
            }
            case "*" -> {
                res = number_1 * number_2;
                System.out.print(str_1 + " * " + str_3 + " = ");
                Res(res);
            }
            default -> {
                res = number_1 / number_2;
                System.out.print(str_1 + " / " + str_3 + " = ");
                Res(res);
            }
        }
    }

    protected static void calculated() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str_1 = scanner.next();
        String str_2 = scanner.next();
        String str_3 = scanner.next();
        try {
            if(Arrays.asList(romans).contains(str_1)) {
                calc_roman(str_2, str_1, str_3);
            }
            else {
                number_1 = Integer.parseInt(str_1);
                number_2 = Integer.parseInt(str_3);
                if (number_1 < 1 || number_1 > 10 || number_2 < 1 || number_2 > 10) {
                    throw new Exception("Первое и/или второе число больше 10 и/или меньше 1");
                }
                calc_arab(number_1, number_2, str_2);
            }
        }
        catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат данных");
        }
    }
}
