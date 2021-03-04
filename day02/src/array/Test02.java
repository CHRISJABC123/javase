package array;

import java.net.SocketTimeoutException;

/**
 * 姬动兴
 * 2021/3/2
 */
public class Test02 {
    public static void main(String[] args) {
        //2) 也可以在定义数组的同时给数组所有元素赋值,称为数组的静态初始化
        double arr[]=new double[]{1.1,1.2,1.3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("============");
        //3)数组静态初始化也可以简化为
        double doubles[]={2.1,2.2,2.3};
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
        System.out.println("============");
        boolean booleans[]={true,true,false,false};
        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }
        System.out.println("============");
        String strings[]={"hello","chrisj"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("============");
        char chars[]={82,'h','B'};
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
