package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {

    public static Map<Double, String> labels = new HashMap<Double, String>(){{
        put(1.2, "арахнид");
        put(2.2, "архозавр");
        put(3.2, "зверь");
        put(4.2, "пес");
        put(5.2, "кот");
    }};

    public static void main(String[] args) {
        System.out.println(labels);
    }
}