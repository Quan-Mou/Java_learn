package pers.quan.enumTest;

public class CustomEnum {
    public static void main(String[] args) {
        Seasons spring = Seasons.SPRING;
        Seasons summer = Seasons.SUMMER;
        System.out.println(spring.getName());
        System.out.println(summer.getName());
    }
}

//自定义枚举类
class Seasons {
    private final  String Name;
    private final  String Describe;

    private  Seasons(String name, String describe) {
        Name = name;
        Describe = describe;
    }
   public static final Seasons SUMMER = new Seasons("夏天","烈日炎炎");
   public static final Seasons SPRING = new Seasons("春天","万物复苏");
   public static final Seasons AUTUMN = new Seasons("秋天","金秋送爽");
   public static final Seasons WINTER = new Seasons("冬天","白雪皑皑");

    public String getName() {
        return Name;
    }

    public String getDescribe() {
        return Describe;
    }
}