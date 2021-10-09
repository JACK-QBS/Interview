package org.example.base;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
    //字符串解密
    public String decodeString (String str) {
        // write code here
        char[] arr = str.toCharArray();
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > '0' && arr[i] < '9') {
                int num = arr[i] - '0';
                int j = i + 2;
                StringBuffer sn = new StringBuffer();
                while (arr[j] == ']') {
                    sn.append(arr[i]);
                    j++;
                }
                for (int y = 0; y < num; y++) {
                    s.append(sn);
                }
                i = j + 1;
            } else {
                s.append(arr[i]);
            }
        }
        return s.toString();
    }

    // 20 4 (6) 活动配货量
    /*public static int calculateExtraNum (int totalNum, int exchangeNum) {
        // write code here
        int max = 0;
        int yuNum = 0;
        while (totalNum + yuNum >= exchangeNum) {
            max += (totalNum + yuNum) / exchangeNum;
            yuNum = (totalNum + yuNum) % exchangeNum;
            totalNum /= exchangeNum;
        }
        return max;
    }*/


    //字符串分割
    /*public static int StringSplit (String str) {
        // write code here
        char[] arr = str.toCharArray();
        int max = 0;
        int aNum = 0;//左边a的数量
        int bNum = 0;//右边b的数量
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 'a') {
                aNum++;
            }
            if (max < (aNum + bNum)) {
                max = aNum + bNum;
            }
            bNum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 'b') {
                    bNum++;
                }
            }
        }
        return max;
    }*/
}
