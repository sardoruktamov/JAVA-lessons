import java.util.Scanner;

public class ForExampleThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tub sonlarni chiqarish
        int n = scanner.nextInt();

        out: for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i-1 ; j++) {
                if (i % j==0){
                    continue out;
                }
            }
            System.out.println(i);
        }
    }
}
