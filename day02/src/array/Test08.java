package array;

/**
 变长参数作用是用来接收任意个数据,定义格式为:
 返回值类型  方法名( [参数类型 参数名,]  变长参数类型 … 变长参数名){}
 说明:
 1)一个方法最多只能有一个变长参数
 2)变长参数只能定义在参数列表的最后
 3)变长参数在参数类型与参数名中间使用三个小点分隔
 4)在调用时可以给变长参数传递任意个数据
 5)数组可以作为变长参数传递
 */
public class Test08 {
    public static void main(String[] args) {
        sum(1,2);
        sum(1,2,3);
        int ints[]={1,1,1};
        sum(ints);
    }
    //定义方法求任意个整数的和
    private static void sum(int...num) {
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        System.out.println("输入的整数和为:"+sum);
    }
}
