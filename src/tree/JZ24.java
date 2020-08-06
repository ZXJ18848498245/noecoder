package tree;

import java.util.ArrayList;
/*
* 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
* */
public class JZ24 {
    ArrayList<ArrayList<Integer>> allList = new ArrayList();
    ArrayList<Integer> list = new ArrayList();
    //前序遍历
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null){
            return allList;
        }
        list.add(root.val);
        target = target - root.val;
        if(target==0&&root.left==null&&root.right==null){
            allList.add(new ArrayList(list));

        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);//移掉list最后一个
        return allList;
    }
}
