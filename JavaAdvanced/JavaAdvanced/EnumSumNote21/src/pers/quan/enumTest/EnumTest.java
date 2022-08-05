package pers.quan.enumTest;

public class EnumTest {

    public static void main(String[] args) {
        Seasons1 spring2 = Seasons1.SPRING2;
        System.out.println(spring2);

    }

}

enum Seasons1 {
//    枚举对象必须写在最前面
//    public static final Seasons SPRING = new Seasons("春天","春暖花开");
    SPRING2("春天","春暖花开"), // 相当于上面的写法
    SUMMER("夏天","夏日炎炎");

//    如果有多个枚举对象，最后一个枚举对象是用 ; 号结尾，其他用,号结尾
    private final String Name;
    private final String Desc;

//    枚举类重写了toString方法，是继承java.lang.Enum类，由这个类重写。

    private Seasons1(String name, String desc) {
        Name = name;
        Desc = desc;
    }

    public String getName() {
        return Name;
    }

    public String getDesc() {
        return Desc;
    }
}
