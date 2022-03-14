import java.util.Scanner;

public class FloatingPointDataType {
    public static void main(String[] args) {

        double one = 1.0;
        double number = 1.0 + 1;
        double pi = 3.14156;
        double ex = 5e-3;   //  5 * 10 ^ -3 = 0.005
        double ex1 = 0.1e2; // 0.1 * 10 ^ 2 = 10.0

        // istisinolar
        double a = 5/4;  // = 1.0
        double b = 5.0/4; // = 1.25
        System.out.println("a= "+a+"\n"+ "b= "+b);
        float f1 = 1.0f;

        // klaviaturadan kiritilgan malumotni biror tipga o`zgartirish

        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        System.out.println("d= " + d);
        System.out.println("i= " + i);
        System.out.println("f= " + f);

    }
}
