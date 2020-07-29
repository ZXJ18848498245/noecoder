package tree;
/*
*实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。
给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。
* */

public class CM18 {
    public static boolean isBalance(TreeNode root) {
        // write code here
        int l = 0;
        int r = 0;
        if(root!=null){
            l=hight(root.left);
            r=hight(root.right);
        }else{
            return true;
        }
        if(Math.abs(l-r)<=1){
            return isBalance(root.left)&&isBalance(root.right);
        }else{
            return false;
        }



    }
    public static int hight(TreeNode root){
        //if(root == null){
        //    return 0;
        // }
        return Math.max(root==null ? 0:hight(root.left),root== null?0:hight(root.right))+1;
        //return Math.max(hight(root.left),hight(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(1);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(1);
        TreeNode t6 = new TreeNode(1);
        TreeNode t7 = new TreeNode(1);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.right=t5;
        t4.left =t6;
        t3.right = t7;

        System.out.println(isBalance(t1));

    }
}
