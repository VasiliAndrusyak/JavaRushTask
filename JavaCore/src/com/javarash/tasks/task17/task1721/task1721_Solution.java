package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    static {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = br.readLine();
            String file2 = br.readLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
                String s;
                while ((s = reader.readLine()) != null) {
                    allLines.add(s);
                }

            }
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file2))) {
                String s2;
                while ((s2 = bufferedReader.readLine())!= null) {
                    forRemoveLines.add(s2);
                }
            }

            catch (IOException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }

}
