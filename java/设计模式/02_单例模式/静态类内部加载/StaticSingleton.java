package 单例模式.静态类内部加载;
//使用内部类的好处是，静态内部类不会在单例加载时就加载，而是在调用getInstance()
//方法时才加载，达到了类似懒汉模式的效果，而这种方法又是线程安全的

import org.omg.SendingContext.RunTime;

public class StaticSingleton {
    private static class Singleton{
        private static Singleton instance = new Singleton();
    }
    private StaticSingleton(){
        System.out.println("Singleton has loaded");
    }
    public static Singleton getInstance(){
        return Singleton.instance;
    }

    public static void main(String[] args) {
        Runtime.getRuntime();

    }
}
