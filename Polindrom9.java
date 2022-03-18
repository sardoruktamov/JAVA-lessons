package com.JAVALESSON;

import java.util.Scanner;

public class Polindrom9 {
    // 1-usul
//    public static void main(String[] args) {
//        Polindrom9 polindrom9 = new Polindrom9();
//        System.out.println(polindrom9.isPolindrome(100));;
//    }
//
//    public boolean isPolindrome(int x) {
//        int temp = x;
//        int reverseNumber = 0;
//        while (x>0){
//            int d = x % 10;
//            x = x / 10;
//            reverseNumber = reverseNumber * 10 +d;
//        }
//        return reverseNumber == temp;
//    }

    // 2-usul
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        int x = temp;
        int reverseNumber = 0;
        while (x>0){
            int d = x % 10;
            x = x / 10;
            reverseNumber = reverseNumber * 10 +d;
        }
        System.out.println("rev= "+reverseNumber);
        System.out.println("x= "+x);

        if (reverseNumber == temp){
            System.out.println("Polindirom: "+reverseNumber);
        }else {
            System.out.println("Polindirom emas");
        }
    }



}
