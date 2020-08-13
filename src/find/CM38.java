package find;
/*
* 有一些数的素因子只有3、5、7，请设计一个算法，找出其中的第k个数。
给定一个数int k，请返回第k个数。保证k小于等于100。
* 思路：就是找以3，5，7为基数的数的排序 3，5，7，9，15，21，25.。。
* */
public class CM38 {
    public int findKth(int k) {
        // write code here
        int[] array = new int[k];
        int num1=0;
        int num2 = 0;
        int num3 = 0;
        array[0] = 3;
        array[1] = 5;
        array[2] = 7;
        for(int i = 3;i<k;i++){
            array[i] = Math.min(Math.min(array[num1]*3,array[num2]*5),array[num3]*7);
            if(array[i]==array[num1]*3) num1++;
            if(array[i]==array[num2]*5) num2++;
            if(array[i]==array[num3]*7) num3++;
        }
        return array[k-1];
    }
}
