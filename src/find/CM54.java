package find;
/*
*'有一个排过序的数组，包含n个整数，但是这个数组向左进行了一定长度的移位，例如，原数组为[1,2,3,4,5,6]，
* 向左移位5个位置即变成了[6,1,2,3,4,5],现在对于移位后的数组，需要查找某个元素的位置。请设计一个复杂度为log级别的算法完成这个任务。
*  */

public class CM54 {
    public int findElement(int[] A, int n, int x) {
        // write code here
        return find(A,0,n-1,x);
    }
    public int find(int[] A,int l,int r,int x){
        int mid = (l+r)/2;
        if(A[mid] == x){
            return mid;
        }
        if(A[mid]<x){
            //A[mid]<A[l]说明右边是有序的，如果x>A[r]说明x在左边
            if(A[mid]<A[l]&&x>A[r]){
                return find(A,l,mid-1,x);
            }
            else return find(A,mid+1,r,x);
        }else{
            //A[mid]>A[r]说明左边有序，如果x<A[l]说明x在右边
            if(A[mid]>A[r]&&x<A[l]){
                return find(A,mid+1,r,x);
            }
            else return find(A,l,mid-1,x);
        }
    }
}
