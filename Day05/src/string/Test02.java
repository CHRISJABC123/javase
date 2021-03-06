package string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.text.Collator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/**
 * 姬动兴
 * 2021/3/5
 */
public class Test02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //char charAt(int index)  返回指定索引值的字符
        //int length()  返回字符串中字符的数量
        String txt="helloworld";
        System.out.println(txt.charAt(0));
        System.out.println(txt.length());
        //通过for循环遍历字符串的每个字符
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(txt.charAt(i)+ " ");
        }
        System.out.println();
//        int compareTo(String anotherString) 比较当前字符串与参数字符串大小,如果当前字符串大返回正数,参数字符串大返回负数,相等返回0
//        int compareToIgnoreCase(String str)忽略大小写后再比较两个字符串的大小
        String s1="hello";
        String s2="world";
        System.out.println(s1.compareTo(s2)); //-15 负数表示第一个字符串小
        System.out.println(s2.compareTo(s1));//15 正数表示第一个字符串大
        String s3="Hello";
        System.out.println(s1.compareToIgnoreCase(s3));//0表示两个字符串相等
        //根据汉字顺序比较,需要先获得一个汉字的比较器
        Collator collator=Collator.getInstance(Locale.CHINESE);
        System.out.println(collator.compare("张三", "李四"));
        ////判断txt字符串是否包含hello
        System.out.println(txt.contains("hello"));
        //判断txt字符串是否以hello开始
        System.out.println(txt.startsWith("hello"));
        //判断txt字符串是否以hello结尾
        System.out.println(txt.endsWith("hello"));
        //判断txt字符串忽略大小写后, 是否与"Hello动力节点"一样,   String变量与String字面量比较时,经常把字面量放在前面调用字符串的方法, 避免出现空指针异常
        System.out.println("hello".equals(txt));
        System.out.println("hello".equalsIgnoreCase(txt));
        //byte[] getBytes()  返回字符串在默认编码下对应的字节数组
        System.out.println(Arrays.toString(txt.getBytes()));
        //byte[] getBytes(String charsetName)  返回字符串以charsetName编码下对应的字节数组
        System.out.println(Arrays.toString(txt.getBytes("GBK")));
        //再把字节数组中的字节转换为字符串
        String utf8=new String(txt.getBytes());
        System.out.println(utf8);
        String Gbk=new String(txt.getBytes("GBK"));
        System.out.println(Gbk);

        //返回he在s1字符串中第一次出现的索引值, 0
        System.out.println(txt.indexOf("h"));
        //14, 最后一次出现的索引值
        System.out.println(txt.lastIndexOf("h"));
        //从索引值为1的位置开始取字符串
        System.out.println(txt.substring(1));
        //截取字符串的区间是左闭右开的
        //返回[0, 6)范围内的字符串
        System.out.println(txt.substring(0, 6));


        String path = "D:\\course\\03-javase\\Code\\day05\\src\\string\\Test02.java";

        int slash = path.lastIndexOf("\\");
        int dot = path.indexOf('.');
        //文件所在路径
        String folder = path.substring(0, slash);
        //文件名
        String filename = path.substring(slash + 1 , dot);
        //后缀
        String suffix = path.substring(dot + 1);
        System.out.println( folder );
        System.out.println( filename );
        System.out.println( suffix );


//        toCharArray() 把字符串转换为字符数组
//        String.valueOf()  把字符数组转换为字符串
        char [] chars=txt.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }
        System.out.println();
        System.out.println(String.valueOf(chars));

//        String toLowerCase()  把字符串中的大写字母转换为小写, 返回一个新字符串
//        String toUpperCase()  把字符串中的小写字母转换为大写, 返回一个新字符串

        String ss = "Good Good Study";
        s2=ss.toLowerCase();
        System.out.println(s2);
        System.out.println(ss.toUpperCase());

        //String trim()  去掉字符串前后的空白符,返回一个新的字符串
        String trim="    hello   world    ";
        System.out.println("--"+trim+"--");
        System.out.println("--"+trim.trim()+"--");

        //把整数转换为字符串
        int sum=222;
        System.out.println(String.valueOf(sum));
        //把字符串转换为整数
        String sumStr="123";
        sum=Integer.parseInt(sumStr);
        System.out.println(Integer.parseInt(sumStr));
    }

}
