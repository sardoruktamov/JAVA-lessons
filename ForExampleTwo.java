import java.awt.*;
import java.util.Scanner;

public class ForExampleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
