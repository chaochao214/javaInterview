package 单例模式.枚举方法;

import org.junit.Test;
//Effective Java作者Josh Bloch提倡的方式
//解决了
/*
* (1) 自由序列化
* (2) 保证只有一个实例
* (3) 线程安全*/
enum  EnumSingleton {
    INSTNCE;
    public void otherMethods(){
        System.out.println("Something");
    }

    @Test
    public void test01(){
        EnumSingleton.INSTNCE.otherMethods();
    }
}

