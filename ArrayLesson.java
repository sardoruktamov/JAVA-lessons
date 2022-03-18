import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLesson {
    public static void main(String[] args) {

        // statik o`zgaruvchi
//        int a[] = {2, 4, 5, 3, 6, 8, 2, 10};
//        System.out.println("array uzunligi - " + a.length);
//        System.out.println("1-usul array yig`indisi - " + Arrays.stream(a).sum());
//
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
//        System.out.println("2-usul array yig`indisi - " + sum);

        // dinamik `ozgaruvchi yaratish

        Scanner scanner = new Scanner(System.in);
        System.out.println("array o'lchamini kiriting:");
        int n = scanner.nextInt();  // array o'lchami
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("arrayning "+i+" - indexsini kiriting:");
            array[i] = scanner.nextInt();  // har safar kiritganlarimizni arrayga qo`shib boraveadi
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
