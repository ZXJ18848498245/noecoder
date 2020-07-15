package string;
/*
*请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。
*给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，
* False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
* */
public class CM1 {
    public boolean checkDifferent(String iniString) {
        // write code here
        char[] s = iniString.toCharArray();
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
