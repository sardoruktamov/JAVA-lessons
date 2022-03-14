import java.util.Scanner;

public class SwitchLesson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int day = scanner.nextInt();

        //switch yozishning 1-usuli
//        switch (day) {
//            case 1:
//                System.out.println("Dushanba");
//                break;
//            case 2:
//                System.out.println("Seshanba");
//                break;
//            case 3:
//                System.out.println("Chorshanba");
//                break;
//            case 4:
//                System.out.println("Payshanba");
//                break;
//            case 5:
//                System.out.println("Juma");
//                break;
//            case 6:
//                System.out.println("Shanba");
//                break;
//            case 7:
//                System.out.println("Yakshanba");
//                break;
//            default: {
//                System.out.println("Bunday hafta kuni yo'q!");
//            }
//        }

        //switch yozishning 2-usuli
//        switch (day){
//            case 1, 2, 12:
//                System.out.println("Qish fasli");break;
//            case 3, 4, 5:
//                System.out.println("Bahor fasli");break;
//            case 6, 7, 8:
//                System.out.println("Yoz fasli");break;
//            case 9, 10, 11:
//                System.out.println("Kuz fasli");break;
//            default:{
//                System.out.println("Bunday oy yo'q");
//            }
//        }

        // string qiymalarni tekshirish
        String text = scanner.next();
        switch (text){
            case "A":
                System.out.println("A1");break;
            case "B":
                System.out.println("B1");break;
            default:{
                System.out.println("Other simvol");
            }
        }


    }
}
