package linkedlist;
/*
* 有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，也就是个位排在链表的首部。
* 编写函数对这两个整数求和，并用链表形式返回结果。
* */
public class CM12 {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a==null||b==null){
            return null;
        }
        ListNode sum = new ListNode(-1);
        ListNode s = sum;
        int add = 0;
        while(a!=null||b!=null){
            if(a!=null&&b!=null){
                s.next = new ListNode((a.val+b.val+add)%10);
                s = s.next;
                add = (a.val+b.val+add)/10;
                a = a.next;
                b = b.next;
            }else if(a!=null){
                s.next = new ListNode((a.val+add)%10);
                s = s.next;
                add = (a.val+add)/10;
                a = a.next;
            }else{
                s.next = new ListNode((b.val+add)%10);
                s = s.next;
                add = (b.val+add)/10;
                b = b.next;
            }
        }
        if(add>0){
            s.next =new ListNode(add);
            s = s.next;
        }
        return sum.next;
    }
}
