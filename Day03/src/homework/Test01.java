package homework;

/**
 * 定义方法, 实现数组中各个元素的乱序, 遍历数组的每个元素,把该元素与另外一个随机下标的元素进行交换
 */
public class Test01 {
    public static void main(String[] args) {
        int arr[] ={11,222,333,444,555};
        shuffle(arr);
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }

    private static void shuffle(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            //把array[i]元素与array[x]元素交换, x下标需要随机生成
            int x=(int)(Math.random()*arr.length);//[0, array.length)范围内的一个随机整数
            int t=arr[i];
            arr[i]=arr[x];
            arr[x]=t;
        }
    }
}
