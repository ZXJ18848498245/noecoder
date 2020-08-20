package Recur;
/*
* 请设计一种算法，解决著名的n皇后问题。这里的n皇后问题指在一个nxn的棋盘上放置n个棋子，使得每行每列和每条对角线上都只有一个棋子，求其摆放的方法数。
给定一个int n，请返回方法数，保证n小于等于15
* */
public class CM49 {
    public int nQueens(int n) {
        // write code here
        int[] arr = new int[n];
        return check(0,n,arr);
        //  return count;

    }
    public static int check(int n,int max,int[] arr){
        if(n==max){
            // count++;
            return 1;
        }
        int res = 0;
        for(int i =0;i<max;i++){
            arr[n]=i;
            if(judge(arr,n)){
                res += check(n+1,max,arr);
            }
        }
        return res;
    }
    public static boolean judge(int[] array,int n){
        for(int i = 0;i<n;i++){
            //array[n]==array[i]判断两个皇后是否在一列
            //Math.abs(n-i)==Math.abs(array[n]-array[i])判断相邻两个皇后是不是在一条斜线上
            if (array[n] == array[i] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }
}
