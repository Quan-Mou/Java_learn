package pers.quan.enumTest;

//1.枚举类实现接口
//2.枚举类对象实现接口
public class EnumInterfaceTest {

    public static void main(String[] args) {
        Status RET  = Status.RET;
        RET.show();


    }

}

interface Info{
    void show();
}

enum Status implements Info{
    RET("RET"){
        @Override
        public void show() {
            System.out.println("当前对象自己重写的抽象方法");
        }
    };
    private String status;

    private Status(String status) {
        this.status = status;
    }


    @Override
    public void show() {
        System.out.println("季节咯");
    }
}

