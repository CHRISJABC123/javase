package array;


/**
 * 定义一个存储100个char字符的数组
 * 给字符数组的元素赋值一些随机的小写字母
 * 统计a在数组中出现的次数
 * //统计chars数组中每个小写字母的次数
 */
public class Test04 {
    public static void main(String[] args) {
        char chars[]=new char[10];
        for (int i = 0; i < chars.length; i++) {
            double random = Math.random();
            //每循环一次生成[0,26)随机数
            int rr=(int)(random*26);
            //每循环一次生成a-z随机字母
            char cc= (char) ('a'+rr);
            //给数组复制a-z随机字母
            chars[i]=cc;
        }
        //打印数组中的字母
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
        //定义保存a次数的计数器
        int countA=0;
        //遍历chars找出a的次数
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='a'){
                countA++;
            }
        }
        System.out.println("a出现的次数是："+countA);
        System.out.println();
        //统计chars数组中每个小写字母的次数
        //定义一个数组，数组中存储每个字母出现次数的计数器,每一个元素的默认值都为0
        int counts[]=new int[26];
        //遍历chars，给对应的计数器增加数值
        for (int i = 0; i < chars.length; i++) {
            //每遍历出一个字母，赋值给cc
            char cc=chars[i];
            //给数组中对应的计数器+1
            counts[cc-'a']++;
            System.out.println(cc+"出现的次数："+counts[cc-'a']);
        }

    }
}
