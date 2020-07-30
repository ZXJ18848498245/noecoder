package tree;
/*
*对于一个元素各不相同且按升序排列的有序序列，请编写一个算法，创建一棵高度最小的二叉查找树。
* */
public class CM20 {
    public int buildMinimalBST(int[] vals) {
        // write code here
        //return (int)(Math.log(vals.length)/Math.log(2))+1;
        int len = vals.length;
        int t = 0;
        while (len > 0){
            t++;
            len /= 2;
        }
        return t;
    }
}
