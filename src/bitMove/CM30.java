package bitMove;
/*
 *请编写程序交换一个数的二进制的奇数位和偶数位。（使用越少的指令越好）
给定一个int x，请返回交换后的数int。
 * */
public class CM30 {
    public int exchangeOddEven(int x) {
        // write code here
        int even = (x&0xAAAAAAAA);
        int odd = (x&0x55555555);
        return (even>>1)|(odd<<1);
    }
}
