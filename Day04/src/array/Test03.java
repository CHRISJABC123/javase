package array;

import java.util.Arrays;

/**
 * Arrays类的基本使用
 */
public class Test03 {
    public static void main(String[] args) {
        int [] ints = {65,324,89,54,1,99};
        //1) 调用Arrays.toString(数组)可以把数组元素连接为字符串
        String string = Arrays.toString(ints);
        System.out.println(string);
        //2) Arrays.copyOf( 源数组, 新数组的长度)实现数组的复制, 会返回一个新的数组
        //2.1 新数组长度如果比原来数组长度大就是数组扩容
        int [] bigger=Arrays.copyOf(ints, ints.length*2);
        System.out.println(Arrays.toString(bigger));
        //2.2 新的数组长度也可以比原来数组长度小
        int [] smaller= Arrays.copyOf(ints, ints.length/2);
        System.out.println(Arrays.toString(smaller));
        //3)Arrays.sort(数组)可以对数组进行排序
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        //4) Arrays.fill( 数组 , from, to, val) 把数组[from,to)范围内的元素使用val填充
        Arrays.fill(ints, 0,3,111);
        System.out.println(Arrays.toString(ints));
        //5)ints数组排序后, 可以调用Arrays.binarySearch()进行二分查找
        int i = Arrays.binarySearch(ints, 1);
        System.out.println(i);
        int i1 = Arrays.binarySearch(ints, 111);
        System.out.println(i1);//返回负数表示不存在这个数
    }

}
