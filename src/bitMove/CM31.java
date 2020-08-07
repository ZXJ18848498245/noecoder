package bitMove;
/*
* numbers是一个已经排好序的二维数组，存储的是0-n，但是缺少一个数，每一行存储的是每个数的
二进制，从二进制低位开始存储。
目标：求缺少的那个数
思路：整数值x的二进制表示最低位为1的时候，x为奇数；最低位为0时，x为偶数。
* */
public class CM31 {
    public int findMissing(int[][] numbers, int n) {
        // write code here
        for(int i = 0;i<n;i++){
            if(numbers[i][0]!=(i&1)){
                return i;
            }
        }
        return n ;
    }
}
