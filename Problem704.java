package com.JAVALESSON;

import java.util.Scanner;

public class Problem704 {
    public static void main(String[] args) {
        Problem704 problem704 = new Problem704();
        int array[] = {-1, 5, 9, 2, 8};
        System.out.println(problem704.search(array, 2));
    }

    public int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
