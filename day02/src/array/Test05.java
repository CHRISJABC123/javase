package array;


/**
 * 数组作为方法参数传递
 */
public class Test05 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printArr(arr);
        System.out.println();
        swap(arr,0,1);
    }
    //定义一个方法接受数组，并替换数组中元素的位置
    private static void swap(int array[],int i,int j) {
        if(i<0||i>array.length){
            System.out.println("第一个下标越界");
        }
        if(j<0||j>array.length){
            System.out.println("第二个下标越界");
        }
        int t=array[i];
        array[i]=array[j];
        array[j]=t;
        for (int i1 : array) {
            System.out.println(i1);
        }
    }
    //定义一个方法接受数组
    private static void printArr(int array[]) {
        for (int i : array) {
            System.out.println(i);
        }
    }

}
