package find;
/*
* 有一篇文章内含多个单词，现给定两个单词，请设计一个高效算法，找出文中这两个单词的最短距离(即最少相隔的单词数,也就是两个单词在文章中位置的差的绝对值)。
给定一个string数组article，代表所给文章，同时给定文章的单词数n和待查找的两个单词x和y。请返回两个单词的最短距离。保证两个单词均在文中出现且不相同，
* 同时保证文章单词数小于等于1000。
*
*
* //时间复杂度为O(n),空间复杂度O（1）。
//总的思想就是设置一个游标记录上一个出现的x或者y的位置。游标初始化为-1，最短距离设置为n。
//当遇到第一个x或y时，游标设置为当前位置。接下来（1）再遇到相同字符串时，只需将游标设置
//为当前位置，原因是，在两个相同字符串中间没有出现另一个需要查找的字符串，则即使接下来出
//现了另一个字符串，也只会距离当前位置的最近。（2）遇到需要查找的第二个字符串，则计算两
//者之间的距离,判断是否比最短距离还短，若是，则更新最短距离。完事后需要将游标设为当前位置
//。接下来就明朗了，要么遇到不同的另一个字符串或者同一个，按上述循环即可。代码如下：
* */
public class CM76 {
    public int getDistance(String[] article, int n, String x, String y) {
        // write code here
        int count = n;
        int point = -1;
        for(int i = 0 ;i<n;i++){
            if(article[i].equals(x)||article[i].equals(y)){
                if(point != -1&& !(article[i].equals(article[point]))&&(count >i-point))
                    count = i - point;
                point = i;
            }

        }
        return count;
    }
}
