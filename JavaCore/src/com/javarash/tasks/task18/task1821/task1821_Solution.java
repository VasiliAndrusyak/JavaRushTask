package com.javarush.task.task18.task1821;
/*
Встречаемость символов
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        int count = 1;
        FileInputStream fileInputStream = new FileInputStream(new File(args[0]));
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        while (fileInputStream.available() > 0) {
            char values = (char) fileInputStream.read();
            if (treeMap.containsKey(values)) {
                treeMap.put(values, treeMap.get(values)+1);
            }else{
                treeMap.put(values, count);
            }
        }

        fileInputStream.close();

        for (Map.Entry e : treeMap.entrySet()) {
            System.out.println(e.getKey()+ " " + e.getValue());
        }
    }
}
