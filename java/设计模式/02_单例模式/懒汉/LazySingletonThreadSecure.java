package 单例模式.懒汉;
//支持多线程，也具备懒加载（需要的时候再创建），但是效率很低，99%的情况下不需要同步
public class LazySingletonThreadSecure {
    private static LazySingletonThreadSecure instance;
    private LazySingletonThreadSecure(){
    }
    public static synchronized LazySingletonThreadSecure getInstance(){
        if (instance == null){
            instance = new LazySingletonThreadSecure();
        }
        return instance;
    }
}
