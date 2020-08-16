package Recur;
/*
*在数组A[0..n-1]中，有所谓的魔术索引，满足条件A[i]=i。给定一个 不下降序列 ，元素值可能相同，编写一个方法，判断在数组A中是否存在魔术索引。请思考一种复杂度优于o(n)的方法。
给定一个int数组A和int n代表数组大小，请返回一个bool，代表是否存在魔术索引。
* */
public class CM43 {
    public boolean findMagicIndex(int[] A, int n) {
        // write code here
        if(n==0) return false;
        return magicfind(A,0,n-1);
    }
    public boolean magicfind(int[] A,int start,int end) {
        if (start > end) {
            return false;
        }
        int mid = (start + end) / 2;
        if (A[mid] == mid) {
            return true;
        }
        //此时魔术索引可能在左边也有可能在右边 也有可能同时出现在左右边

        //return magicfind(A,start,mid-1)|| magicfind(A,mid+1,end);
        return magicfind(A, start, Math.min(mid - 1, A[mid])) || magicfind(A, Math.max(mid + 1, A[mid]), end);
    }
}
