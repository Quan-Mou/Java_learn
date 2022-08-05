package pers.quan.Map;

import org.junit.Test;

import java.util.HashMap;

public class MapTest {

//    map常用方法 增、删、改、查、
//    Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
//    void putAll(Map m):将m中的所有key-value对存放到当前map中
//    Object remove(Object key)：移除指定key的key-value对，并返回value
//    void clear()：清空当前map中的所有数据
    @Test
    public void test1() {
        HashMap hashMap = new HashMap();
        hashMap.put("Quan",123);
        hashMap.put("Mou",123);
        hashMap.put("Dao",123);
        System.out.println(hashMap);
        Object mou = hashMap.remove("Mou");
        System.out.println(hashMap);
        Object dao = hashMap.get("Dao");
        System.out.println(dao);
    }

//    元素查询操作


}
