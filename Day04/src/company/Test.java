package company;

/**
 * 姬动兴
 * 2021/3/5
 */
public class Test {
    public static void main(String[] args) {
        //创建公司对象向公司中添加员工
        Company company=new Company();
        company.add(new Employee("lisi", 22, 2000));
        company.add(new Employee("zhangsan", 52, 2200));
        company.add(new Employee("wangwu", 21, 5000));
        company.add(new Employee("zhaoliu", 42, 7000));
        //来了两个新员工,但是员工信息还没有录入到系统
        company.add(new Employee());
        company.add(new Employee());
        System.out.println("公司所有员工");
        company.showAll();
        System.out.println("有lisi这个人吗");
        boolean isContainsName = company.containsName("lisi");
        System.out.println(isContainsName);
        //判断是否还有员工没有录入姓名,即是否存在姓名为null的员工
        System.out.println("即是否存在姓名为null的员工");
        System.out.println( company.containsName( null));
        //如果有姓名为null的员工就删除他
        while(company.containsName(null)){
            company.deleteByName(null);
        }
        System.out.println("删除姓名为null的员工后");
        company.showAll();
        System.out.println("根据姓名升序");
        company.sortByName();
        company.showAll();
    }

}
