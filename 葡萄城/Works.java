package org.example.base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Works {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hashMap = new HashMap<>();//<单词，单词出现的次数>
        String line = sc.nextLine();
        String[] lineWords = line.split(" ");//将输入的字符串按空格拆分成单词
        Set<String> wordSet = hashMap.keySet();//存放单词
        for (int i = 0; i < lineWords.length; i++) {
            if (wordSet.contains(lineWords[i])) {
                Integer n = hashMap.get(lineWords[i]);
                n++;
                hashMap.put(lineWords[i],n);
            } else {
                hashMap.put(lineWords[i],1);
            }
        }
        Iterator<String> iterator = hashMap.keySet().iterator();
        int max = 0;
        String maxWord = null;
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (hashMap.get(word) > max) {
                max = hashMap.get(word);
                maxWord = word;
            }
        }
        System.out.println("出现最多的是" + maxWord);
        System.out.println("最多出现了" + max +"次");
    }

}
