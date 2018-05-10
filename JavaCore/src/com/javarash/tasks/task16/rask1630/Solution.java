package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;


public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут

    static {
        try {

            BufferedReader reader1 = new BufferedReader (new InputStreamReader (System.in));
            BufferedReader reader2 = new BufferedReader (new InputStreamReader (System.in));
            firstFileName = reader1.readLine ();
            secondFileName = reader2.readLine ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static  class  ReadFileThread extends Thread implements ReadFileInterface{

        String fileName;
        String strLine = "";
        String allLines = "";
        ArrayList<String> stringList = new ArrayList<> ();

        @Override
        public void run() {
            try{
                FileInputStream fstream = new FileInputStream(fileName);
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                for (int i = 0; (strLine = br.readLine ()) != null ; i++) {
                    stringList.add (i, strLine);
                }
               /* while ((strLine = br.readLine()) != null){
                }*/
                for (int i = 0; i < stringList.size () ; i++) {
                    allLines += stringList.get (i) + " ";
                }


            }catch (IOException e){
                System.out.println("Ошибка");
            }

        }

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return allLines;
        }
    }
}
