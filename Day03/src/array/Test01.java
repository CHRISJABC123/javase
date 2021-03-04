package array;

/**
    定义方法实现数组的扩容
 */
public class Test01 {
    public static void main(String[] args) {
        int ints[]={1,2,3,4,6};
        //把新数组赋值给小数组
        ints = bigger(ints);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }

    private static int[] bigger(int[] ints) {
        //1.定义一个更大的数组
//        int [] bigger = new int[ints.length  + (ints.length >> 1 ) ];   //按1.5倍大小扩容   >>按位右移  >>1按位右移1位相当于除以2,  <<2按位左移2位相当于乘以4. 当乘以2,4,8,16,32这种2的幂次方时, 使用移位运算效率比直接相乘效率高
        int bigger[]=new int[ints.length*2];
        //2.将原数组拷贝到这个新数组当中
        for (int i = 0; i < ints.length; i++) {
            bigger[i]=ints[i];
        }
        //3.返回新数组
        return bigger;
    }
}
