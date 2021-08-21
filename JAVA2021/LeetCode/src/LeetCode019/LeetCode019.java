package LeetCode019;

/*
给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。

进阶：你能尝试使用一趟扫描实现吗？
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode former = head, newHead = new ListNode(0, head), latter = newHead;
        while(n>0){
            former = former.next;
            n--;
        }
        while(former!=null){
            former = former.next;
            latter = latter.next;
        }
        latter.next = latter.next==null ? null : latter.next.next;
        return newHead.next;
    }
}