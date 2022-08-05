package pers.quan.String;

public class TransitonTest {

    public static void main(String[] args) {
//        基本数据类型 、包装类 ——》字符串
        int a = 10;
        Integer b = 10;
        String s1 = String.valueOf(b);
        String s = String.valueOf(a); // 基本数据类型转为字符串

//        字符串转为基本数据类型  包装类名.parseXXX(需要转换的数据)
        double v = Double.parseDouble(s1);
        double v1 = v + 10;

//        String 转换为char[]
        char[] ch = new char[]{'a','b','c','d'};
        String s2 = new String(ch);
        System.out.println(s2);

//        字符串转为字符数组

        char[] chars = s2.toCharArray();
        System.out.println(chars[0]);
    }

}
