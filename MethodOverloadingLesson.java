public class MethodOverloadingLesson {
    // agarda methodlar nomi bir xil bo`lsa va turli xil tipdagi parametrlar qabul qilsa xatolik bermaydi

    // qiymat qaytarmaydigan methodlar
    public void display(){
        System.out.println("method-1:  ");
    }

    public void display(int a){
        System.out.println("method-2:  " + a);
    }

    public void display(double d){
        System.out.println("method-3:  " + d);
    }

    // qiymat qaytaradigan methodlar
    public int add(int a, int b){
        return a * b;
    }

    public double add(double c, double d){
        return c + d;
    }

    // ketma-ketligi xar xil bo;lgan methodlar
    public void sum(int a, int b){
        System.out.println("int method: "+a+" - "+b);
    }
    public void sum(long a, int b){
        System.out.println("int va long method: "+a+" - "+b);
    }
    public void sum(long a, long b){
        System.out.println("long method: "+a+" - "+b);
    }

    // Compile ERROR beradigan methodlar
    public static void main(String[] args) {
        MethodOverloadingLesson lesson = new MethodOverloadingLesson();
        lesson.display();
        lesson.display(25);
        lesson.display(25.0005);
        System.out.println("----------------------");

        lesson.sum(1, 2);
        lesson.sum(3L, 4);
        lesson.sum(5L, 6L);

    }


}
