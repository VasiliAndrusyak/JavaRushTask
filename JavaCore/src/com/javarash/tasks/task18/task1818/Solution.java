package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine(),true);
        FileInputStream  fileInputStream1 = new FileInputStream(bufferedReader.readLine());
        FileInputStream  fileInputStream2 = new FileInputStream(bufferedReader.readLine());

        byte[] buffer = new byte[1000];
        while (fileInputStream1.available() > 0 ){
            int count = fileInputStream1.read(buffer);
            fileOutputStream.write(buffer, 0, count);
        }
        while (fileInputStream2.available() > 0 ){
            int count = fileInputStream2.read(buffer);
            fileOutputStream.write(buffer, 0, count);
        }
        fileOutputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();

    }
}
