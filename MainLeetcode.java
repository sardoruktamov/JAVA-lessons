public class MainLeetcode {
    public static void main(String[] args) {

        String command = "(al)G(al)()()G";
        StringBuilder sum = new StringBuilder();
        for (int i=0; i<command.length(); i++){
            if (command.charAt(i) == 'G') {
                sum.append('G');
            }else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                sum.append('o');
            }else if (command.charAt(i) == '(' && command.charAt(i+1) != ')') {
                sum.append(command.charAt(i+1));
            }else if (command.charAt(i) == 'l') {
                sum.append('l');
            }
        }
            System.out.println(sum);

    }
    

}

    //------------------------leetdoce - 383---------------------------------------------------
//    public boolean canConstruct(String ransomNote, String magazine) {
//        int[] chars = new int[26];
//        for(int i=0; i<magazine.length();i++){
//            int index = magazine.charAt(i)-'a';
//            chars[index]++;
//        }
//        for(int j=0; j<ransomNote.length();j++){
//            int index = ransomNote.charAt(j)-'a';
//            chars[index]--;
//        }
//        for(int i=0; i<26; i++){
//            if(chars[i] < 0) return false;
//        }
//        return true;
//    }
    //------------------------leetdoce - 1678---------------------------------------------------
//    public static void main(String[] args) {
//
//        String command = "(al)G(al)()()G";
//        StringBuilder sum = new StringBuilder();
//        for (int i=0; i<command.length(); i++){
//            if (command.charAt(i) == 'G') {
//                sum.append('G');
//            }else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
//                sum.append('o');
//            }else if (command.charAt(i) == '(' && command.charAt(i+1) != ')') {
//                sum.append(command.charAt(i+1));
//            }else if (command.charAt(i) == 'l') {
//                sum.append('l');
//            }
//        }
//        System.out.println(sum);
//
//    }
    //------------------------leetdoce - 2114---------------------------------------------------
//    public static void main(String[] args) {
//
//        MainLeetcode mainLeetcode = new MainLeetcode();
//        System.out.println(mainLeetcode.mostWordsFound());
//
//    }
//
//    public int mostWordsFound() {
//        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
//        int sum = 0;
//        int count = 0;
//        for (String s:sentences){
//            for(int i=0; i< s.length(); i++){
//                if (s.charAt(i) == ' '){
//                    count += 1;
//                }
//
//            }
//            sum = Math.max(count, sum);
//            System.out.printf("sum: %d     count: %d \n", sum, count);
//            count = 0;
//        }
//        return sum+1;
//    }
    //---------------------------------------------------------------------------------------



