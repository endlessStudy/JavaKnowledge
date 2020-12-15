package com.tearsmart;

/**
 * @Author 刘彦磊
 * @Date 2020/10/13
 */
public class AddTwoNums {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(
                9, new ListNode(9, new ListNode(9, null))
        );

        ListNode l2 = new ListNode(9, null);
        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode currentNode = listNode;
        int ten = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int total = val1 + val2 + ten;
            int sum = (total) % 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            currentNode.next = new ListNode(sum, null);
            currentNode = currentNode.next;
            ten =total > 9 ? 1 : 0;
        }
        if (ten != 0) {
            currentNode.next = new ListNode(ten, null);
        }
        return listNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
