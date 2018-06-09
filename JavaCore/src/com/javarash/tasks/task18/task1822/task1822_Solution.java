package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        StringBuilder text = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line+ '\n');
                if (line.startsWith(args[0] + " ")){
                    System.out.println(line);
                }
            }
            br.close();
        }
        catch (IOException e) {
            // Обрабатываем ошибки
        }
    }
}
