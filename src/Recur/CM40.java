package Recur;
/*
* 有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。*/
public class CM40 {
    public int countWays(int x, int y) {
        //递归方法
      /*   if(x<=0||y<=0) return 0;
        if(x==1||y==1) return 1;
        return countWays(x-1,y)+countWays(x,y-1);*/
        //动态规划
        //由于只能向右或向下动，所以到达一个格子的方法数等于到左边格子的方法数和到上边格子的方法数相加
        int[][] dp =new int[x][y];
        dp[0][0] = 1;
        for(int i = 1;i<x;i++){//第一列设为1
            dp[i][0]=1;
        }
        for(int j = 1;j<y;j++){//第一行设为1
            dp[0][j] = 1;
        }
        for(int i = 1;i<x;i++){
            for(int j = 1;j<y;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[x-1][y-1];
    }
}
