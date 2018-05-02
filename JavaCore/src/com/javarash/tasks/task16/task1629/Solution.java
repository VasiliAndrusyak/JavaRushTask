package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
  //  public static volatile AtomicInteger countReadStrings = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();

    }

    //add your code here - добавьте код тут
public static class Read3Strings extends Thread  {

        private List<String> result = new ArrayList<String>();

        @Override
        public void run() {
          int count = 0;
            while (count < 3) {
            try {
                    if (reader.ready()) {
                        result.add(reader.readLine());
                        count++;
                    }
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
       }

        public void printResult(){

            String s = result.get(0)+ " ".concat(result.get(1)+ " ".concat(result.get(2)+ " "));
            System.out.println(s);
        }
        @Override
        public String toString() {
            return result.toString();
        }
    }
}
