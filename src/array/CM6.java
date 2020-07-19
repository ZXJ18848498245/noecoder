package array;
//数组旋转顺时针90度
public class CM6 {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        if(mat == null){
            return null;
        }
        int temp;
        for(int i = 0;i<n/2;i++)
            for(int j = 0;j<n;j++){
                temp = mat[i][j];
                mat[i][j]=mat[n-i-1][j];
                mat[n-i-1][j]=temp;
            }
        for(int i = 0;i<n;i++)
            for(int j=0;j<i;j++){
                temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i] = temp;
            }
        return mat;
    }
}
