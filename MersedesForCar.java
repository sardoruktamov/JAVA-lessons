public class MersedesForCar {
    public static void main(String[] args) {
        // - Objeckt classi methodlari tarifi
        // ---getClass() class qaytaradi
        // ---hashCode() - hashcodedagi int qiymatini qaytaradi
        // ---equalse() - ikkita obyektni bir biri bn tengligini tekshiradi
        // ---toString() - biz ishlatayotgan obyektimizni stringga o'girib beradi va string() qaytarib beradi


        Car mercedes = new Car();
        mercedes.getColor("Green");
        mercedes.getModel("Mercedes");

        Car bmv = new Car();
        bmv.getColor("Yelow");
        bmv.getModel("BMV");

        // ikkita obyektni tengligini tekshirish
        if (mercedes.equals(bmv)){
            System.out.println("obyektni tekshirish");
        }

//        Object classi ota klas hissoblanadi
        Object test = new Car();
        test.getClass();
    }
}
