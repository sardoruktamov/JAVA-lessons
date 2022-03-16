public class BreakContinue {
    public static void main(String[] args) {
        // break
        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
            if (i==5){
                break;
            }
        }

        out:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j==5){
                    continue out;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
