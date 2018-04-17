package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {

    private static int count;

    public static void main(String[] args) throws IOException {

        int result = 0;
        int probel = 0;
        FileInputStream reader = new FileInputStream(args[0]);
        while (reader.available() > 0){
            count = (byte) reader.read();
            result++;
            if (' '== count){
                probel++;
            }
        }

        reader.close();
        System.out.printf("%.2f",( 1.0 * probel) / result * 100);
    }
}
