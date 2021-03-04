package mydate;

import java.util.Scanner;

/**
 从键盘上输入一个日期，打印这个日期对应当年的第几天
 */
public class Test {
    public static void main(String[] args) {
        //1) 从键盘上输入一个日期
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年月日");
        int year=scanner.nextInt();
        int month=scanner.nextInt();
        int day=scanner.nextInt();
        //2) 计算这个日期是这一年的第几天
        int sum=getDays(year,month,day);
        //3) 打印结果
        System.out.println(year + "年" + month + "月" + day + "日是" + year + "年的第" + sum + "天");
    }

    private static int getDays(int year,int month,int day) {
        //计算year-month-day日期是year这一年的第多少天, 需要从1月1号累加到month月day号
        int sum=0;
        //可以先累加整月的天数
        for(int i=1;i<month;i++){
            //获得前i个月的天数
            sum+=getMonthDay(year, i);
        }
        //再累加当前月的天数
        sum+=day;
        return sum;
    }
    //定义方法返回指定月份的天数
    private static int getMonthDay(int year,int month) {
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeap(year)){
                    return 29;
                }else{
                    return 28;
                }
        }
        return 0;
    }
    //判断闰年
    private static boolean isLeap(int year) {
        return year%4==0&&year%100!=0||year%400==0;
    }
}
