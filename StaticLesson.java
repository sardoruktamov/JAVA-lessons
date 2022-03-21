import java.util.Scanner;

public class StaticLesson {

    static int a = 6;
    int b = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        a = 15;  // yuqoridagi a o`zgaruvchi statik bo'lgai uchun togridan to`g`ri chaqirishimiz mumkin

        StaticLesson lesson = new StaticLesson();
        // static bolmagan methodlarimizga murojaat qilish
        lesson.b = 19;
        lesson.display();
    }

    public void display(){

    }
}
