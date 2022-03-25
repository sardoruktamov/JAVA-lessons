package com.JAVALESSON;

import java.util.Arrays;
import java.util.PriorityQueue;

public class leetcode {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        queue.add(4);
        queue.offer(5);
        System.out.println(queue);

        // exceptions qaytaradi
//        queue.remove();
//        System.out.println(queue);

        // excaption qaytarmaydi
//        queue.poll();
        System.out.println(queue);

        //1-qiymatni olib beruvchilar
        System.out.println("elementd() dan keyin: "+queue.element());
        System.out.println("peek() dan keyin: "+queue.peek());
    }

}
