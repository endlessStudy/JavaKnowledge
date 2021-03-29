package com.tearsmart;


import java.util.Stack;

/**
 * @author 刘彦磊
 * @date 2020/12/25
 */
public class 表反转链表_206 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, null);
        ListNode listNode2 = new ListNode(2, listNode);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);
        reverseList(listNode4);
        Stack<Object> objects = new Stack<>();
        objects.get(1);

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }

    public static ListNode reverseListWhile(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = listNode;
            listNode = head;
            head = temp;
        }
        return listNode;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x, ListNode o) {
            this.val = x;
            this.next = o;
        }
    }
}
