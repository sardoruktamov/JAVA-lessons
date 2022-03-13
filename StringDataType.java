public class StringDataType {
    public static void main(String[] args) {

        String text = "Hello world";
        String text1 = new String( "Salom dunyo" );
        System.out.println(text1);
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String replace = text.replace(" ", "");
        System.out.println(replace);

        String concat = text.concat(" tarjimasi: ").concat(text1);
        System.out.println(concat);
        System.out.println(text +" - "+ text1);

        String concat2 = "Salom " + 555 + true + false;  // qo'shtirnoqdan keyin barcha ma`lumotni stringga o`tkazib qo`shib qo`yadi
        System.out.println(concat2);


    }
}
