package array;

/**
    数组作为方法返回值
 */
public class Test06 {
    public static void main(String[] args) {
        int[] array = getArray();
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static int [] getArray() {
        int arr[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            double random = Math.random();
            int sum=(int)(random*10);
            arr[i]=sum;
        }
        return arr;
    }
}
