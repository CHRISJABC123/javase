package string;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.print.DocFlavor;

/**
 * 创建String对象的几种常用方式
 */
public class Test01 {
    public static void main(String[] args) {
        //1) 直接赋值字符串字面量
        String s1 = "hello";
        //2)把bytes数组中所有的字节转换为字符串
        byte bytes[] = new byte[]{66, 66, 66, 67, 67, 67, 97, 97, 97};
        String s2 = new String(bytes);
        System.out.println(s2);
        //3)把bytes数组中从0开始的5个字节转换为字符串
        s2 = new String(bytes, 0, 4);
        System.out.println(s2);
//        4)String(char[] chars) 根据字符数组创建字符串对象
        char [] chars={'a','A','5','*',97,98,99,30066,30088};
        String s3=new String (chars);
        System.out.println(s3);
        //5)把chars数组中从0开始的6个字符转换为字符串
        s3 = new String(chars, 0, 6);
        System.out.println(s3);
        String s4=new String();
        System.out.println(s4);
        System.out.println(s4==null);
        String s5= new String(s1);
        System.out.println(s5);
        System.out.println(s5.equals(s1));
    }
}
