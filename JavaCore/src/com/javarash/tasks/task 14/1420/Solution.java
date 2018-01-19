package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(reader.readLine());
            if (x <= 0) {
                throw new NumberFormatException();
            }
            int y = Integer.parseInt(reader.readLine());
            if (y <= 0) {
                throw new NumberFormatException();
            }
            int max = 0;
            int min = x <= y ? x : y;
            for (int i = 1; i <= min; i++) {
                if (x % i == 0 && y % i == 0) {
                    max = i;
                }
            }
            System.out.println(max);
        } catch (NumberFormatException e) {
             throw new NumberFormatException();
        }
    }
}
