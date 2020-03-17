> 2020年深圳java打工仔找工作记录帖,有一段时间的社畜了,所以直奔主题, 找的资料都是面试常用的,整理一下,希望能帮到大家 
> 主要三个部分 1.搜集面试题目  2.java资料 3 找工作日期记录,看从准备工作开始,多久可以找到工作(疫情原因,进度放缓不少)


| 📊 |⚔️ | 🖥 |
| :--------: | :---------: | :---------: | 
| [小公司面试题](#小公司面试题) | [面试资料](#面试资料)|[2020三月份java面试记录](#面试记录) | 

## 小公司面试题
#### 2019年0806花儿某司面试题

```
1、介绍下自己
2、在大学里学了什么课程，有什么收获
3、介绍下在公司里做的项目，里面的技术要点
4、TCP的三次握手、四次挥手的作用
 连接的时候三次挥手，客户端发送连接 ，服务器。。   关闭的时候
5、MySQL建索引的数据结构
b-tree 
6、Map的底层实现，是什么数据结构，怎么存储，如果hash值有冲突怎么办，是否是线程安全的，要怎么保证线程安全；如果是通过扩展的方式来实现线程安全的map要在什么地方修改；put方法中做了什么事
7、ConcurrentMap是否用过
8、jvm中内存分为那些类型，有什么作用，静态数据是在堆还是栈中，方法是在堆还是栈中
9.实现redis分布式锁
10、下单的流程，如果下单时库存不足而同时100个用户下单怎么办
11、知道redis的哪些数据类型，有什么应用场景
12、spring通过哪几种方式声明bean
13、@AutoWired和@Resource的区别，是by type还是by name注入的
14、如果下单过程中出现了错误怎么保证系统的稳定性和数据的一致


```

#### 深圳某公司

```
1.一个详细的问题解决过程，不能是换个技术解决的那种；redis的线程模型？；
2.数据库的优化；
3.手写单例模式；
4.spring初始化时做了什么；
5.spring事物原理，讲到代码层；
6.spring的aop；
7.mysql索引创建方法；
8.一个string字符串转int自己的实现方法，讲到代码级别；
9.把一个对象交给spring的bean托管的配置方式有哪几种；
10.mysql的读写分离；
11.mybatis批量处理；
12.dubbo的具体配置讲到代码级别
13.数据库索引的创建，要注意些啥？
14.dubbo中，消费方和提供方已经成功注册到注册中心中，此时zookeeper挂掉后，消费方还可调用服务吗？  --被问了3次：答案是可以的，具体百度解释。
15.接口和抽象类的异同
16.get/post提交的区别
17.IO和NIO，NIO是什么？基于什么设计模式，NIO呢？
18.tomcat的运行流程?或者说为什么部署后，在浏览器中就可以访问你的项目？
19.tomcat优化相关？怎么配置？
20.设计模式相关，常用设计模式有哪些？用过那些？
21.项目上，一般会问分布式相关的那个，比如商城，金融类。
22.框架相关：spring aop,IOC,DI,hibernate和mybatis优缺点，struts和springmvc优缺点。hibernate,mybatis,struts,springmvc执行流程。
23.restful接口？怎么写？那些规范？怎么调用（使用java代码调用,httpclient等）
24.前端页面如何实现？html,jsp,freemaker等
25.freemaker常用标签，分布式事务配置。
26.jsp内置对象，那几个？？这个问题我答错两次，答少了pageContext.   至少是:pageContext,request,session,application
27.支付相关，第三方支付（支付宝，微信，红包等），聚合支付，第三方登录（QQ,支付宝，微信等）
28.线程，同步的方式，有哪些锁，这些锁的异同。
```

#### 深圳某医疗科技股份

```
笔试:
string stringbuilder stringbuffer 区别
解析xml使用哪些方式,有什么区别?
你知道的设计模式有哪些?说说工厂模式
设计一个员工管理订单的权限系统  数据库表
多线程怎么实现
类中有哪些多线程方法

面试官问的问题:
springmvc与struts区别,
你在做项目过程中遇到过哪些BUG?你都是怎么解决的?
hibernate与mybatis区别
hashMap在项目中的使用
```

#### 丰唐物联

````
笔试题:
找到第二大的数,尽可能多的解决方案
自己实现arrayList,并实现基本方法和扩容的方法
面试题:
OOP理解,什么是多态
说一下hibernate缓存\懒加载
说一下redis
java怎么取高四位(利用& >>)
````

#### 维恩贝特

 ````
笔试题:有DB2的英文题目,其他题目都简单
讲讲spring都有哪些注解
@autowired与@Resource区别,你还知道有哪些注解
你在做项目过程中遇到什么问题
我提到分页,他就问了我hibernate与mybatis分别是怎么实现分页的
mybatis与hibernate区别
mybatis mapper中 id 可以重复吗?
讲讲springmvc事务
 ````

#### 法本信息

```
笔试题:
插入排序算法
SQL 意思是将一张表a1和另一张表a2加起来复制给表的a3字段
画一个分布式框架图
面试:
主要找jquery js写的好的
只记得问的挺简单的
```

#### 深圳某公司

````
map在项目中如何使用,map如何高效遍历的?
for (Map.Entry<Integer, String> entry : map.entrySet()) {
          System.out.println("key= " + entry.getKey() + " and value= "

entry.getValue());

多线程,线程池?你用过哪些线程池?阻塞和等待区别
怎末优化查询效率很慢的SQL?
数据库使用索引的利弊,怎末创建索引?
linux查看程序日志  ps –ef|grep tracker 查看进程信息
spring容器初始化做了哪些操作
springmvc原理
spring管理bean的方式
讲讲aop
讲讲反射,你的项目中遇到哪些反射?用到哪些解耦?(因为我简历上写了反射和解耦两个词)
解析xml有哪些方式,都有哪些不同点(笔试面试都问到了)
jvm的了解,不同类加载器加载同一个类是否一样
hashmap底层
redis和memecache的不同
````

#### 百年健康

````
1.@autowire和@resource的区别
2.在spring中哪些方式可以实例化对象
3.面向切面编程怎么理解
4.aop的通知方式有哪些.
5.代理中cglib和jdk代理的区别
6.多线程的方式多不多,如何理解多线程
7.线程的创建方式有哪几种
8.启动一个线程,哪种方式可以获取返回值. 
9.线程池配置规则,如何跟cpu进行匹配 
10.线程池的饱和策略
11.concurrentHashmap和hashmap 说一辆对这两个的理解
12.了解aqs么
13.有没有用过cas
````

####  文思海辉

 ```

	1.有没有做过互联网相关的项目

	2.你们的项目如何做到redis和数据库同步的

	3.如果redis中数据到了实效时间 访问全去访问数据库 会造成什么后果,你们是怎么解决的

	4.你们项目的并发量是多少

	5.有没有阅读源码的习惯  都看过哪些源码

	6.阅读源码有什么好处

	7.你有什么优点和不足

	8.spring你用过什么技术

	9.hashmap 是如何保证key的唯一   底层是怎么实现的
	
	10.集合有哪几种  他们的底层结构是什么

	11.springmvc的核心技术

	12.ioc默认是单例还是多例  怎么设置多例  如果是单例的话  底层是怎么保证对象的唯一性
 ```

#### 压寨网络

```
[代码题目](https://github.com/chaochao214/javaInterview/blob/master/InterviewCode/src/main/java/%E5%85%AC%E5%8F%B8%E9%9D%A2%E8%AF%95%E9%A2%98%E7%9B%AE/%E5%8E%8B%E5%AF%A8%E7%BD%91%E7%BB%9C20190808.java)

2.mysql中创建用户表,表中包含字段[用户id][用户名][密码]和其他必要字段,预计用户量亿级,给出简要表结构
3.有一充值活动,用户充值后进入每日排行榜,排行榜哪找充值金额由高到低排列,每日0点截取昨日top1,如何处理? 
4.对外提供apiu时,如何保证接口调用安全? 
5以下代码块有何种风险,如何改进
for(Integer userid: list){
 User user = getUser(userid); 
 System.out.println(user.getName());
}
```



## 面试资料



###  两种数据类型

* 基本数据类型
> 存放位置 
> 值传递

*  引用数据类型
```
 class()  function()   A a = new A();
 
```
###  如何看是值传递还是引用传递
  ?java都是值传递
* java的引用原理类型分析
``` 强引用 软引用 弱引用 虚引用 ```
###  java集合
* ArrayList /Vector
```
 底层是动态数组
 源码
 扩容
 序列化
 解释查询快,增删慢
 Vertor 线程安全
```
*  LinkedList
```
 底层:双向链表,查找慢增删快.
 
```
*  hashmap
```
无序
扩容:HashMap 底层是基于数组和链表实现的。其中有两个重要的参数容量,负载因子
容量的默认大小是 16，负载因子是 0.75，当 HashMap 的 size > 16*0.75 时就会发生扩容(容量和负载因子都可以自由调整)。
put /get
遍历方式
线程不安全,并发情况下形成死循环.
 
```
*  ConcurrentHashMap
```
  !!常问
```
*  HashSet
```
 源码: 构造函数很简单，利用了 HashMap 初始化了 map 。
 add()方法:是将存放的对象当做了 HashMap 的健，value 都是相同的 PRESENT 。由于 HashMap 的 key 是不能重复的，所以每当有重复的值写入到 HashSet 时，value 会被覆盖，但 key 不会受到影响，这样就保证了 HashSet 中只能存放不重复的元素。

```
* LinkedHashMap
```
 有序
 底层是双向链表
 实现? 
```
### java多线程
* 上下文切换
* 解决上下文切换
```
 无锁编程
 cas算法
 合理创建线程
```
* 死锁 
* synchronized 关键字原理
* volidate关键字实例, 
```
双重检查单例模式,防止指令重排列
```
### java8新特性

* lamda 简化接口写法, 接口实现/匿名内部类
* 函数式接口 

###  jvm 

* java运行内存划分
```
堆 
栈 
方法区
```
*  类加载机制
双亲委派模型
*  oom
```
堆栈溢出, 可以通过设置 -Xms(最小堆);-Xmx(最大堆) 设置一致可以避免自动扩展堆内存


```
*  oom的原因
```
集合超出存储范围
不断创建对象,导致堆栈溢出
内存中数据量过于庞大,比如一次取数据库较多信息
```
> heap space 堆溢出 
> List<String> list = new ArrayList(10) ;
> while(true){list.add(1)};

* 垃圾回收
* 一次hashset引发的并发问题
```
!!!
```
* 服务器cpu100%占用排查优化
```

```

### javaweb

* session 共享怎么实现

  ```
  服务器
  redis,memorycach
  ```

  

* xml 解析方式

  ```
  dom解析
  sax解析
  ```

  

### 框架部分 

#### spring 
* bean的生命周期
* spring aop的实现原理
```
jdk动态代理 代理接口
cglib代理 代理类
```
###DB相关

* mysql 索引原理
```
b-tree索引
```
#### sql优化
*  sql语句优化
```
确保命中索引
1. 负向查询不能命中索引
select  name from user where id not in(1,3,4) 
应该改
select name from user where id in(2,5,6)
2.前导模糊查询不能使用索引
select name from user where name like '%zhangan' 
改为
select name from user where name like 'zhangan%' 
3.数据区分不明显的不要建立索引,比如user 中的性别
4.字段的默认值不要为null
5. 复合索引的命中, username pwd的复合索引必须同时查询这两个字段才可命中
```
sql语句优化
``` 
1 .确定只有一条记录返回
  limit 1
2. 不要让数据库做强制类型转换,会导致全表扫描
 select name from user where telno='167'
 select name from user where telno=167
 
```
#### 水平拆分和垂直拆分

### 设计模式
1.单例
2.工厂设计模式
3.观察者模式 



##2020三月份java面试记录
##面试记录
我是一名外包公司的员工，目前在职，原本计划年后跳槽，就疫情的原因拖到现在才开始准备面试，在这里记录面试进度和更新一些准备的面试题目。

#### 2020年 0310  

 准备了面试简历，投了几家公司，没有收到回复。

#### 2020年0313 
  网上收集了一些面试题目,一些公司说如果简历通过,下周可以安排面试.

#### 0317
  大公司有几个收了简历,然后就没什么进展了,小公司现在还不想投, 月底计划离职,疫情过去一些,专心找工作,
