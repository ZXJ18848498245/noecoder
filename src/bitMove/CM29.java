package bitMove;

public class CM29 {
    public int calcCost(int A, int B) {
        // write code here
        int c =A^B;
        int j = 0;
        while(c!=0){
            if((c&1)!=0){
                j++;
            }
            c = c>>1;
        }
        return j ;
    }
}
