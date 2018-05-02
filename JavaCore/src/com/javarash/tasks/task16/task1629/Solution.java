package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile AtomicInteger countReadStrings = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        int count = Integer.parseInt(reader.readLine());

        //add your code here - добавьте код тут
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();

        while (count > countReadStrings.get()) {
            }

            t1.interrupted();
            t2.interrupted();
            reader.close();

    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        private List<String> result = new ArrayList<String>();

        public void printResult(){
            System.out.println(result);
        }

        @Override
        public void run() {

            while (!isInterrupted()) {
                try {
                    if (reader.ready()) {
                        result.add(reader.readLine());
                        countReadStrings.addAndGet(1);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
