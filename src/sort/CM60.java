package sort;
/*
* 有一组数，对于其中任意两个数组，若前面一个大于后面一个数字，则这两个数字组成一个逆序对。请设计一个高效的算法，计算给定数组中的逆序对个数。
给定一个int数组A和它的大小n，请返回A中的逆序对个数。保证n小于等于5000。
* */
public class CM60 {
    public int count(int[] A, int n) {
        // write code here
       /* int count = 0;
            for(int i=0;i<n;i++){
                for(int j =i+1;j<n;j++){
                    if(A[i]>A[j]){
                        count++;
                    }
                }
            }
        return count;*/
        if(A.length==0||n==0){
            return 0;
        }
        return mergesort(A,0,n-1);

    }
    //归并排序
    public static int mergesort(int[] A,int l,int r){
        if(l==r){
            return 0;
        }
        int mid = (l+r)/2;
        return mergesort(A,l,mid)+mergesort(A,mid+1,r)+merge(A,l,mid,r);
    }

    public static int merge(int[] A,int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int r = mid+1;
        int l = left;
        int t = 0;
        int count = 0;
        while(l<=mid&&r<=right){
            if(A[l]<=A[r]){
                temp[t] = A[l];
                t++;
                l++;
            }else{
                // 当前一个数组元素大于后一个数组元素时，累加逆序对
                // s[i] > s[j] -> s[i]...s[mid] > s[j]
                count += (mid - l + 1);
                temp[t] = A[r];
                t++;
                r++;

            }
        }
        while(l<=mid){
            temp[t] = A[l];
            l++;t++;
        }
        while(r<=right){
            temp[t] = A[r];
            r++;t++;
        }
        for(int k = 0;k<temp.length;k++){
            A[left++]=temp[k];
        }

        return count;

    }
}
