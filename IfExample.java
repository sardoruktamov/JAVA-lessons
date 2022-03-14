import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();

//        if (a < 100){
//            System.out.println("kiritilgan "+a+" soni 100 dan kichik");
//        }else{
//            System.out.println("kiritilgan "+a+" soni 100 dan katta");
//        }

        //sonni juft yoki toq ekanliginianiqlash
//        if (a % 2 == 0){
//            if (a % 5 == 0){
//                System.out.println("Juft son va 5 ga bo`linadi");
//            }else {
//                System.out.println("Juft son lekin 5 ga bo`linmaydi");
//            }
//        }else {
//            if (a % 5 == 0){
//                System.out.println("Toq son va 5 ga bo`linadi");
//            }else {
//                System.out.println("Toq son lekin 5 ga bo`linmaydi");
//            }
//        }

        System.out.println("Grant balini kiriting:");
        int grantBall = scanner.nextInt();
        System.out.println("Kontrakt balini kiriting:");
        int kontraktBall = scanner.nextInt();
        System.out.println("Abiturient balini kiriting:");
        int abiturBall = scanner.nextInt();

        if (abiturBall >= grantBall){
            System.out.println("siz "+abiturBall+" ball bilan Grantga kirdingiz");
        }else if (abiturBall < grantBall && abiturBall >= kontraktBall){
            System.out.println("siz "+abiturBall+" ball bilan Kontraktga kirdingiz");
        }else {
            System.out.println("siz "+abiturBall+" ball bilan o'qishga kirolmadingiz");

        }


    }
}
