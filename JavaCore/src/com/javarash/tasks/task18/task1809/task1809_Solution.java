package com.javarush.task.task18.task1809;
/* 
Реверс файла
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

        ArrayList<String> list = new ArrayList();

        while (inputStream.available() > 0){
            list.add(String.valueOf(inputStream.read()));
        }
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            fileOutputStream.write(Integer.parseInt(list.get(i)));
        }

        inputStream.close();
        fileOutputStream.close();
    }
}
