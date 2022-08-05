package pers.quan.collectionTest;

import org.junit.Test;

import java.util.*;

public class TreeSetExer {
    public static void main(String[] args) {

        Employee e1 = new Employee("Jert",19,new MyDate(1930,3,23));
        Employee e2 = new Employee("Curry",35,new MyDate(1945,3,23));
        Employee e3 = new Employee("Hadig",54,new MyDate(1922,3,23));
        Employee e4 = new Employee("Handler",12,new MyDate(1989,3,23));
        Employee e5 = new Employee("Json",25,new MyDate(1999,3,23));

        TreeSet treeSet = new TreeSet();
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);

        // 按照姓名进行排序
        System.out.println(treeSet);


//        自定义排序，按生日日期先后排序
        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                return 0;
                if (o1 instanceof  Employee && o2 instanceof  Employee) {
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    if (e1.getBirthday().getYear() > e2.getBirthday().getYear()) {
                        return 1;
                    } else if (e1.getBirthday().getYear() < e2.getBirthday().getYear()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                throw new RuntimeException("类型不一致");
            }
        });

        treeSet1.add(e1);
        treeSet1.add(e2);
        treeSet1.add(e3);
        treeSet1.add(e4);
        treeSet1.add(e5);

        System.out.println(treeSet1);



    }
    @Test
    public void Exer2() {
        //    练习2：在List内去除重复数字值，要求尽量简单

        ArrayList exerList = new ArrayList();
        exerList.add(123);
        exerList.add(456);
        exerList.add(789);
        exerList.add(123);
        exerList.add(789);

        Collection newExerList = duplication(exerList);

        System.out.println(newExerList);
    }

    public Collection duplication(List list) {
        HashSet hashSet = new HashSet();

//        方式一：
//        for(Object item :list) {
//            hashSet.add(item);
//        }

//        方式儿：
        hashSet.addAll(list);
        return hashSet;

    }

}

