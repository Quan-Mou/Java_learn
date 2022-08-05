package pers.quan.collectionTest;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

//        List一些方法（增、删、改、查、插、）
//        add(String target);
//        add(String target,int index);
//        remove(int index);
//        set(int index,Object el);
//        get(int index);
//        indexOf(Object ele);
//        lastIndexOf(Object ele);
//        subList(int fromIndex,int toIndex);
        List list = new ArrayList(10);
        list.add("age");
        list.add(1,"权某");
        list.add(2,"quan");
        list.add(3,"mou");
        list.add(4,"权某");
        list.add("权某");
        System.out.println(list);
        Object removeEle = list.remove(3);
        System.out.println(removeEle);
        Object wl = list.set(1, "未来");
        System.out.println(wl);
        Object o = list.get(2);
        int first = list.indexOf("权某");
        System.out.println(first);
        int last = list.lastIndexOf("权某");
        System.out.println(last);
        List list1 = list.subList(1, 4);
        System.out.println(list1);
    }
}


