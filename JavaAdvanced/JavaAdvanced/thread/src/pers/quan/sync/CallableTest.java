package pers.quan.sync;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
public class CallableTest {

    public static void main(String[] args) {
//        3.创建实现Callable接口的实现对象
        CallTh c = new CallTh();

//        4.将Callable实现类的对象作为参数传递到FutureTask对象构造器当中
        FutureTask futureTask = new FutureTask(c);

//        5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            // 调用futureTask.get方法会返回构造器c中call方法的返回值
            Object  ret = futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}

//1.实现类实现Callable接口
class CallTh implements Callable {


//    实现call方法，将线程执行的代码写在此处
//    使用实现Callable的方法:1.可以有返回值；2.可以抛出异常；3.支持泛型
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i =0;i<10;i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            sum +=i;
        }
        return sum;
    }
}
