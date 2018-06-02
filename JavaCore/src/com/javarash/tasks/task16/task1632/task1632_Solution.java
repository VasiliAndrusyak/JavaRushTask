package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }


    private static void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        Thread thread2 = threads.get(1);
        thread2.start();
        sleep();
        thread2.interrupt();

        Thread thread4 = threads.get(3);
        Message message = (Message) thread4;
        thread4.start();
        sleep();
        message.showWarning();
        System.out.println(thread4.isAlive());


    }

    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            try {
                while (!isInterrupted()) {

                }
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {

            }
        }
    }

    public static class MyThread4 extends Thread implements Message {
        @Override
        public void showWarning() {

            this.interrupt();
            try {
                this.join();
            } catch (Exception e) {

            }

        }

        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while (!current.interrupted()) {

            }
        }
    }

    public static class MyThread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;

            try {

                while (!isInterrupted()) {
                    String s = reader.readLine();

                    if (s.equals("N")) this.interrupt();

                    else {
                        int integer = Integer.parseInt(s);

                        sum += integer;
                    }
                }

                throw new InterruptedException();

            } catch (IOException e) {

            } catch (InterruptedException e) {
                System.out.println(sum);
            }

        }
    }
}
