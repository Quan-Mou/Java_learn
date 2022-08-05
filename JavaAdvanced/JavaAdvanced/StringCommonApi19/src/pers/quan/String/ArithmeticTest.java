package pers.quan.String;

public class ArithmeticTest {
    public static void main(String[] args) {
//        String str = " Hello Wrodl ";
        String str = "     ";
        ArithmeticTest arithmeticTest = new ArithmeticTest();
        String s = arithmeticTest.myTrim(str);
        System.out.println(s);

    }
    public String myTrim(String str) {
        if(str.length() == 0) {
            return str;
        }
        System.out.println(str.length());
        if (str != null) {
            char[] chars = str.toCharArray();
            int start = 0;
            int end = chars.length - 1;
            while (chars[start] == ' ' && start - end > 0) {
                start++;
            }

            while (chars[end] == ' ' && end < start) {
                end--;
            }
            String s = new String(chars);
            return s.substring(start,end+1);
        }
        return null;
    }


}
