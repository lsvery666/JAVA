package LeetCode002;
/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 */


class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode new_node = new ListNode();
        ListNode tmp_node = new_node;
        int n1, n2, sum, carry = 0;
        while(l1!=null || l2!=null){
            n1 = l1 == null ? 0 : l1.val;
            n2 = l2 == null ? 0 : l2.val;
            sum = n1 + n2 + carry;
            carry = sum / 10;
            if(l1!=null){l1 = l1.next;}
            if(l2!=null){l2 = l2.next;}
            tmp_node.next = new ListNode(sum % 10);
            tmp_node = tmp_node.next;
        }
        if(carry>0){
            tmp_node.next = new ListNode(carry);
        }
        return new_node.next;
    }
}
