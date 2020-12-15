package com.tearsmart.nk;


/**
 * @author 刘彦磊
 * @date 2020/10/14
 */
public class BinaryTree {

    public static void main(String[] args) {
        Add(1, 3);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);
        TreeNode t10 = new TreeNode(10);
        TreeNode t11 = new TreeNode(11);
        t6.left = t5;
//        t6.right = t7;
        t10.left = t9;
        t10.right = t11;
        t8.left = t6;
        t8.right = t10;
//        Mirror(t8);
    }
    public static int Add(int num1,int num2) {
        int result = 0;
        int carry = 0;
        do{
            result = num1 ^ num2;       //不带进位的加法
            carry = (num1 & num2) << 1; //进位
            num1 = result;
            num2 = carry;
        }while(carry != 0); // 进位不为0则继续执行加法处理进位
        return result;
    }
    public static TreeNode Mirror(TreeNode root) {
        if (root != null) {
            TreeNode swap = root.left;
            root.left = root.right;
            root.right = swap;
            Mirror(root.left);
            Mirror(root.right);
        }
        return root;
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }
}
