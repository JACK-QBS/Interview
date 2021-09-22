package org.example.base;

import java.util.*;

public class Main {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr[k - 1] == 0) {
            System.out.println(0);
        } else {
            System.out.println(findMax(arr,k));
        }
    }
    public static int findMax(int[] arr,int k) {
        //从k的右半部分计算
        right(arr,k);
        int r = arr[k - 1] - 1;
        count++;
        if (r == 0) {
            return count;
        }
        //从k的左半部分计算
        left(arr,k);
        int l = r - 1;
        count++;
        if (l == 0) {
            return count;
        } else {
            while (l > 0) {
                l--;
                count++;
            }
        }
        return count;
    }
    public static void right(int[] arr,int k) {
        int r = 0;
        for (int i = k; i < arr.length; i++) {
            arr[i]--;
            count++;
            if (arr[i] == 0) {
                r = i;
                break;
            }
        }
        for (int i = r; i >= k; i--) {
            if (arr[i] != 0) {
                while (arr[i] > 0) {
                    arr[i]--;
                    count++;
                }
            }
        }
    }
    public static void left(int[] arr,int k) {
        int l = 0;
        for (int i = k - 2; i >= 0; i--) {
            arr[i]--;
            count++;
            if (arr[i] == 0) {
                l = i;
                break;
            }
        }
        for (int i = l; i < k - 1; i++) {
            if (arr[i] != 0) {
                while (arr[i] > 0) {
                    arr[i]--;
                    count++;
                }
            }
        }
    }
}
