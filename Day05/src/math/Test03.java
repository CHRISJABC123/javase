package math;

import java.text.DecimalFormat;

/**
 * DecimalFormat对象数字格式化
 */
public class Test03 {
    public static void main(String[] args) {
        //创建DecimalFormat对象,经常在构造方法中指定数字格式串,常用 的数字格式符有: #代表数字(不补0), 0表示数字(补0), ,逗号表示千分位,  小数点.
        DecimalFormat decimalFormat=new DecimalFormat("###,###.####");
        //调用format()方法对数字格式化
        String format = decimalFormat.format(12.3);
        System.out.println(format);

        System.out.println( decimalFormat.format(12345678.3)); //12,345,678.3000
        System.out.println(decimalFormat.format(12.123456789));    //12.1235
    }
}
