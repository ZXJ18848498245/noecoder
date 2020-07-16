package string;
/*
* 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串中的空格。
给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。保证两串的长度都小于等于5000*/
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
