package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        FileInputStream reader = new FileInputStream(args[0]);
        int result = 0;
        while (reader.available() > 0){
           int count = (byte) reader.read();
            if (count >='A' && count <= 'z' ){
                result++;
            }
        }
        reader.close();
        System.out.println(result);
    }
}
