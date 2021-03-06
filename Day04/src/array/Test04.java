package array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 姬动兴
 * 2021/3/4
 */
public class Test04 {
    public static void main(String[] args) {
        /**
         * 第一种方法，让Student类实现Comparable<Student>接口,重写compareto方法，在方法中定义比较规则
         * 如果当前this对象的成绩比参数o对象的成绩高返回正数, 相等返回0, this对象的成绩低返回负数, 在排序时对应升序排序
         * 如果当前this对象的成绩比参数o对象的成绩高返回负数, 相等返回0, this对象的成绩低返回正数, 在排序时对应降序排序
         */
        //定义一个数组存储学生对象
        Student student []=new Student[10];
        //定义一个变量存储存储对象的数量
        int size=0;
        student[size++]=new Student(22, "lisi", 80);
        student[size++]=new Student(32, "zhangsan", 88);
        student[size++]=new Student(19, "chenqi", 50);
        student[size++]=new Student(52, "zhuba", 64);
        student[size++]=new Student(34, "zhaoliu", 70);
        //因为只有前size个元素有值，所以排序的时候要指定只排前size个元素，否则会报空指针异常
        Arrays.sort(student, 0, size);
        //只遍历前size个有值的元素
        for (int i = 0; i < size; i++) {
            System.out.println(student[i]);
        }

        System.out.println("============================");
        /**
         * 第二种方法使用Arrays.sort(数组,起始下标,结束下标,Comparator)进行排序
         */
        Arrays.sort(student,0,size, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //要求根据学生年龄升序排序
                //如果o1.age>o2.age返回正数,o1.age==o2.age返回0,o1.age<o2.age返回负数,对应数组升序排序
                //如果o1.age>o2.age返回负数,o1.age==o2.age返回0,o1.age<o2.age返回正数,对应数组降序序排序
                return o2.age-o1.age;
            }
        });

        for (int i = 0; i < size; i++) {
            System.out.println(student[i]);
        }
    }
}
