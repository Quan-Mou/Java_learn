package pers.quan.sync;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 */
public class SingleModuleTest {
    private SingleModuleTest() {}
    static SingleModuleTest instance;

    public static SingleModuleTest getInstance() {
//        方式一：效率较差
//        synchronized (SingleModuleTest.class) {
//            if (instance == null) {
//                instance = new SingleModuleTest();
//            }
//        }
//        return instance;

        //        方式一：效率较高
            if (instance == null) {
                synchronized (SingleModuleTest.class) {
                    if (instance == null) {
                        instance = new SingleModuleTest();
                    }
                }
            }
            return instance;
    }
}
