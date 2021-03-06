package random;

import java.util.Random;

/**
 * 姬动兴
 * 2021/3/6
 */
public class Test01 {
    public static void main(String[] args) {
        Random random=new Random();
        //随机小数
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextDouble());
        }

        System.out.println("================");
        //随机整数数
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
        System.out.println("============");
        //指定上限的随机整数
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10));  //[0 ,100)
        }

        System.out.println("=============");
        //指定上限的随机整数
        for (int i = 0; i < 10; i++) {
            System.out.println( random.nextInt(100) - 50);   //[-50, 50)
        }

    }
}
