public class DinamicPolymorphism {
    public static void main(String[] args) {
        // casting qilish, Animal ota class bolgani uchun to'g'ridan to'g'ri Casting qilinyapti
        AnimalMultilavel cat = new CatHierarchical();
        AnimalMultilavel dog = new DogMultilavel();

        // down casting, Animal classi Cat klasidan yuqoridan bo`lgani uchun down kasting qilinyapti
        CatHierarchical cat1 = (CatHierarchical) new AnimalMultilavel();
    }
}
