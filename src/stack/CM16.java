package stack;

import java.util.ArrayList;
import java.util.Stack;
/*
*请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据，但不得将元素复制到别的数据结构中。
给定一个int[] numbers，其中第一个元素为栈顶，请返回排序后的栈。请注意这是一个栈，意味着排序过程中你只能访问到最后一个元素。
* */
public class CM16 {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> init = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        for(int i =numbers.length-1;i>=0;i--){
            init.push(numbers[i]);
        }

        while(!init.isEmpty()){
            if(temp.isEmpty()){
                temp.push(init.pop());
            }else{
                int t = init.pop();
                while(!temp.isEmpty()&&temp.peek()>t){
                    init.push(temp.pop());
                }
                temp.push(t);
            }
        }
        while(!temp.isEmpty()){
            arr.add(temp.pop());
        }
        return arr;
    }
}
