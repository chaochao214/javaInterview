package 公司面试题目;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author: twc
 * @Date 2020/3/13 20:13
 **/
public class 压寨网络20190808 {
    @Test
    public void test01(){
        Long a =new Long(3);
        Long b =3L;
        int c =3;
        System.out.println(a == b); //false
        System.out.println(a == c); //true
    }
    @Test
    public void test02(){
        String a=null;
        String b="null";
        System.out.println(b.equals(a));// false
        System.out.println(a.equals(b));// 空指针异常
    }
    @Test
    public void test03(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int k=0;k<100;k++){
            list.add(k);
        }
        System.out.println(list.stream().filter(i->(i>90)).findAny().get().toString()); //91
    }
}
