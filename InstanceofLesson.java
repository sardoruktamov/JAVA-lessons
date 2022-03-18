public class InstanceofLesson {
    public static void main(String[] args) {
        // InstanceOf da faqat obyekt qiymatlarini tekshiramiz (data typeni tekshiramiz)

//        Integer a = 4; // int
//        Character c = 'wddqw'; // char
//        Float - float
//        Double - double
//        if (a instanceof Integer){
//
//        }

        BreakContinue breakContinue = new BreakContinue();
        chekck(breakContinue);
    }

    public static void chekck(Object obj) {
        if (obj instanceof SwitchLesson){
            System.out.println("True");
        }else {
            System.out.println("false");
        }

    }
}
