public class MethodLessons {
    // 1-qiymat qaytarmaydigan, 2-qiymat qaytaradigan
    public static void main(String[] args) {
        MethodLessons methodLessons = new MethodLessons();
        methodLessons.getMessage("mohirdev");
        System.out.println(methodLessons.getSum(4, 8));;
    }

    // 1-qiymat qaytarmaydigan
    public void getMessage(String message) {
        System.out.println("get message " + message);
    }

    //  2-int qiymat qaytaradi
    public int getSum(int a, int b) {
        return a + b;
    }
}
