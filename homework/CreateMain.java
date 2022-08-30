package fileLesson.homework;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;

public class CreateMain {
    public static void main(String[] args) {

        LocalDate sana = LocalDate.now();
        System.out.println("----------------------------------------------");
        int year = sana.getYear();
        int month = sana.getMonthValue();
        int day = sana.getDayOfMonth();

        String path = String.format("./src/fileLesson/homework/uploads/%d/%d/%d", year, month, day);
        System.out.println("papka joylashgan manzil: " + path);
        File createFolder = new File(path);

        if (createFolder.mkdirs()){
            System.out.println("Papka yaratilindi!!!!!!!!!!");
        }else {
            System.out.println("Papka avvaldan mavjud");
        }




    }
}
