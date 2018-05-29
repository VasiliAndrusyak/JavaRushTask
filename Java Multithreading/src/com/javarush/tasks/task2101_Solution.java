package com.javarush.task.task21.task2101;

/*
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000


    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {

        byte[] network = new byte[4];
        for (int i = 0; i < network.length; i++) {
            network[i] = (byte) (ip[i] & mask[i]);
        }

        return network;
    }

    public static void print(byte[] bytes) {
       /* for (int i = 0; i < bytes.length; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(Byte.toUnsignedInt(bytes[i]), 2));
            while (sb.length() < 8) {
                sb.insert(0, "0");
            }
            System.out.print(sb);
            if (i < 3) {
                System.out.print(" ");
            }
        }
        System.out.println();*/


        for (int i = 0; i < bytes.length; i++) {
            System.out.print(Integer.toBinaryString(bytes[i] & 255 | 256).substring(1) + " ");
        }
        System.out.println();

    }
}
