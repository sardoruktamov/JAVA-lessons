public interface Printable {

    // o'zgarmas yani constanta qiymatlar har doim KATTA HARFLARDA yoziladi
    int MIN = 5;
    void print();

    // default keywordi orqali methodlarimizni tanasiga kod yozishimiz mumkin
    default void message(){
        System.out.println("default interface method");
    }

    // static keywordi orqali static methodlarimizni tanasiga kod yozishimiz mumkin
    static int sum(int a, int b){
        return a+b;
    }

    // private keywordi orqali private methodlarimizni tanasiga kod yozishimiz mumkin
    private void test(){
        System.out.println("Private method");
    }
}
