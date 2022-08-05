package pers.quan.String;

/**
 * endsWith(String suffix) : 该字符串是否是以指定的后缀结束
 * startsWith(String StartStr) :该字符是否是以指定的前缀结束
 * boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
 * boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
 * String indexOf(String index) : 返回此字符串第一次出现的位置
 * String indexOf(String index,int i) :返回从指定索引开始出现的第一个字符串
 * int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
 * int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
 * 注：indexOf和lastIndexOf方法如果未找到都是返回-1
 *
 * String replace(char oldChar, char newChar)：返回一个新的替换后的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
 * String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 * String replaceAll(String regex, String replacement) ： 使 用 给 定 的replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
 * String replaceFirst(String regex, String replacement) ： 使 用 给 定 的replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
 *  boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。
 */
public class String2 {
    public static void main(String[] args) {
        String str = "abce";
        boolean c = str.endsWith("bce");
        System.out.println(c);
        boolean ab = str.startsWith("ab");
        System.out.println(ab);
        boolean ce = str.startsWith("bce", 1);
        System.out.println(ce);
        String str2 = "QuanMouQMo";
        int m = str2.indexOf("M0");
        System.out.println(m);
        String str3 = "HellWorldW";

        String replace = str3.replace('W', 'Z');
        System.out.println(replace);
    }
}
