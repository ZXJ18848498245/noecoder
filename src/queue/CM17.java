package queue;
/*
*   给定一个操作序列int[][2] ope(C++中为vector<vector<int>>)代表所有事件。若第一个元素为1，则代表有动物进入收容所，第二个元素为动物的编号，
* 正数代表狗，负数代表猫；若第一个元素为2，则代表有人收养动物，第二个元素若为0，
* 则采取第一种收养方式，若为1，则指定收养狗，若为-1则指定收养猫。请按顺序返回收养的序列。若出现不合法的操作，即没有可以符合领养要求的动物，则将这次领养操作忽略。
* */
import java.util.ArrayList;

public class CM17 {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> input = new ArrayList();
        ArrayList<Integer> output = new ArrayList();

        for(int i = 0;i<ope.length;i++){
            switch(ope[i][0]){
                case 1 :
                    input.add(ope[i][1]);
                    break;
                case 2:
                    if(ope[i][1]==0){
                        output.add(input.get(0));
                        input.remove(0);
                    }else if(ope[i][1]>0){
                        for(int j = 0;j<input.size();j++){
                            if(input.get(j)>0){
                                output.add(input.get(j));
                                input.remove(j);
                                break;
                            }
                        }
                    }else{
                        for(int j = 0;j<input.size();j++){
                            if(input.get(j)<0){
                                output.add(input.get(j));
                                input.remove(j);
                                break;
                            }
                        }
                    } break;
            }
        }
        return output;
    }
}
