package find;
/*
* 有一个排过序的字符串数组，但是其中有插入了一些空字符串，请设计一个算法，找出给定字符串的位置。算法的查找部分的复杂度应该为log级别。
* */
public class CM55 {
    public int findString(String[] str, int n, String x) {
        // write code here
        int start = 0;
        int end = n-1;
        int mid = 0;
        //二叉查找 对空格处理
        while(start<=end){
            mid = (start+end)/2;
            if(str[mid].compareTo("")==0){
                int index = mid;
                //当为空格时选择向左找到第一个不为空格的字符串
                while(index>=start&&str[index].compareTo("")==0) index=index-1;
                if(index<start) start = mid+1;//如果左边全为空格则从右边查找
                else if(str[index].compareTo(x)==0) return index;
                else if(str[index].compareTo(x)>0) end = index-1;//第一个非空格字符串比x小，则往左边找
                else start = mid + 1;//否找右边
            }else{
                if(str[mid].compareTo(x)==0) return mid;
                else if(str[mid].compareTo(x)>0) end = mid-1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
