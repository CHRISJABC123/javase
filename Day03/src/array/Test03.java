package array;

/**
定义方法, 删除int[]数组中指定位置的元素, 方法需要通过参数来接收一个数组, 接收一个位置
 */
public class Test03 {
    public static void main(String[] args) {
        int[] ints = {34,56,78,89,21,435,7};

        //调用方法删除数组中的指定位置的元素, 把方法返回的新数组再赋值给ints
        ints = delete(ints, 3);

        for (int xx : ints) {
            System.out.print(xx + "  ");
        }
        System.out.println();
    }

    private static int[] delete(int[] ints, int i) {
        if (i<0||i>=ints.length) {
            System.out.println("指定的位置" + i + "越界");
            return  ints;  //返回原数组
        }
        //把array[i]元素从数组中删除
        //1)定义较小的数组
        int smaller[]=new int[ints.length-1];
        //2) 把原数组[0,i)范围内的元素复制到小数组中
        System.arraycopy(ints, 0, smaller, 0, i);
        //3)把原数组[i+1, length)范围内元素复制到小数组中从i开始 的位置上
        System.arraycopy(ints, i+1, smaller, i, ints.length-i-1);
        //4)返回这个较小的数组
        return smaller;
    }
}
