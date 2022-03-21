public class Programmer extends Employee{

    int bonus = selery * 2;     // bu yerda boshqa klasdan meros olingani uchun selery xatolik bermadi

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer.bonus);
    }

}
