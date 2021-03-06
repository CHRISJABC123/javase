package array;

/**
 * 二维数组
 */
public class Test05 {
    public static void main(String[] args) {
        //定义三个一维数组
        int[] ints1 = new int[10];
        int[] ints2 = new int[]{1, 3, 5};
        int x = 2;
        int y = 4;
        int[] ints3 ={x,y};
        //定义一个二维数组，把三个一维数组作为元素添加到二维数组中
        int [] [] arr=new int[][]{ints1,ints2,ints3};
        //使用for循环遍历这个二维数组
        for (int i = 0; i < arr.length; i++) {
            //这里把arr[i]看作一个数组名
            for (int j = 0; j < arr[i].length; j++) {
                //遍历arr[i]中的i元素
                System.out.print(arr[i][j]+" ");
            }
            //每遍历出来一个元素换一行
            System.out.println();
        }
        System.out.println("================");
        //使用foreach循环遍历这个二维数组
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            //遍历完这个元素后换一行
            System.out.println();
        }
    }
}
