package string;

import java.util.Stack;
/*
* 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
* */
public class CM46 {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if((n%2)==1) return false;
        Stack arr = new Stack();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==')'&&arr.size()>0){
                arr.pop();
            }else if(A.charAt(i)==')'&&arr.size()==0){
                return false;
            }else if(A.charAt(i)!='('&&A.charAt(i)!=')'){
                return false;
            }else{
                arr.push(A.charAt(i));
            }
        }
        return arr.empty();
    }
}
