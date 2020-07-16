package string;

public class CM3 {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if(stringA.length()!=stringB.length()){
            return false;
        }
        int[] str1 = new int[256];
        int[] str2 = new int[256];

        for(int i = 0;i<stringA.length();i++){
            str1[stringA.charAt(i)]++;
            str2[stringB.charAt(i)]++;
        }
        for(int i = 0;i<str1.length;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;
    }
}
