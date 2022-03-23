public class BikeOverriding extends MotoOverriding{

    // bu yerda draw() methodida Overriding polemorfizmdan foydalanilyapti
    public void draw(){
         System.out.println("Bike overriding");
     }

    public static void main(String[] args) {
        BikeOverriding bikeOverriding = new BikeOverriding();
        bikeOverriding.draw();
        System.out.println("---------------");
        MotoOverriding motoOverriding = new BikeOverriding();
        motoOverriding.draw();
    }
}
