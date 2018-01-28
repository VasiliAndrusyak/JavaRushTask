package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        
        printMatrix(2, 3, "8");
        printMatrix(3.2, 4.3, "10");
        printMatrix(1,1.2,"12");
        printMatrix(1.2,2,"14");
        printMatrix(1,2.2f,"16");
        printMatrix(1.0f,2,"18");
        printMatrix(2.0f,2.3,"20");
        printMatrix(2.2,1.0f,"22");
        printMatrix(2.3,'S',"24");

    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
        System.out.println();
    }


    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + "  method 2 ");
            }
            System.out.println();
        }
    }


    public static void printMatrix(double m, double n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + "  method 3 ");
            }
            System.out.println();
        }
    }


    public static void printMatrix(int m, double n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value + "  method 4 ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value  + "  method 5 ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, float n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value  + "  method 6 ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(float m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value  + "  method 7 ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(float m, double n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value  + "  method 8 ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double m, float n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value  + "  method 9 ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double m, char n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value  + "  method 10 ");
            }
            System.out.println();
        }
    }


}
