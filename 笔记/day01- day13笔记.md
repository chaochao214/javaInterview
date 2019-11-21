## day01

zoye-toStringTest

```
public class ToStringTest {
    static int i = 1;
    public static void main(String args[]) {
        System.out.println("love " + new ToStringTest());//love java
        ToStringTest a = new ToStringTest();
        i++;
        System.out.println("me " + i);//me 2
    }
    @Override
    public String toString() {
        System.out.print("I ");//I
        return "java ";
    }
    /* 返回结果
    I love java 
    me 2
    */
    
```

### Zoye3





####  String的equls方法 和 ==的比较



Object 比较的是地址值

~~~
(1)
String s1 = new String("abc");
String s2 = "abc";
System.out.println(s1 == s2);  //new()了一个，占用了新的地址，false
System.out.println(s1.equals(s2));  //true
(2)
		String s1 = "abc";
      	 String s2 = "abc";
		System.out.println(s1 == s2);     	//true
		System.out.println(s1.equals(s2)); 	//true
(3)
		String s1 = "a" + "b" + "c";
      	 String s2 = "abc";
		System.out.println(s1 == s2);    	 //true
		//?? 组长的解释，因为都是放在堆里，基本数据类型的相加
		System.out.println(s1.equals(s2));	 //true
(4)
		String s1 = "ab";
     	String s2 = "abc";
     	String s3 = s1 + "c";
		 System.out.println(s3 == s2);     	//false
		// 出现了引用数据类型
      	System.out.println(s3.equals(s2));   //true		
~~~

 #### Object的equals方法

```
Object o1 = new Object();

Obeject o2  =new Object();

O1 equals o2   // 判断的是地址值 false
Person p1
P2
P1.equals p2 // false

String.equals
Integer  i1 = 100;
Integer  i2   = new Integer(100);
Integer  i7 = 200;
Integer i8 200
I7==i8  false      //底层自动装箱
I9 100 		//  Integer有一个数组缓冲区。127 (true)...128(false) 
I10 100     
==   true
//缓冲区（数组。） 判断数字如果在缓冲区里，自己拿，如果不在缓冲区，new 一个

// 装箱时，如果在缓冲区里，自动获取，如果不在缓冲区，则new出来
```

### Zoye11

~~~
public class StringBuilderTest03 {
    public static void main(String[] args) throws IOException, Exception {
        SBTest();
    }

    public static void SBTest() {
        //定义由7、8、9组成的字符串
        String s = "789";
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //采用嵌套for循环，遍历字符串
        for (int i = 0; i < 3; i++) {
            //遍历字符串s，把字符依次添加到StringBuilder内，组成一个元素
            for (int j = 0; j < s.length(); j++) {
                sb.append(s.charAt(j));
            }
            //当StringBuilder内元素为一个和两个时，需要加空格来隔开元素
            if (i != 2) {
                sb.append(" ");
            }
            //把字符串s的第一个元素切割，添加到字符串末位，组成新的字符串
            s = s.substring(1).concat(s.substring(0, 1));
        }
        // 把StringBuilder内元素反转，组成新的数字
        s = sb.toString() + " " + sb.reverse().toString();
        System.out.println(s);
    }
}
~~~



## Day2

### zoye12

~~~
public static <E> void method(E[] e ){
        int min=0; int max= e.length-1; E temp;
        for (int i = 0; min<max; max--,min++) {
           temp =  e[max];
           e[max] =e[min];
           e[min] =temp;
        }
        //?？？？？泛型的使用方法不是很熟练
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
        }
~~~

Collection<Integer> coll =    new   

ArrayLIst<>();

明确方法一定Collection 中，向上转型，不能使用子类对象

 Demo03_toArray.java                                                                                  

sdExce}����

## Day03

> > 位运算 > 计算最快的运算方式：>>>除以8 。

​    hashset 存储数据都是无序的， 无序：存、取顺序不是一致的

~~~
HashSet<String> set =  new HashSet<>();
        set.add(new String(" cba"));
        set.add("aaa");
        set.add("ccc");
        set.add("def");
        //元素都是无序的，即存取顺序不一致
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println( set);
~~~

可变参数；

~~~
public static void main(String[] args) {
         int[] arr = {1,4,22,10};

            getSum(1,2,3,5,6);
    }
    //可变参数。
        public static int getSum(int...arr){
        int sum =0;
         for(int a:arr){
             sum+=a; }
         return  sum;}
~~~

comparator 比较器 ？

~~~
@FunctionalInterface
public interface Comparator<T>{
  int compare(T o1, T o2);
  ...
  default..
}

~~~

~~~
java.util.collection接口  : 是java单列集合的一个重要分支
-list 
   -ArrayList
   -LinkedList
java.util.map接口：
-map
	-HashMap
	-LinkedHashMap
~~~



~~~
Collections.sort ：

public static <T> void sort(List<T> list)     
//???  泛型如何理解？ 

~~~

## day4

~~~
jdk9 :数组添加元素的优化。
List a= List.of("abc","def");
~~~

## day6

thread和runnable的区别

~~~
/**
 *  如果一个类继承thread,则不适合资源共享，
 *  如果实现了Runnable接口的话，很容易实现资源共享。
 *
 *  多线程：
  1. 适合多个相同的程序代码的线程去共享同一个资源。
 * 2. 可以避免java中的单继承的局限性。
 * 3. 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
 * 4. 线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类
 *
 */
~~~

卖票

~~~
public class sellTickets implements Runnable {
    private int tickets = 100;
    String locks = "aa";

    @Override
    public void run() {
        //每个窗口的卖票操作
        while (true) {
            synchronized (locks) {

                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "在卖" + tickets--);

                }
            }
        }

    }
}

~~~

~~~
public class test {
    public static void main(String[] args) {
         sellTickets st  = new sellTickets();
         Thread t1= new Thread(st,"name1");
         Thread t2= new Thread(st,"name2");
         Thread t3= new Thread(st,"name3");
         t1.start();
         t2.start();
         t3.start();
    }
}
~~~

## day6

~~~
java.lang. Thread.State
: Enum Thread.State 有六种
- NEW
- RUNNABLE
- BLOCKED
...
 Enum???

~~~

## day8

 ~~~
递归输出/删除  一个文件夹下的所有文件
 public static void lisF(File file2) {
        File[] files = file2.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file);
            }
            if (file.isDirectory()) {
                lisF(file);
            }
        }
        System.out.println(file2);
    }
 ~~~



## day12

//?zoye6





## day13考试

非静态方法的同步锁对象是？ this.

