public class LionHierarchical extends CatHierarchical {
    public void king(){
        System.out.println("Lion King");
    }

    public static void main(String[] args) {
        LionHierarchical lionHierarchical = new LionHierarchical();
        lionHierarchical.eat();
        lionHierarchical.catFamily();
        lionHierarchical.king();
    }
}
