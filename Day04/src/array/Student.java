package array;

/**
 * 定义Student学生类, 想让Student对象具有比较大小的功能, 需要让Student类实现Comaprable接口,可以通过泛型传递一个数据类型, 即传递另外一个比较对象的类型也为Student对象, 即当前Student对象与另外一个Student对象比较大小.
 * 重写Comparable接口的抽象方法compareTo(), 在compareTo()方法中定义一个比较规则
 */
public class Student implements Comparable<Student>{
    int age;
    String name;
    double score;

    public Student(int age, String name, double score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //在当前方法中指定一个比较规则, 当前this对象与参数o对象比较大小,
        //比较成绩, 规则:
//        如果当前this对象的成绩比参数o对象的成绩高返回正数, 相等返回0, this对象的成绩低返回负数, 在排序时对应升序排序
//        如果当前this对象的成绩比参数o对象的成绩高返回负数, 相等返回0, this对象的成绩低返回正数, 在排序时对应降序排序
        if(this.score>o.score){
            return -11;
        }else if(this.score<o.score){
            return 11;
        }else{
            return 0;
        }
    }
}
