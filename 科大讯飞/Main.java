package org.example.base;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,4,6,6,1};
        System.out.println(happyTriangle(arr));
        Queue<Integer> queue = new LinkedList<>();
        int i = queue.remove();
    }

    public static int happyTriangle (int[] length) {
        // write code here
        int count = 0;
        for (int i = 0; i < length.length - 2; i++) {
            for (int j = i + 1; j < length.length - 1; j++) {
                for (int k = j + 1; k < length.length; k++) {
                    if (SJ(length[i],length[j],length[k])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean SJ(int i, int j, int k) {
        //判断是否为三角形(两边之和大于第三边，两边之差小于第三边)
        if (((i + j) > k && (i + k) > j && (k + j) > i) && ((i - j) < k && (i - k) < j && (k - j) < i)) {
            if (i == j && j == k) {
                //等边三角形
                return false;
            }
            if ((i*i) + (j*j) == (k*k) || (i*i) + (k*k) == (j*j) || (k*k) + (j*j) == (i*i)) {
                //直角三角形
                return false;
            }
        } else {
            //不能构成三角形
            return false;
        }
        return true;
    }


    /*public static int[] minimumNumber (int[] target) {
        // write code here
        int[] arr = new int[target.length];
        for (int i = 0; i < target.length; i++) {
            if (target[i] < 10) {
                arr[i] = -1;
                continue;
            }
            int cs = target[i] - 10;//必须的四次
            int yz = cs / 4;
            //判断4是否够整除
            if (cs % 4 == 0) {
                arr[i] = 4 + yz;
            } else {
                arr[i] = 4 + yz + 1;
            }
        }
        return arr;
    }*/


}
