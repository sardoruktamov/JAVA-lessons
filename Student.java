public class Student {
    int id;
    String name;
    String address;
    long phone;
    static String collage = "TATU";    // Static o`zgaruvchi, static mavzusida qo`shildi

    public Student(int id, String name, String address, long phone, String collage){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.collage = collage;
    }

    public Student(){

    }
    public void print(){
        System.out.println("id - " +id);
        System.out.println("ismi - " +name);
        System.out.println("manzili - " +address);
        System.out.println("Telefoni - " +phone);
        System.out.println("O'qish joyi - " +collage);
    }
}
