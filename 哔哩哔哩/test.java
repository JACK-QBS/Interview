package org.example.base;

import java.lang.reflect.Method;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //读取数据：
            int m = sc.nextInt();//行
            int n = sc.nextInt();//列
            if (m == -1 && n == -1) {
                break;
            }
            int[][] arr = new int [m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            //处理：
            int[] nums = new int[m * n];//顺时针打印元素
            int start = 0;
            //每打印一圈，左上角和右下脚都应收缩
            while (n > start * 2 && m > start * 2) {
                printCir(arr,nums,m,n,start);
                start++;
            }
            for (int i = 0; i < nums.length;i++) {
                if (i + 1 == nums.length) {
                    System.out.print(nums[i]);
                } else {
                    System.out.print(nums[i] + ",");
                }
            }
        }
    }

    private static void printCir(int[][] arr, int[] nums, int m, int n, int start) {
        int x = n - 1 - start;
        int y = m - 1 - start;
        int resIndex = m * n - (x - start + 1) * (y - start + 1);
        //左到右
        for (int i = start; i <= x; i++) {
            nums[resIndex++] = arr[start][i];
        }
        //上到下
        if (start < y) {
            for (int i = start + 1; i <= y; i++) {
                nums[resIndex++] = arr[i][x];
            }
        }
        //右到左
        if (start < x && start < y) {
            for (int i = x - 1; i >= start ; i--) {
                nums[resIndex++] = arr[y][i];
            }
        }
        //下到上
        if (start < x && start < y - 1) {
            for (int i = y - 1; i >= start + 1 ; i--) {
                nums[resIndex++] = arr[i][start];
            }
        }
    }
}
