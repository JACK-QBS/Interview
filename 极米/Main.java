package org.example.base;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        averageOfLevels(null);
    }

    //计算二叉树每层的平均值
    public static double[] averageOfLevels (TreeNode root) {
        // write code here
        List<Double> res = new ArrayList<>();//每层的平均值
        if (root == null) {
            return new double[]{0};
        }
        //层序遍历：
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (que.size() != 0) {
            int len = que.size();
            double sum = 0;
            for (int i = 0; i < len; i++) {
                TreeNode cur = que.poll();
                sum += cur.val;
                if (cur.left != null) {
                    que.add(cur.left);
                }
                if (cur.right != null) {
                    que.add(cur.right);
                }
            }
            res.add(sum / len);
        }
        //list 转 数组
        double[] arr = new double[res.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res.remove(i);
        }
        return arr;
    }

    //字符串调整
    //gmiix 13420
    //xgimi
    public String shuffle (String s, int[] indices) {
        // write code here
        char[] arr = s.toCharArray();
        char[] ch = new char[arr.length];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            ch[indices[i]] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

}
class TreeNode {
   int val = 0;
   TreeNode left = null;
   TreeNode right = null;
   public TreeNode(int val) {
    this.val = val;
   }
 }
