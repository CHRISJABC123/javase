package emnu;

/**
 * 姬动兴
 * 2021/3/6
 */
public enum TestEmnu {
    STUDENTNAME("ZHANGSAN",22),
    TEACHERNAME("LISI",40);

    private String name;
    private int age;

    TestEmnu(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
