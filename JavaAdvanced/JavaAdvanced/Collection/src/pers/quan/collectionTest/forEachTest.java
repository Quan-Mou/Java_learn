package pers.quan.collectionTest;

import java.util.ArrayList;
import java.util.Collection;

public class forEachTest {

    public static void main(String[] args) {
         Collection List = new ArrayList();
         Collection arr = new ArrayList();
         arr.add(new Util("权",18));
         arr.add("nihao");
         List.add("123");
         List.add(435);
         List.addAll(arr);

        System.out.println(List);

        for(Object key : List) {
            System.out.println(key);
        }
    }

}

class Util {
    String name;
    int age;

    public Util(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Util{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
