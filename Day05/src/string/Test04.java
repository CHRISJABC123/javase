package string;

import java.util.Arrays;

/**
    StringBuider和stringBuffer是可变字符串(字符序列可变，不会生成新的字符串对象)
   ，stringbuilder效率高，线程不安全，stringbuffer效率低，线程安全
 */
public class Test04 {

    public static void main(String[] args) {
        //创建可变字符串对象
        StringBuilder sb=new StringBuilder();
        //字符串连接
        //连接成一个字符数组
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        //Stringbuilder底层会自动调用Arrays.toString()
        System.out.println(sb);


        //删除
        sb.delete(3, 6);
        System.out.println(sb);

        //插入
        sb.insert(1, 22);
        System.out.println(sb);

        //替换
        sb.replace(0, 3, "hahah");
        System.out.println(sb);

        //逆序
        sb.reverse();
        System.out.println(sb);
    }
}
