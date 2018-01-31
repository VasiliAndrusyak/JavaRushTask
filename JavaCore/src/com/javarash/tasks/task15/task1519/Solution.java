package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!((str = reader.readLine()).equals("exit"))) {
            try {
                if (str.contains(".")) {
                    print(Double.parseDouble(str));
                    continue;
                }

                Integer integer = Integer.parseInt(str);
                if (integer <= 0 || integer >= 128) {
                    print(integer);
                    continue;
                }

                short sh = Short.parseShort(str);
                if (sh > 0 && sh < 128) {
                    print((short) sh);
                    continue;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            print(str);
        }
        //напиште тут ваш код

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
