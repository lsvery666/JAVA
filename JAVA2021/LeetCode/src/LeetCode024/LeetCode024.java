package LeetCode024;

/*
给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/**
 * 递归法
 */
class Solution1 {
    public ListNode swapPairs(ListNode head) {
        if(head != null && head.next != null){
            ListNode former = head.next;
            head.next = swapPairs(former.next);
            former.next = head;
            return former;
        }
        return head;
    }
}

/**
 * 迭代法
 */
class Solution2{
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = new ListNode(0, head), savePre = pre;
        while(pre.next != null && pre.next.next!=null){
            ListNode cur = pre.next, next = cur.next;
            pre.next = next;
            cur.next = next.next;
            next.next = cur;
            pre = cur;
        }
        return savePre.next;
    }
}