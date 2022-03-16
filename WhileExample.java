import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
//        while (n > i){
//            System.out.println(i);
//            i++;
//        }

        // masala: 1234 4321
        String number = "";
        while (n > 0) {
            int q = n % 10;
            n = n / 10;
            number += q;
        }
        System.out.println(Integer.parseInt(number));
    }

}
