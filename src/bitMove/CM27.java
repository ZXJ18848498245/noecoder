package bitMove;
/*
*
* 有一个介于0和1之间的实数，类型为double，返回它的二进制表示。如果该数字无法精确地用32位以内的二进制表示，返回“Error”。
给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。
* */
public class CM27 {
    public String printBin(double num) {
        // write code here
        StringBuffer s = new StringBuffer("0.");
        double temp = num;
        //s.append(0.);
        int n =0;
        while(temp!=0){
            temp = temp*2;
            n = (int)temp;
            temp = temp-n;
            s.append(n);
            if(s.length()>32){
                return "Error";
            }
        }
        return s.toString();

    }
}
