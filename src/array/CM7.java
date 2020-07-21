package array;
/*
* 请编写一个算法，若N阶方阵中某个元素为0，则将其所在的行与列清零。*/
public class CM7 {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[n];
        for(int i= 0;i<n;i++){
            for(int j =0;j<n;j++){
                if(mat[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i =0;i<n;i++)
            for(int j = 0;j<n;j++){
                if(row[i]||col[j]){
                    mat[i][j]=0;
                }
            }
        return mat;
    }
}
