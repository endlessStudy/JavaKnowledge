package com.tearsmart.nk;

import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class StackToQueue {


    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.push(1);
        stack1.push(2);
        System.out.println(stack1);
        Solution solution = new Solution();
        System.out.println(solution.pop());
    }

}

class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.size() == 0) {
            while (stack1.size() != 0){
                stack2.add(stack1.pop());
            }
        }
        return stack2.pop();
    }
}