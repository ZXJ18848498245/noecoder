package linkedlist;
/*
* 实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。
给定待删除的节点，请执行删除操作，若该节点为尾节点，返回false，否则返回true*/
public class CM10 {
    public boolean removeNode(ListNode pNode) {
        // write code here
        if(pNode.next==null)
            return false;
        else return true;
    }
}
