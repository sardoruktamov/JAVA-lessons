public class Student {
    int id;
    String name;
    String address;
    long phone;

    public Student(int id, String name, String address, long phone){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Student(){

    }
    public void print(){
        System.out.println("id - " +id);
        System.out.println("ismi - " +name);
        System.out.println("manzili - " +address);
        System.out.println("Telefoni - " +phone);
    }
}
