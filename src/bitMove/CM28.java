package bitMove;
/*
*编写一个函数，确定需要改变几个位，才能将整数A转变成整数B。
给定两个整数int A，int B。请返回需要改变的数位个数。
* */
public class CM28 {
    public int[] getCloseNumber(int x) {
        // write code here
        int a =x;
        int b =x;
        int count = 0;
        int[] num = new int[2];

        count = myCount(x);
        while(a>=0){
            a=a-1;
            if(count==myCount(a)){
                break;
            }
        }
        while(b>=0){
            b=b+1;
            if(count==myCount(b)){
                break;
            }
        }
        num[0]=a;
        num[1]=b;
        return num;
    }
    public static int myCount(int x){
        int count = 0;
        int x1 = x;
        while(x1 != 0){
            if((x1&1)!=0){
                count++;
            }
            x1= x1>>1;
        }
        return count;
    }
}
