package pers.quan.genericity;

import org.junit.Test;

import java.util.ArrayList;

public class GenericityTest {

    @Test
    public void test1() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(98);
//        使用泛型来限制类型
//        arrayList.add("14")
        arrayList.add(60);

        for(Integer item : arrayList) {
            int score = item;
            System.out.println(score);
        }
    }


}
