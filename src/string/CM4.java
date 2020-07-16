package string;
//请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
public class CM4 {
    public String replaceSpace(String iniString, int length) {
        // write code here
        char[] str = iniString.toCharArray();

        StringBuffer s = new StringBuffer();
        for(int i = 0;i<str.length;i++){
            if(str[i]==' '){
                s.append("%20");
            }else
                s.append(str[i]);
        }

        return s.toString();
    }

//法二
    public String replaceSpace1(String str,int len) {
        char[] charArr = str.toCharArray();
        // 计算源字符串的长度和空格的数量
        int originalLength = charArr.length;
        int numberOfBlank = 0;
        for (char item : charArr)
            if (item == ' ')
                numberOfBlank++;
        // 计算新的字符串长度
        int newLength = originalLength + numberOfBlank * 2;
        char[] newcharArr = new char[newLength];
        //
        int indexOfOriginal = originalLength - 1;
        int indexOfNew = newLength - 1;
        while (indexOfOriginal >= 0) {
            if (charArr[indexOfOriginal] == ' ') {
                newcharArr[indexOfNew--] = '0';
                newcharArr[indexOfNew--] = '2';
                newcharArr[indexOfNew--] = '%';
                indexOfOriginal--;
            } else {
                newcharArr[indexOfNew--] = charArr[indexOfOriginal--];
            }
        }
        return String.valueOf(newcharArr);
    }

}
