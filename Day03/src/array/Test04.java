package array;


/**
 * 姬动兴
 * 2021/3/3
 */
public class Test04 {
    public static void main(String[] args) {
        Person person[]=new Person[10];
        //使用对象数组的时候经常使用计数器
        int size=0;
        person[size++]=new Person("张三", 22);
        person[size++]=new Person("李四", 23);
        person[size++]=new Person("王五", 24);
        person[size++]=new Person("赵六", 25);
        person[size++]=new Person("陈七", 27);
        person[size++]=new Person("zhaoliu", 27);
        for (Person person1 : person) {
            System.out.println(person1);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(person[i].name);
        }
        //5) 查找是否存在姓名为chenqi的Person对象
        String name="chengqi";
        //遍历data数组中保存的前size个Person对象, 如果有一个Person对象的姓名与name一样就说明存在;  如果所有的Person对象的姓名与chenqi都不匹配, 说明不存在
        boolean exist=false;//定义存在标志,先假设不存在
        for (int i = 0; i < size; i++) {
            if(name.equals(person[i].name)){
                exist=true;
                break;
            }
        }
        if(exist){
            System.out.println(name+"存在");
        }else{
            System.out.println(name+"不存在");
        }

        //6) 删除姓名为zhaoliu的Person对象
        //先确定zhaoliu在数组中的索引值 index
        int index=-1; //定义变量保存zhaoliu在数组中的索引值
        for (int i = 0; i < size; i++) {
            if ("zhaoliu".equals(person[i].name)) {
                index=i;
            }
        }
        if (index >=0) {
            //从index+1开始,每个元素逐个前移
            System.arraycopy(person, index+1, person, index, size-index-1);
            //size-1元素置为null
            person[size-1]=null;
            //元素个数减1
            size--;
        }else {
            System.out.println("数组中不存在姓名为zhaoliu的对象");
        }
        System.out.println("----------删除zhaoliu后------------");
        for (int i = 0; i < size; i++) {
            System.out.println(person[i]);
        }
        System.out.println("=======================所有数组元素==========");
        for (Person person1 : person) {
            System.out.println(person1);
        }
    }
}
