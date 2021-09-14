package org.example.base;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test {
    /*public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
        int _d_size = 0;
        _d_size = Integer.parseInt(in.nextLine().trim());
        int[] _d = new int[_d_size];
        int _d_item;
        for(int _d_i = 0; _d_i < _d_size; _d_i++) {
            _d_item = Integer.parseInt(in.nextLine().trim());
            _d[_d_i] = _d_item;
        }

        res = new Solution().solution(_d);
        System.out.println(res);
    }*/

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = new Solution().solution(_arr);
        System.out.println(String.valueOf(res));

    }
}

class Solution {
    /* Write Code Here */
    /*public String solution(int[] d) {
        Arrays.sort(d);
        int max = 0;
        for (int i = d.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if ((d[i] * 10 + d[j]) % 3 == 0) {
                    max = d[i] * 10 + d[j];
                    break;
                }
            }
        }
        String s = "";
        if (max == 0) {
            return s;
        } else {
            s = String.valueOf(max);
            return s;
        }
    }*/

    public int solution(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int mid = 0;//第一个非负数的下标
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                mid = i;
                break;
            }
        }
        int max = 0;
        while (mid > 0) {
            int count1 = n - mid;
            int sum1 = 0;
            for (int i = n - 1; i >= mid ;i--) {
                sum1 += count1 * arr[i];
                count1--;
            }
            int x = mid - 1;
            int count2 = n - mid + 1;
            int sum2 = 0;
            for (int i = n - 1; i >= x ;i--) {
                sum2 += count2 * arr[i];
                count2--;
            }
            if (sum1 > sum2) {
                max = sum1;
                break;
            } else {
                mid = mid - 1;
            }
        }
        return max;
    }
}
