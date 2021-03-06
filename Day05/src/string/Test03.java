package string;

import java.util.Scanner;

/**
 * 姬动兴
 * 2021/3/5
 */
public class Test03 {
    public static void main(String[] args) {
//        //从键盘上输入手机号,验证用户的输入格式是否正确
////        //先定义一个手机号的正则表达式
////        String pattern = "1[3-9]\\d{9}";
////        Scanner scanner=new Scanner(System.in);
////        System.out.println("请输入手机");
////        //返回字符串
////        String phone=scanner.next();
////        if (!phone.matches(pattern)) {
////            System.out.println("格式错");
////        }else{
////            System.out.println("ok");
////        }

        //split()可以对字符串拆分, 把下面这句话中的英文单词拆分出来
        String txt = "If you don't workd hard,no one can give the life you want";
        //这句话中单词之间使用一个空格或者逗号进行分隔的, 可以使用[ ,]对字符串进行拆分,空格可读性差,可以改为[\\s,]
        String [] split=txt.split("[\\s,]");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i].toString());
        }

        //replaceAll()替换,返回新的字符串, 原来的字符串不变
        txt = "liuxijin123456dingding";
        //把字符串中的数字使用*替换掉
        String ss=txt.replaceAll("[\\d]", "*");
        System.out.println(ss);
        System.out.println(txt);

    }
}
