package com.tearsmart;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 刘彦磊
 * @date 2021/1/7
 */
public class _94_中序遍历 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        // 将所有左子树添加到栈
        while(true){
            if (root!= null) {
                stack.push(root);
                root = root.left;
            }else{
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
            if (stack.size() == 0) {
                return list;
            }
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
