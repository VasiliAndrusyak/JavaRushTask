package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут

        if (countSeconds == 3){
            clock.join();
            System.out.println("Марш!");
        }
        if (countSeconds ==4){
            clock.join();
            System.out.println("Прервано!");
        }
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run()  {
            //add your code here - добавь код тут

            while (countSeconds > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                System.out.println(countSeconds + " ");
                countSeconds--;

            }
        }
    }
}
