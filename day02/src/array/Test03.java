package array;

import java.util.Scanner;

/**
 * 定义数组存储10个学生的成绩,
 * 从键盘上输入成绩保存到数组中
 * 计算所有同学的平均成绩是多少
 * 统计高于平均分的人数
 * 找出最高分与它的索引值
 */
public class Test03 {
    public static void main(String[] args) {
        int scoreArr[] = new int[10];
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println("请输入学生成绩");
            Scanner scanner = new Scanner(System.in);
            scoreArr[i] = scanner.nextInt();
        }
        //计算所有同学的平均成绩是多少
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        int avg = sum / scoreArr.length;
        System.out.println("所有学生平均成绩为："+avg);
        //统计高于平均分的人数
        int count=0;
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i]>avg){
                count++;
            }
        }
        System.out.println("高于平均分的人数为："+count);

        //找出最高分与它的索引值
        //定义一个变量为最大值下标
        int max=0;
        //假设数组中第一个变量就是最大值，依次往后比较，如果后面的比最大值还大，最大值下表就换成后面的
        for (int i = max+1; i < scoreArr.length; i++) {
            if(scoreArr[max]<scoreArr[i]){
                max=i;
            }
        }
        System.out.println("最高分是："+scoreArr[max]+"最高分下表是:"+max);
    }
}
