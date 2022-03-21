public class InheritenSenior extends Programmer{

    // bu yerda bonus-Programmer, selery-Employee klaslariga tegishli o`zgaruvchilardir
    int oylik = bonus + selery;

    public static void main(String[] args) {
        InheritenSenior inheritenSenior = new InheritenSenior();
        System.out.println(inheritenSenior.oylik);
    }
}
