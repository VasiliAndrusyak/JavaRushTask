package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList();

        while (inputStream.available() > 0){
            list.add(inputStream.read());
        }

        if (list.size()%2  == 0){
            for (int i = 0; i < list.size()/2; i++) {
                fileOutputStream.write(list.get(i));
            }
            for (int i = list.size()/2; i < list.size(); i++) {
                fileOutputStream2.write(list.get(i));
            }
        }
        else{
            for (int i = 0; i < list.size()/2 +1; i++) {
                fileOutputStream.write(list.get(i));
            }
            for (int i = list.size()/2 +1 ; i < list.size(); i++) {
                fileOutputStream2.write(list.get(i));
            }
        }
        inputStream.close();
        fileOutputStream.close();
        fileOutputStream2.close();
    }
}
