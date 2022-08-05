package pers.quan.collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class CollectionFn {
    public static void main(String[] args) {
        Collection arr = new ArrayList();
        arr.add(123);
        arr.add("abc");
        arr.add(new Person("张三"));
        arr.add(new String("扑抱子"));
        System.out.println(arr.size());

        Collection arr2 = new ArrayList();
        arr2.add(1232);
        arr2.add(123);
        arr2.add(new Person("Quan"));

        arr.addAll(arr2);// 添加一个集合到arr
        System.out.println(arr.size());

        arr2.clear();// 清空一个集合的所有元素
        arr2.add(123);
        arr2.add("abc");
        arr2.add(new Person("张三"));
        arr2.add(new String("扑抱子"));

        System.out.println(arr.contains(123));
        System.out.println(arr.containsAll(arr2));

        System.out.println("arr："  + arr);
        System.out.println("arr2：" + arr2);

        System.out.println(arr.removeAll(arr2));
        System.out.println("arr："  + arr);

        System.out.println("-------------");
        Object[] ObjArr = arr.toArray();
        for(int i = 0;i<ObjArr.length;i++) {
            System.out.println(ObjArr[i]);
        }

        System.out.println("迭代器:");
        Iterator arrIterator = arr2.iterator();
//        方式1.
//        for(int i = 0;i<arr.size();i++) {
//            System.out.println(arrIterator.next());
//        }
//        方式2.
//        hasNext() //判斷下一個元素是否存在，返回布爾值
        while (arrIterator.hasNext()) {
            System.out.println(arrIterator.next());
        }

        System.out.println("----------");


        Collection demo = new ArrayList();
        demo.add(123);
        demo.add("123");
        demo.add(true);
        Iterator demoIterator = demo.iterator();
        while (demoIterator.hasNext()) {
            System.out.println(demoIterator.next());
            demoIterator.remove();
        }



    }


}

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
