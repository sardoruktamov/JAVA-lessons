public class HunterDogMultilavel extends DogMultilavel{
    public void hunter(){
        System.out.println("Hunter dog");
    }

    public static void main(String[] args) {
        HunterDogMultilavel hunterDogMultilavel = new HunterDogMultilavel();
        hunterDogMultilavel.eat();
        hunterDogMultilavel.security();
        hunterDogMultilavel.hunter();
//        hunterDogMultilavel.ovner();  // private bo`lgani uchun murojaat qilolmaymiz
    }
}
