package string;
/**
 *假定我们都知道非常高效的算法来检查一个单词是否为其他字符串的子串。请将这个算法编写成一个函数，给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成，要求只能调用一次检查子串的函数。
 */
public class CM8 {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if(s1.length()!=s2.length()||s1.length()==0||s2.length()==0){
            return false;
        }
        String s =s1+s1;
        if(s.contains(s2)){
            return true;
        }
        return false;
    }
}
