package pers.quan.Compare;

import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {


    @Test
    public void test1() {
        String str[] = new String[]{"JJ", "DD", "BB", "AA"};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }

//    自定义类实现Comparable自然排序
    @Test
    public void test2() {
        Goods goods[] =  new Goods[5];
        goods[0] = new Goods("Xiaomi",23);
        goods[1] = new Goods("HUAWEI",40);
        goods[2] = new Goods("Mac",43);
        goods[3] = new Goods("ME",32);
        goods[4] = new Goods("AFF",1);

        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }

}

class Goods implements Comparable       {
    private String name;
    private double price;


    public Goods(String name,double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof  Goods) {
            Goods goods = (Goods)o;
//            if (this.price > goods.price) {
//                return 1;
//            } else if(this.price < goods.price) {
//                return -1;
//            } else {
//                return 0;
//            }
//            方式二：
            return Double.compare(this.price, goods.price);
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }

                  public String toString() {
                   return "Goods{" +"name='" + name + '\'' +", price=" + price +    '}';
                  }

}
