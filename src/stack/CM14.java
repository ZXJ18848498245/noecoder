package stack;

import java.util.ArrayList;
/*
* 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，当前一个栈填满时，新建一个栈。该数据结构应支持与普通栈相同的push和pop操作
* */
public class CM14 {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList(size);
        list.add(list2);
        for(int i =0;i<ope.length;i++){
            if(ope[i][0]==1){
                if(list2.size()==size){
                    list2 = new ArrayList(size);
                    list.add(list2);
                    list2.add(ope[i][1]);
                }else{
                    list2.add(ope[i][1]);
                }
            }else{
                if(list2.size()==0){
                    list.remove(list.size()-1);
                    list2 = list.get(list.size()-1);
                    list2.remove(list2.size()-1);
                }else{
                    list2.remove(list2.size()-1);
                }
            }

        }

        return list;
    }
}
