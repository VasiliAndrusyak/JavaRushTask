package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());


        int dataMax = inputStream.read();

        while (inputStream.available() > 0 ){

            int data = inputStream.read();
            if (data > dataMax){

                dataMax = data;
            }
        }
        inputStream.close();
        System.out.println(dataMax);
    }
}
