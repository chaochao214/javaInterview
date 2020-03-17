package 单例模式;

public class CEO {
    private static final CEO mCEO = new CEO();
    private CEO() {}

    public static CEO getmCEO() {
        return mCEO;
    }
}
