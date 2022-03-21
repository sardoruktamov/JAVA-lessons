public class DogMultilavel extends AnimalMultilavel{

    public void security(){
        System.out.println("Security dog");
    }

    private void ovner(){
        System.out.println("ovner of dog");
    }

    public static void main(String[] args) {
        DogMultilavel dogMultilavel = new DogMultilavel();
        dogMultilavel.eat();
        dogMultilavel.security();
    }
}
