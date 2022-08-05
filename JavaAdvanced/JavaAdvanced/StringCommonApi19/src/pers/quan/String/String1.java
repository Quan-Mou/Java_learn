package pers.quan.String;

/**
 *  int length() :  返回字符串长度
 *  char charAt(int index) : 返回指定索引的字符
 *  boolean isEmpty() : 判断是否是空字符
 *  String toLowerCase() ： 字符串转换为小写
 *  String toUpperCase() : 字符串转换为大写
 *  String trim() : 去除字符串收尾的空格。（可配合replace() 去除中间空格）
 *  String equlas(Object obj) : 比较两个字符串是否相等
 *  String equlasIgnore(String anotherString)：与equals方法类似，忽略大小写
 *  String concat(String str) : 连接字符串 等同于 +
 *  int CompareTo(String anotherString) : 比较字符的大小（按ASCll表）
 *  String substring(int beginIndex) : 字符串截取，从beginIndex位置截取到最后一个字符
 *  String substring(ind beginIndex ,int endIndex) ： 字符串截取，从beginIndex开始到endIndex(不包含)的一个子字符串
 */
public class String1 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        char ret = str.charAt(10);
        System.out.println(ret);
        String str2 = "";
        boolean isEmptyStr = str2.isEmpty();
        System.out.println(isEmptyStr);
        String newStr = str.toLowerCase();
        System.out.println(newStr);
        String newStr2 = str.toUpperCase();
        System.out.println(newStr2);
        String str3 = " 你好 世界 ； ‘ ";
        String trim = str3.trim();
        System.out.println(str3 + " ||" + trim);
        String str4 = "Hello World";
        boolean equals = str.equals(str4);
        System.out.println(equals);
        String str5 = str.toUpperCase();
        boolean b = str4.equalsIgnoreCase(str5);
        System.out.println(b);
        String concat = str.concat(str5);
        System.out.println(concat);
        int a = "b".compareTo("a");
        System.out.println(a);
        String substring = "Hello World".substring(6);
        System.out.println(substring);
        String substring1 = str.substring(0, 2);
        System.out.println(substring1);
    }
}
