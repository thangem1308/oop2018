package week10;

import java.util.Random;

public class Task2 {
    public static void main (String[] args) throws  ArrayIndexOutOfBoundsException{
        int[] A = new int[1000];
        int temp;
        Random rd = new Random();
        for (int i = 0; i <= 999; i++) {
            A[i] = rd.nextInt(2001) - 1000;
        }
        for (int i = 0; i <= 999; i++) {
            for (int j = 0; j < 999 - i; j++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for (int i=0;i<=999;i++){
            System.out.println(A[i]+"   ");
        }
    }}
