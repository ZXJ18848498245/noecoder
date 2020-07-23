package linkedlist;
/*
* 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
* */
public class CM11 {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null) {
            return pHead;
        }
        ListNode sHead = new ListNode(-1);
        ListNode bHead = new ListNode(-1);
        ListNode scur = sHead;
        ListNode bcur = bHead;
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.val < x) {
                scur.next = cur;
                scur = scur.next;
            } else {
                bcur.next = cur;
                bcur = bcur.next;
            }
            cur = cur.next;
        }
        bcur.next = null;
        scur.next = bHead.next;


        return sHead.next;
    }
}
