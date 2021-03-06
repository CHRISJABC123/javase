package array;

import java.security.Key;

/**
 二分查找
 */
public class Test02 {
    public static void main(String[] args) {
        int [] ints = {11,22,33,44,55,66,77,88};
        System.out.println( binarySearch(ints, 11));
    }
    //定义方法实现二分查找,返回要查找数的下标
    private static int binarySearch(int[] ints, int i) {
        //从array数组中查找key元素是否存在,如果存在则返回元素的索引值,如果不存在则返回-1
        int from =0;//查找范围的起始索引值
        int end=ints.length-1;//查找范围的结束索引值
        int mid=(from+end)/2;//中间元素的索引值
        //当from起始索引值 <= end结束索引值就查找
        while(from<=end){
            //始终与中间元素比较
            if(i==ints[mid]){
                return mid;
            }
            //要找的元素比中间元素小
            //把范围缩小到左一半, 调整end结束索引值
            if(i<ints[mid]){
                end=end-1;
                mid=(from+end)/2;
            }else{
                //要找的元素比中间元素大
                //把范围缩小到右一半, 调整from起始位置
                from=mid+1;
                mid=(from+end)/2;
            }
        }
        return -1 ;//出现了from>end的情况就说明不存在该元素
    }
}
