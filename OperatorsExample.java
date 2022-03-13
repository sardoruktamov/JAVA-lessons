public class OperatorsExample {
    public static void main(String[] args) {

        boolean open = true;
        boolean close = false;

        // not, and, xor, or
        boolean b = !false;         // javobi true chiqadi
        //System.out.println(b);

        boolean b1 = true && true;        // true
        boolean b2 = true && false;        // false
        boolean b3 = false && false;        // false
        boolean b4 = false && true;        // false

        boolean b5 = true ^ true;        // false
        boolean b6 = true ^ false;        // true
        boolean b7 = false ^ false;        // false
        boolean b8 = false ^ true;        // true

        boolean a5 = true || true;        // true
        boolean a6 = true || false;        // true
        boolean a7 = false || false;        // false
        boolean a8 = false || true;        // true

        boolean m = open && (close || b);    // true
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
    }
}
