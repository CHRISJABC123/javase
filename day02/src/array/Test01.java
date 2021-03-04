package array;

/**
 * 姬动兴
 * 2021/3/1
 */
public class Test01 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        arr [0]=11;
        arr [1]=22;
        arr [2]=33;
        arr [3]=44;
        arr [4]=55;
        arr [5]=66;
        arr [6]=77;
        arr [7]=88;
        arr [8]=99;
        arr [9]=00;
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }
        System.out.println("================");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
