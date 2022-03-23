public abstract class Bank {

    // abstract methodini tana ismi bo`lmaydi
    abstract void rate();

    // abstract classini ichida abstract methodi bolmagan methodni ham yaratish mumkin
    void getMessage(){
        System.out.println("Get message");
    }
}
