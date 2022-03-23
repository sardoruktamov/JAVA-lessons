public class CenterBank {

    public static void main(String[] args) {
        Bank ofbBank = new OFBank();
        Bank nbuBank = new NBUBank();
        Bank kapitalBank = new KapitalBank();
        ofbBank.rate();
        nbuBank.rate();
        kapitalBank.rate();

        ofbBank.getMessage();
        nbuBank.getMessage();
    }
}
