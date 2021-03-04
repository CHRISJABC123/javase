package array;

import java.awt.*;

/**
 * 向数组中插入元素 需要数组扩容
 */
public class Test02 {
    public static void main(String[] args) {
        int[] ints={1,2,3,4,5,6};
        //向ints数组中索引值为3的位置插入元素 666
        //1) 定义更大的数组
        int [] bigger = new int[ints.length + 1 ];
        //2) 把ints原数组[0,3)范围内的元素复制到大的数组中
        System.arraycopy(ints, 0, bigger, 0, 3);
        //3) 把要插入的元素保存到新数组中
        bigger[3]=666;
        //4)把ints源数组从3开始的元素复制到biggger数组中从4开始的位置上
        System.arraycopy(ints, 3, bigger, 4, ints.length-3);
        //5) 让原来的数组名指向新的数组
        ints=bigger;
        for (int i = 0; i < bigger.length; i++) {
            System.out.print(ints[i]+"  ");
        }
    }
}
