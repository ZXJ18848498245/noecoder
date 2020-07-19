package string;
/*
* 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。
* */
public class CM5 {
    public String zipString(String iniString) {
        // write code here
        StringBuffer s = new StringBuffer();
        for(int i = 0;i<iniString.length();i++){

            int count = 1;
            while(i<iniString.length()-1&&iniString.charAt(i)==iniString.charAt(i+1)){
                count++;
                i++;
            }
            s.append(iniString.charAt(i)).append(count);
        }
        return iniString.length()>s.length() ? s.toString() : iniString;
    }
}
