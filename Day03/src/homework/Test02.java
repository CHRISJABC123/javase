package homework;

/**
 定义方法, 实现数组中各个元素的逆序
 */
public class Test02 {
    public static void main(String[] args) {
        int arr[] ={11,222,333,444,555,666};
        reverse(arr);
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }

    private static void reverse(int[] arr) {
        //逆序的话，只能循环数组长度一半的次数
        for (int i = 0; i < arr.length/2; i++) {
            //arr[0]与arr[arr.length-1]互换
            //arr[1]与arr[arr.length-2]互换
            //arr[2]与arr[arr.length-3]互换
            //arr[i]与arr[arr.length-1-i]互换
            int t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
    }
}
