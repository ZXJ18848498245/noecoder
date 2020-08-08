package greed;

public class CM68 {
    public int getMaxSum(int[] A, int n) {
        // write code here

        int cur = 0;
        int max = A[0];
        //贪心算法
        /*for(int i = 0;i<A.length;i++){

            if(cur<0){
                cur = A[i];
            }else{
                cur = cur + A[i];
            }
            if(max<cur){
                   max = cur;
            }
        }*/
        //动态规划
        for(int i = 1;i<A.length;i++){
            if(A[i-1]>0){
                A[i] = A[i]+A[i-1];
            }

            if(max<A[i]){
                max = A[i];
            }
        }
        return max;
    }
}
