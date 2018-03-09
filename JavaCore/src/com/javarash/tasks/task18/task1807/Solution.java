package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int result = 0;

        while (inputStream.available() > 0){
            int count = inputStream.read();
            if (count ==(int) ',' ){

                result++;
            }
        }
        inputStream.close();
        System.out.println(result);
    }
}
