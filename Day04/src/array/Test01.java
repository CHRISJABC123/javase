package array;

import java.util.IntSummaryStatistics;

/**
 选择排序
 从数组中选择最小的元素排到前面，再从剩余的元素中选择最小的数组排到前面
 */
public class Test01 {
    public static void main(String[] args) {
        int ins[]=new int[]{22,11,55,33,44};
        //外层循环控制比较轮数
        for (int i = 0; i < ins.length-1; i++) {
            //定义变量保存每一轮最小值下标
            int min=i;
            //从min+1开始找最小元素
            for (int j = min+1; j < ins.length; j++) {
                if (ins[j]<ins[min]) {
                    min=j;
                }
            }
            //最小元素与每轮的第一个元素互换
                int t=ins[min];
                ins[min]=ins[i];
                ins[i]=t;
        }
        for (int in : ins) {
            System.out.print(in+" ");
        }
    }
}
