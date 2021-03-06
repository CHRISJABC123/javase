package math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * BigInteger大的整数, BigDecimal大的小数,
 *  用于对精度要求比较高的场景 , 如财务计算, 科学计算..
 */
public class Test02 {
    public static void main(String[] args) {
        BigInteger big=new BigInteger("11111111123421341");
        BigInteger big1=new BigInteger("11114112341421341");
        //调用add()相加, subtract()相减, multiply()相乘, divide()相除
        System.out.println(big.add(big1));
        System.out.println(big.subtract(big1));
        System.out.println(big.multiply(big1));
        System.out.println(big.divide(big1));
        System.out.println("===========");

        BigDecimal bigDecimal=new BigDecimal("134142141.2341431");
        BigDecimal bigDecimal2=new BigDecimal("13414144151512141.2341431");
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));
        //小数相除时, 经常需要指定保留小数的位数,及尾数的处理方式,否则除不尽会抛异常RoundingMode.HALF_UP 四舍五入  是一个枚举类型
        System.out.println(bigDecimal.divide(bigDecimal2,5, RoundingMode.HALF_UP));


    }

    /**
     *枚举就是一组常量的组合,这个类只能取这组常量中的值
     */
    enum WeekDay{
        MON, TUE, WED, THU, FRI, SAT, SUN
    }
}
