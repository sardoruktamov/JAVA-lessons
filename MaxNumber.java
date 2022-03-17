package com.JAVALESSON;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();

        // 1- usul
//        if (a>b && a>c){
//            System.out.printf("a max - "+a);
//        }else if (b>a && b>c){
//            System.out.printf("b max - "+b);
//        }else if (c>a && c>b) {
//            System.out.printf("c max - "+c);
//        }

        // 2-usul
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // kiritamiz: 4 5 1 8 6
        int max = 0;
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println("max- "+max);
        System.out.println("min- "+min);

    }
}
