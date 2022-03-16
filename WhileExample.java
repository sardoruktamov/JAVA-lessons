import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 1-usul
        StringBuffer strimgbuffer = new StringBuffer("" + n);
        System.out.println(strimgbuffer.reverse());
        int i = 0;
//        while (n > i){
//            System.out.println(i);
//            i++;
//        }

        // masala: 1234 -> 4321
        // 2-usul
//        String number = "";
//        while (n > 0) {
//            int q = n % 10;
//            n = n / 10;
//            number += q;
//        }
//        System.out.println(Integer.parseInt(number));

        // 3-usul
        int number = 0;
        while (n > 0) {
            int q = n % 10;
            System.out.println("birinhci: "+n);
            n = n / 10;
            System.out.println("ikkinchi"+n);
            number = number * 10 + q;
        }
        System.out.println(number);
    }

}
