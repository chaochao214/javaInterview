package 单例模式.懒汉;
// 多线程不安全
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){
    }
    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
