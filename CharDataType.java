public class CharDataType {
    public static void main(String[] args) {
        // unicode-table.com orqali char tipidagi ma'lumotlari bor sayt

        char u1 = '\u0040';         //kod orqali chiqarish
        char u2 = 62;               // simvolni joylashgan o'rni orqali chiqarish
        System.out.println("kod orqali chiqarish: " + u1 +"\n"+ "simvolni o'rni orqali chiqarish: " + u2);

        // QOIDA!!! O'ZGARUVCHILARGA HAR DOIM BITTA SIMVOL YOZILADI
        // 0-65535 GACHA SONLAR TARTIBIDA BELGILANGAN SIMVOLAR BOR
        char loverCase = 'l';
        char upperCase = 'B';
        loverCase += 'b';
        loverCase -= 'a';    // javobi m chiqadi
        System.out.println(loverCase);
    }
}
