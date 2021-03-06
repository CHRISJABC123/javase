package math;

import javax.sound.midi.Soundbank;

/**
 * 姬动兴
 * 2021/3/6
 */
public class Test01 {
    public static void main(String[] args) {
        //生成随机小数
        for (int i = 0; i < 10; i++) {
            double num= Math.random();
            System.out.println(num);
        }
        System.out.println(Math.pow(2, 2));//平方
        System.out.println(Math.sqrt(100));//平方根
        System.out.println(Math.cbrt(1000));//立方根
    }

}
