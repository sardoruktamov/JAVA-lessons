package com.JAVALESSON;

import java.util.*;

public class YouCollection {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        //integer tipda malumot qo`shamiz
//        list.addAll(Arrays.asList(new Integer[]{7,6,3,1,5,3,2,4}));
//        list1.addAll(Arrays.asList(new String[]{"men","sen","ular","bizlar","sfsf1","ionkl2","hjev3"}));

        // -------------------------
        // ArrayListni LinkedHashSetga aylantirish, joylashgan orni bo`yicha tartiblaydi
//        LinkedHashSet linkedHashSet = new LinkedHashSet(list1);
//        System.out.println("linkedHashset: " + linkedHashSet);

        // ArrayListni HashSetga aylantirish, hashcod bo`yicha tartiblaydi
//        HashSet hashSet = new HashSet(list1);
//        System.out.println("Hashset: " + hashSet);
        // hashsetni hashcodini korish
//        hashSet.forEach(s -> {
//            System.out.println(s+" - "+s.hashCode());
//        });

        // ArrayListni TreeSetga aylantirish, alfabit bo`yicha tartiblaydi
        // Treeset sortirofka qilganligi uchun qiymatlar bir xil tipda bo`lishi kk, aks holda xatolik beradi
//        TreeSet treeSet = new TreeSet(list1);
//        System.out.println("TreeSet: " + treeSet);
        //----------------------------
        //addAll(), retainALL(), removeALL() larni korish
        ArrayList list3 = new ArrayList();
        list3.addAll(Arrays.asList(new Integer[]{0,1,2,3}));

        ArrayList list4 = new ArrayList();
        list4.addAll(Arrays.asList(new Integer[]{2,3,4,5}));

        // ikkita listni bir biriga qoshadi
        HashSet hashSet = new HashSet(list3);
        hashSet.addAll(list4);
        System.out.println("addAll(): "+hashSet);

        HashSet hashSet1 = new HashSet(list3);
        hashSet1.removeAll(list4);
        System.out.println("removeALL(): "+hashSet1);

        // bir biriga o'xshash qiymatlarni ushlab qoladi
        HashSet hashSet2 = new HashSet(list3);
        hashSet2.retainAll(list4);
        System.out.println("retainAll(): "+hashSet2);


    }
}
