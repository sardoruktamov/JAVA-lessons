public class StaticPolymorphism {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    // Dinamic polymorphism, casting va down casting uchun
    public void castingPolymorphism(){
        System.out.println("Dinamic polymorphism, casting va down casting");
    }

    public static void main(String[] args) {
        // bu yerda static polymorphism ishlatilyapti
        StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
        System.out.println(staticPolymorphism.add(10, 20));
        System.out.println(staticPolymorphism.add(10, 20, 30));
    }
}
