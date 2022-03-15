import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("sum = "+sum +" + "+i);
//            sum += i;
            sum *= i;
        }
        System.out.println(sum);
    }
}
