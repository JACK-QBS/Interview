package org.example.base;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*int[] nums = {9,3,3,6};
        int[] newArr = new int[nums.length];
        newArr = nearestDiff(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(newArr[i]);
        }*/
    }

    public ArrayList<String> merge (ArrayList<String> input) {
        // write code here
        ArrayList<String> arrList = new ArrayList<>();
        String[] st = new String[input.size()];
        for (int i = 0; i < input.size(); i++) {
            st[i] = input.remove(i);
        }

        return arrList;
    }

    /*public static int[] nearestDiff (int[] nums) {
        // write code here
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            int x = 0,y = 0;
            //在i左边找x，找小于nums[i]的值
            while (j >= 0) {
                if (nums[j] < nums[i]) {
                    x = nums[j];
                    break;
                }
                j--;
            }
            //在i右边找y，找大于nums[i]的值
            j = i;
            while (j < nums.length) {
                if (nums[j] > nums[i]) {
                    y = nums[j];
                    break;
                }
                j++;
            }
            newArr[i] = y - x;
        }
        return newArr;
    }*/
}
