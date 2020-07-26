package linkedlist;
/*
* 输入一个链表，输出该链表中倒数第k个结点*/
public class JZ14 { public ListNode FindKthToTail(ListNode head,int k) {
    ListNode h = head;
    ListNode h2 = head;
    int count = 0;
    int a=0;
    while(h!=null){
        count= count +1;
        h = h.next;
    }
    a= count-k;
    if(a>=0){
        while(a>0){
            h2 = h2.next;
            a=a-1;
        }
        return h2;
    }else{
        return null;
    }
}

}
