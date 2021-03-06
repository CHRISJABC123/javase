package company;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/**
 * 定义Company公司类,
 */
public class Company {
    //公司中有若干的员工, 使用数组保存员工信息
    private Employee[] data;
    //一般情况下, 使用对象数组时会定义一个变量记录数组中元素的数量
    int size=0;
    //一般情况下,会在无参构造方法中对数组进行初始化
    public Company() {
        data = new Employee[100];   //数组初始化大小需要估算
    }
    //有时,也会使用有参构造,通过构造方法接收一个数组的长度
    public Company(int capacity) {
        if(capacity>0){
            data=new Employee[capacity];
        }else{
            data=new Employee[100];
        }
    }

    //     定义方法添加员工,通过参数接收一个员工
    public void add(Employee employee){
        //把参数e接收的员工添加到data数组中,
        //一般情况下,向数组中存储数据前, 确保数组有足够的容量
        //数组中元素的数量size等于数组的长度, 表示数组已满 , 需要扩容
        if(size==data.length){
            Arrays.copyOf(data, data.length*2);
        }
        data[size++]=employee;  //把对象保存到数组中
    }

    //    定义方法显示所有的员工
    public void showAll(){
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    //定义方法显示是否包含某姓名的员工
    public boolean containsName(String name){
        if (name != null) {
            for (int i = 0; i < size; i++) {
                if (name.equals(data[i].getName())) {
                    return true;
                }
            }
        }else{
            //判断已有员工中是否有姓名为null的情况
            for (int i = 0; i < size; i++) {
                if (null==data[i].getName()) {
                    return true;
                }
            }
        }
        return false;
    }

    //定义方法，根据姓名升序
    public void sortByName(){
        Arrays.sort(data, 0, size, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                Collator collator=Collator.getInstance(Locale.CHINESE);
                collator.compare(o1.getName(), o2.getName());
                return collator.compare(o1.getName(), o2.getName());
            }
        });

    }

    //定义方法,根据年龄降序排序
    public void sorrByAgeDesc(){
      Arrays.sort(data, 0, size, new Comparator<Employee>() {
          @Override
          public int compare(Employee o1, Employee o2) {
             return o2.getAge()-o1.getAge();
          }
      });
    }

    //根据工资降序
    public void sortBySalaryDesc(){
        Arrays.sort(data, 0, size, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary()-o1.getSalary());
            }
        });
    }

    //根据姓名删除员工
    public void deleteByName(String name){
        //先确定name姓名的员工在数组中索引值index
        int index=indexOf(name);
        if (index>0) {
            //从index+1开始逐个前移
            System.arraycopy(data, index+1, data, index, size-index-1);
            //元素个数减1
            size--;
            //原来最后一个元素置为null
            data[size]=null;
        }
    }

    private int indexOf(String name) {
        if (name != null) {
            //遍历data数组中前size个元素,如果有某个元素的姓名与name一样就返回它的下标
            for (int i = 0; i < size; i++) {
                if (name.equals(data[i].getName())) {
                    return i;
                }
            }
        }else{
            //参数姓名为null的情况,判断data数组中是否存在某个员工的姓名也是null
            for (int i = 0; i < size; i++) {
                if (data[i].getName()== null) {
                    return i;
                }
            }
        }
        return -1;//返回负数表示不存在这个姓名
    }
}
