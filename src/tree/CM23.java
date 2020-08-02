package tree;

import java.util.ArrayList;
/*
* 请设计一个算法，寻找二叉树中指定结点的下一个结点（即中序遍历的后继）。
给定树的根结点指针TreeNode* root和结点的值int p，请返回值为p的结点的后继结点的值。保证结点的值大于等于零小于等于100000且没有重复值，若不存在后继返回-1。
* */
public class CM23 {
    public static ArrayList<Integer> list = new ArrayList<>();
    //前一个节点，令此引用按照中序遍历的来移动，利用它来进行逆向移动
    //即原来只能是  根→左  现在可以  左→根
    private static TreeNode pre = new TreeNode(-1);
    public int findSucc(TreeNode root, int p) {
        // write code here
        if(root == null){
            return -1;
        }

        int left = findSucc(root.left,p);
        if(left ==-1){
            if(pre.val==p){
                return root.val;
            }
            pre = root;
            return findSucc(root.right,p);
        }
        //如果找不到则返回上一层的根节点，方向为 左→根
        return left;
        //方法二
    /*  int a =-1;
        infixOrder(root);
        for(int i = 0;i<list.size();i++){
           if(list.get(i)==p){
               a = list.get(i+1);
               //return a;
           }
       }
        return a;
       */
    }

   /* public static void infixOrder(TreeNode root){
         if(root==null){
            return ;
        }
        infixOrder(root.left);
        list.add(root.val);
        infixOrder(root.right);
    }*/
}
