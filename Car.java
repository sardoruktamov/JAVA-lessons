public class Car {
    // model
    // color

    //--OOP da----------------------
    public static void main(String[] args) {
        ConstructorLesson constructorLesson = new ConstructorLesson(1, "test");
        ConstructorLesson constructorLesson2 = new ConstructorLesson(2, "test-2");
        constructorLesson.print();
        constructorLesson2.print();
    }
    //------------------------

    public void getColor(String color){
        System.out.println(color);
    }

    public void getModel(String model) {
        System.out.println(model);
    }
}
