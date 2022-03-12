public class IntegerDataType {
    public static void main(String[] args){

        // butun sonlar
        // byte short int long

        byte number1 = 1;
        System.out.println(number1);
        number1 = 3;
        System.out.println(number1);

        short number2 = 20;
        System.out.println(number2);
        number2 = 40 + 20;
        System.out.println(number2);

        int million = 1_000_000;
        System.out.println(million);
        million = million / 20;
        System.out.println(million);

        long bignumber = 1326L;
        System.out.println(bignumber);
        bignumber = number1 + number2 + million;
        System.out.println(bignumber);
    }
}
