
it's not work yet


package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

       /* String input = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        String input = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";*/

        String input = reader.readLine();
        Pattern pattern = Pattern.compile("[ ,!?&]");
        String[] words = pattern.split(input);

            if (words[2].equals("obj=3.14")){
                alert(words[1]);
            }
            else alert("lvl");

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
// https://metanit.com/java/tutorial/7.4.php
