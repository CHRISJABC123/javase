package mydate;

import java.util.Scanner;

/**
 * 打印日历
 * 2021/3/1
 */
public class Test01 {
    public static void main(String[] args) {
        //1) 从键盘上输入一个年月
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年月");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        //2)打印日历
        //2.1 第一行表头
        System.out.println("一\t二\t三\t四\t五\t六\t日\t");
        //先确定本月1号是星期几
        int weekDay = getWeekDay(year, month, 1);
        //打印空白
        //本月1号是星期一 0个空格，本月1号是星期五 4个空格
        //循环打印空格
        //数字每7个就需要换行,定义计数器变量
        int count = 0;     //用于统计打印数字的数量
        for (int i = 1; i < weekDay; i++) {
            System.out.print("\t");
            count++;
        }
        //2.2 打印本月的数字
        for (int i = 1; i < getMonthDay(year, month); i++) {
            System.out.print(i + "\t");
            count++;
            //判断是否需要换行
            if (count % 7 == 0) {
                System.out.println();
            }
        }

    }

    //定义方法,返回指定日期对应星期几,返回数字表示星期一,数字2表示星期二,...数字6表示星期六,数字7表示星期日
    private static int getWeekDay(int year, int month, int day) {
        //已知1900-1-1 是星期一, 判断year-month-day是星期几, 需要先计算从1900-1-1到year-month-day经过的总天数
        int sum = 0;   //保存总天数
        //先累加整年的天数
        for (int i = 1900; i < year; i++) {
            sum += isLeap(i) ? 366 : 365;
        }
        //再累加整月的天数
        for (int i = 1; i < month; i++) {
            sum += getMonthDay(year, i);
        }
        //再累加当前月的天数
        sum += day;
        //总天数对7求余,就是星期几
        int r = sum % 7;//余数从0~6, 余数为1表示星期一,余数为2表示星期二, 余数为6表示星期六,余数为0表示星期日
        return r == 0 ? 7 : r;//把余数为0修正为7
    }

    //每月有多少天
    private static int getMonthDay(int year, int month) {
        switch (month) {
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
                if (isLeap(year)) {
                    return 29;
                } else {
                    return 28;
                }
        }
        return 0;
    }

    //判断闰年
    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
