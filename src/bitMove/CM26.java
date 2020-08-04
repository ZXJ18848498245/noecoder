package bitMove;
/*
* 有两个32位整数n和m，请编写算法将m的二进制数位插入到n的二进制的第j到第i位,其中二进制的位数从低位数到高位且以0开始。
* */
public class CM26 {
    public int binInsert(int n, int m, int j, int i) {
        // write code here
        int m1 = m<<j;
        return n|m1;
    }
}
