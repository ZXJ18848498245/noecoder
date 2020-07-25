package linkedlist;

import java.util.ArrayList;
import java.util.Stack;

public class CM13 {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        ListNode aHead = new ListNode(-1);
        Stack<Integer> s = new Stack();
        ListNode a = aHead;
        ListNode p = pHead;
        while(p!=null){
            s.push(p.val);
            p=p.next;
        }
        while(s.size()>0){
            a.next = new ListNode(s.pop());
            a=a.next;
        }
        while(pHead!=null){
            if(pHead.val!=aHead.next.val){
                return false;
            }
            pHead = pHead.next;
            aHead = aHead.next;
        }
        return true;


    }

    public boolean isPalindrome2(ListNode pHead) {
        // write code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(pHead == null){
            return false;
        }
        ListNode node = pHead;
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        int N = list.size();
        for(int i = 0;i < N/2; i++){
            if(list.get(i) != list.get(N-i-1)){
                return false;
            }
        }
        return true;
    }
}
