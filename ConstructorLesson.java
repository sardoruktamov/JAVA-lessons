public class ConstructorLesson {
    int id;
    String name;

    public ConstructorLesson(){
    }

    // bu constructordan CAR classida foydalanilgan
    public ConstructorLesson(int id, String name){
        this.id = id;
        this.name = name;
    }
    // bu constructordan CAR classida foydalanilgan
    public void print() {
        System.out.println(id + "-" + name);
    }

    // bu constructordan Student classida foydalanilgan
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alisher", "Rishton tumani", 998911576777L, Student.collage);
        Student student2 = new Student(2, "Sardor", "Margilon shaxar", 998911095144L, Student.collage);
        student1.print();
        student2.print();
    }
}
