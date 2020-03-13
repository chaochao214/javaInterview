package 设计模式.单例模式;

/**
 * @Author: twc
 * @Date 2020/3/13 22:47
 **/
public class SingleTonDemo {

}

//单例模式 饿汉单例模式
class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    private HungrySingleton getInstance() {
        return instance;
    }
}

//懒汉单例模式
class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    };

    private LazySingleton getInstance(){
        return  new LazySingleton();
    }

}

//双重校验锁
//并发情景
/*
 * 1.  线程A访问getInstance()方法，因为单例还没有实例化，所以进入了锁定块
 * 2.  线程B访问getInstance()方法，因为单例还没有被实例化，得以访问接下来的代码块
 *     而接下来代码块已经被线程1锁定
 * 3.  线程A进入下一步判断，因为单例还没有被实例化，所以进行单例实例化，成功实例化后
 *     退出代码块，解除锁定
 * 4.  线程B进入接下来的代码块，锁定线程，进入下一判断，因为已经实例化，退出代码块，
 *     解除锁定
 * 5.  线程A初始化并获取到了单例实例并返回，线程B获取了线程A中初始化的实例
 *
 *  理论上是线程安全的，并且实现了懒加载*/
class SingleTonWithSyn{
    private volatile static SingleTonWithSyn instance;
    private SingleTonWithSyn(){
        System.out.println("Singleton has loaded");
    }
    public static SingleTonWithSyn getInstance(){
        if (instance == null){
            synchronized (SingleTonWithSyn.class){
                if (instance == null){
                    instance = new SingleTonWithSyn();
                }
            }
        }
        return instance;
    }

}
