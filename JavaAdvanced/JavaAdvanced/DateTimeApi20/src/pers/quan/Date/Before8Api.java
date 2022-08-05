package pers.quan.Date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Before8Api {
//    1.java.lang.system
//    2.java.util.Date/和他的子类java.sql.Date （ java.sql.Date对应着数据库中的日期类型的变量）
//     3.java.SimpleDateFormat类
    @Test
    public void system() {
        long time = System.currentTimeMillis();
        System.out.println(time); // 获取的是1970年到当前时间的时间戳
    }

    @Test
    public void test2() {
//        Date两个构造器：1.Date()：创建一个对应当前时间的Date对象 2.创建指定毫秒数的Date对象
//        两个方法：
//        1.getTime() // 返回时间戳
//        2.toString() // 当前时间字符串
        Date date1 = new Date();
        System.out.println(date1);  // 该对象返回的是当前时间
        long time = date1.getTime(); // 当前时间戳
        System.out.println(time);

        Date date2 = new Date(943423423434L); // 返回当前毫秒数指定的Date对象
        System.out.println(date2);
        String currentTime = date2.toString();
        System.out.println(currentTime);
    }

    @Test
    public void test3() {
//        java.sql.Date
//        1.如何实例化
//        2.如何将java.util.Date对象转换为java.sql.Date对象
        java.sql.Date date = new java.sql.Date(902312312312L); // 传入一个时间戳 返回1998-08-05 这种格式的时间
        System.out.println(date);

        Date date1 = new Date();
        java.sql.Date date3 = new java.sql.Date(date1.getTime());
        System.out.println(date3);

    }

    @Test
    public void test4() throws ParseException {
//        SimpleDateFormat
//        两个操作
//        1.格式化：日期-》字符串
//        2.解析：格式化的逆过程，字符串-》日期

        SimpleDateFormat sdf = new SimpleDateFormat();

//        格式化：
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format); // 22-7-17 下午9:54

//        解析：字符串——》日期
        Date parse = sdf.parse(format);
        System.out.println(parse);


//        按照指定的方式格式化和解析：调用带参的构造器
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");// yyyy表示几几年，MM几月、dd几日，按照这种格式
        String format1 = sdf2.format(date);
        System.out.println(format1);
        Date parse1 = sdf2.parse(format1);
        System.out.println(parse1);

    }

    @Test
    public void SimpleDateFormatExer1() throws ParseException { // 练习1：字符串"2020-09-08"转换为java.sql.Date
        String birth = "2020-09-08";
        SimpleDateFormat test = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = test.parse(birth);
        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(date);
    }


//    4.calendar日历api (是一个抽象类)
    //1.实例化
    //方式一：创建其子类（GregorianCalendar）的对象
    //方式二：调用其静态方法getInstance()
    @Test
    public void testCalendar() {
        Calendar calendar = Calendar.getInstance();

        int month = calendar.get(Calendar.DAY_OF_MONTH); // 得到当月的日期
        System.out.println(month);

        calendar.set(Calendar.DAY_OF_MONTH,30); // 修改当月的日期为30
        month = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(month);

        calendar.add(Calendar.DAY_OF_MONTH,-10);
        month = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(month);




    }


}
