public class ThisKeywordLesson {
    int id;
    String name;
    String lastname;

    // 1- this orqali o'zgaruvchilarga murojaat qilish
    public ThisKeywordLesson(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public ThisKeywordLesson(){
        this(10); // 3- this orqali second construktorga murojaat qilish
        System.out.println("first constructor");
    }

    public ThisKeywordLesson(int a){

        System.out.println("second constructor");

    }

    public void print(){
        System.out.println("id- "+id);
        System.out.println("name- "+name);
        System.out.println("lastname- "+lastname);
    }

    public void update(){
        System.out.println("update methodi");
    }
    // 2- this orqali methodlarga murojaat qilish
    public void insert(){
        this.update();  // this qoyilmagan taqdirda ham ishlaydi va kompilyator avtomatik tarzda thizni o`zi qoyib olgan boladi
    }

    // 4- this orqali method argumentlariga murojaat qilish
    public void callMethod(ThisKeywordLesson thisKeywordLesson, int a, int b){
        int sum = a+b;
        System.out.println("bu method argumenti-> "+sum);
    }
    public void callMethod2(){
        callMethod(this, 5, 7);
    }

    // 5- this orqali construktor argumentiga murojaat qilish
    public ThisKeywordLesson(ThisKeywordLesson thisKeywordLesson){
        System.out.println("bun construktor argumentiga murojaat");
    }

    // 6- this orqali joriy classga murojaat qilish
    ThisKeywordLesson getThisKeyword(){
        return this;
    }
    public static void main(String[] args) {
        ThisKeywordLesson thisKeywordLesson = new ThisKeywordLesson(1, "Sardor", "Uktamov");
        // 1- this orqali o'zgaruvchilarga murojaat qilish
        thisKeywordLesson.print();

        // 2- this orqali methodlarga murojaat qilish
        thisKeywordLesson.insert();

        // 3- this orqali construktorga murojaat qilish
        ThisKeywordLesson thisconstruktor = new ThisKeywordLesson();

        // 4- this orqali method argumentlariga murojaat qilish
        thisconstruktor.callMethod2();

        // 5- this orqali construktor argumentiga murojaat qilish
        ThisKeywordLesson construktArgument = new ThisKeywordLesson(thisKeywordLesson);

        // 6- this orqali joriy classga murojaat qilish
        thisconstruktor.getThisKeyword().insert();
    }
}
