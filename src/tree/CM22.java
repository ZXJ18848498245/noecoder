package tree;
/*
*请实现一个函数，检查一棵二叉树是否为二叉查找树。
给定树的根结点指针TreeNode* root，请返回一个bool，代表该树是否为二叉查找树。
* */
public class CM22 {
    public boolean checkBST(TreeNode root) {
        if(Inorder(root)!=null) return false;
        return true;
    }
    TreeNode pre = null;//中序遍历法 像线索化，用pre记录前一个值与后一个比较
    public TreeNode Inorder(TreeNode root){
        if(root==null) return null;
        TreeNode left=Inorder(root.left);
        if(left!=null) return left;//一旦left，或right存在值，说明二叉查找树不符合规则
        if(pre!=null&&pre.val>root.val) return root;
        pre = root;
        TreeNode right=Inorder(root.right);
        if(right!=null) return right;
        return null;
    }
}
