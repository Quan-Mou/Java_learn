package pers.quan.String;

import org.junit.Test;

/**
 *
 * java.lang.StringBuffer代表可变的字符序列，JDK1.0中声明，可以对字符串内容进行增删，此时不会产生新的对象
 * 很多方法与String相同。
 * StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
 * StringBuffer delete(int start,int end)：删除指定位置的内容
 * StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
 * StringBuffer insert(int offset, xxx)：在指定位置插入xxx
 * StringBuffer reverse() ：把当前字符序列逆转
 *
 * 当append和insert时，如果原来value数组长度不够，可扩容。
 * 如上这些方法支持方法链操作
 */
public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer(10);

        s1.append('a');
        System.out.println(s1); // 没有返回新字符串，改变了原字符
        s1.append(2);
        s1.append('c');
        s1.delete(0,1);
        System.out.println(s1);
        s1.replace(0,1,"ZQH");
        System.out.println(s1);

        s1.insert(0,"X");
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);
    }

    @Test
    public void test() {
//        将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反 转为”abfedcg”
        String targer = "abcdefg";



    }

    @Test
    public void test2() {
//        获取一个字符串在另一个字符串中出现的次数。比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数

    }

    @Test
    public void test3() {
//        获取两个字符串中最大相同子串。比如：str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
//        提示：将短的那个串进行长度依次递减的子串与较长的串比较。
    }

    @Test
    public void test4() {
//        对字符串中字符进行自然顺序排序。
//        提示：
//        1）字符串变成字符数组。
//        2）对数组排序，选择，冒泡，Arrays.sort();
//        3）将排序后的数组变成字符串。
    }

}
