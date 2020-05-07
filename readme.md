> 2020年深圳java打工仔找工作记录帖,有一段时间的社畜了,所以直奔主题, 找的资料都是面试常用的,整理一下,希望能帮到大家 
> 主要三个部分 1.搜集面试题目  2.java资料 3 找工作日期记录,看从准备工作开始,多久可以找到工作(疫情原因,进度放缓不少)


| 📊 |⚔️ | 🖥 |
| :--------: | :---------: | :---------: |
| [小公司面试题](#小公司面试题) | [面试资料](#面试资料)|[面试记录](#面试记录) |

## 面试题



#### 2020 0430 开思时代
```
springboot用在项目中哪个部分?
` 1.有spring的地方 2.javaweb 3.微服务
部署的架构
`
redis在项目中哪里用到, 为什么要用redis
` 1.热点数据缓存 2.限时业务, expire 设置一个工具的时间.3.incrby 计数器 4.zset排行榜 5.分`布式锁setnx  6. 延时操作  . 7分页.模糊 zrangebylex 8.点赞 模糊  9 模糊list push list `pop 
redis简单的用还是知道更深层次的东西
redis除了做缓存还做了不同的场景
redis分布式锁怎么实现的?

redis 的hash槽是什么概念
` Redis 集群中内置了 16384 个哈希槽,fd，当需要在 Redis 集群中放置一个 key-`value时，redis 先对 key 使用 crc16 算法算出一个结果，然后把结果对 16384 求``余数，这样每个 key 都会对应一个编号在 0-16383 之间的哈希槽，redis 会根据节点`数量大致均等的将哈希槽映射到不同的节点。

redis 缓存的淘汰策略
` redis内存超出物理内存限制的时候,内存和磁盘数据交换性能急剧下降,几种策 
`  novication  不会继续写服务,读数据继续进行
` volatile-lru # 尝试淘汰设置了过期时间的 key，最少使用的 key 优先被淘汰。没  ` 有设置过期时间的 key 不会被淘汰，这样可以保证需要持久化的数据不会突然丢失。
` volatile-ttl # 跟上面一样，除了淘汰的策略不是 LRU，而是 key 的剩余寿命 ttl ` 的值，ttl 越小越优先被淘汰。
` volatile-random # 跟上面一样，不过淘汰的 key 是过期 key 集合中随机的 key。
` # volatile策略只会针对带过期时间的 key 进行淘汰
`  allkeys-lru 区别于 volatile-lru，这个策略要淘汰的 key 对象是全体的 key `  ` 集合，而不只是过期的 key 集合。这意味着没有设置过期时间的 key 也会被淘汰。
` allkeys-random 跟上面一样，不过淘汰的策略是随机的 key。
` # allkeys策略会对所有的 key 进行淘汰
集群有没有了解过,redis怎么搭建集群
`三种集群方式  主从复制 
redis cluster这种的集群了解么
集群间的复制
rabbitMQ 是用来做什么?发邮件
为什么要用rabbitMQ ? 除了减轻数据库压力,当初选型为什么要用消息中间件
架构是se设计的?没有讨论过为什么这么设计? 
rabbitMQ是怎么使用的? 
rabbitMQ的使用场景
rabbitMQ消息丢失的场景, 一直是可靠的么? 如何保证消息必答必送的
activeMQ和rabbitMQ的区别,kafka, 怎么选型
rabbitMQ支持延迟消息,如何实现延迟消息,activeMQ呢
MQ中的实现队列怎么实现的

为什么要使用springboot
springboot如何做到的? 引入一个mybatis的starter ,redis的starter 
为什么引入一个starter加一个配置就可以用了,这是怎么实现的
springboot启动的时候怎么知道找到redis启动入口
有没有自定义过starter,打包的时候引入一个,就可以自动打包
怎么拿springboot yml 配置的数值 @properties @value 
能将整个配置映射么用的哪个注解
springboot 的UT ?没有用过怎么保证代码质量
单元测试?怎么写? 
tdd这种模式了解过么?

springcloud 微服务接触过么,哪些组件 
微服务提供了哪些组件
eureka了解么? 做什么用? 怎么注册的?底层怎么实现的?保护机制怎么做的
网关这块?zoo 使用过么 ,zuul 的核心是什么,怎么转发的 zuulservlet

分布式协议, 分布式理论,锁啊 
cap是什么东西, 为什么只能保证其中两个?
eureka使用了cap哪两个原则?
分布式的一直性协议?zab
zookeeper是做什么的?zookeepr底层怎么存, 和dubbo一起用的时候存了什么信息?
zk存了服务信息,服务挂掉了怎么处理?

bean的生命周期
springmvc怎么处理请求 
spring 的事件机制? event  

线程池的底层原理?
线程提交任务,线程池怎么执行?
线程池的拒绝策略? 线程池里面的队列? 是什么队列 
threadPoolExecutor 和submit如何用的

并发锁用过哪些?
synchronize 怎么使用? 锁都是用用到对象上
锁 同步方法和同步代码块区别?
synchronize的底层工作机制? 
lock用过哪些锁?
jvm如果内存泄漏, 怎么定位

es倒排索引 ,es的底层是什么, 
es性能调优
建议: 
之前做的工具,进入互联网行业多看分布式
```
#### 2020 0430 巨鼎医疗
equals()和hashcode()的区别
hashcode是什么? 
` 1、hashCode的存在主要是用于查找的快捷性，如Hashtable，HashMap等，hashCode是用来在散列存储结构中确定对象的存储地址的；
`2、如果两个对象相同，就是适用于equals(java.lang.Object) 方法，那么这两个对象的hashCode一定要相同；
`3、如果对象的equals方法被重写，那么对象的hashCode也尽量重写，并且产生hashCode使用的对象，一定要和equals方法中使用的一致，否则就会违反上面提到的第2点；
`4、两个对象的hashCode相同，并不一定表示两个对象就相同，也就是不一定适用于equals(java.lang.Object) 方法，只能够说明这两个对象在散列存储结构中，如Hashtable，他们“存放在同一个篮子里”。

`再归纳一下就是hashCode是用于查找使用的，而equals是用于比较两个对象的是否相等的。以下这段话是从别人帖子回复拷贝过来的：

hashcode 值一样 两个数值是否一样
thread类和runnable 接口的区别
用的是别人封装好的线程池?
线程的异步处理? 采用什么方式?@Async
runnable接口和thread类的区别?推荐使用哪个? 
线程安全?
spring 源码了解过哪些?
springmvc底层

100万条数据只留下一条
`先建立索引
 `Insertinto Table2 select * from Table1 group by 重复字段名称 limit `100000
一个订单表很多数据怎么分表存储?
存储过程和sql直接访问的区别 ?
 索引哪些类型? 
`全文 b-t
外键为什么尽量不用?什么场景用?


#### 2020 0428点米网络科技& **易博天下面试通知** 
```
Arrays.aslist  new arraylist的区别
#数组转换为list,元素不可变
Hashmap hashtable correnthashmap的key是否为null
#hashmap可以 hashtable,conrrenthashmap不行/原因是高并发的数据结构,不能为null 
hashset怎么保证元素唯一
#hashcode()方法 euqals()方法
redis的使用场景，各种数据类型用了哪些redis怎么序列化使用string的时候
#实现Serializable接口
redis各种数据类型对应场景
#
 string 做缓存web和数据库的中间层, 计数
 list 双端链表结构,排行榜,消息队列,lpop和rPush可以使用,实现队列的功
  set 去重元素,抽奖
  zset 需要排序的,最热门的帖子
  hash 对象的,key -value
Spring怎么操作事物
# Tranction接口 @tranction注解
Springboot怎么配置
#yml
Springboot添加组件
#
Springboot统一处理异常
#@ControllerAdvice  控制器发生异常将会拦截
Springboot怎么读取yml @value@properties
Springboot application yml 读取文件配置优先级
# bootstrap.yml> application.yml 
# 如果在不同的目录中存在多个配置文件，它的读取顺序是：
  1、config/application.properties（项目根目录中config目录下）
  2、config/application.yml
  3、application.properties（项目根目录下）
  4、application.yml
  5、resources/config/application.properties（项目resources目录中config目录下）
  6、resources/config/application.yml
  7、resources/application.properties（项目的resources目录下）
  8、resources/application.yml
说一下对springboot的理解

springsecurity 和spring的关系
springsecurity如何配置

用过es,说一下 es的版本2.5太老了
es mappiping 失效
#面到一半的时候觉得问题太细节太偏了,心虚认怂
建议:多刷面试题
建立在修改一下丰富项目经验

```

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
4.对外提供api时,如何保证接口调用安全? 
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

* spring讲一下

  ```
  ioc:容器创建对象 工厂模式
  di :
  aop: 事务抽象成一个个的对象,面向切面的过程中,接口实现jdk动态代理,类采用cglib,对象采用切面, 实现的功能有, 权限控制, 事务管理,记录日志等
  ```
*  spring中的设计模式
*  常用注解
*  springbean的生命周期
*  spring的结构
```
 core(core, beans,context, el
 aop
 jdbc,orm
 web
```

* spring 事务管理? 
* beanfacoty的实现类?
```
xmlBeanFactory 
applicationContext
xmlBeanFactory 

```
* spring bean的依赖注入?di和aop的区别
*  哪些不同的ioc方式? 
```
set注入
构造器注入
静态工厂的注入
实例工厂的注入
```
* bean的作用域 
```
<bean scope中配置 作用域
singleton 单例:ioc容器中只有一个实例
prototype 一个bean定义在多个实例
request 
session 
```

* bean线程安全么?
* bean的生命周期
* spring aop的实现原理
```
jdk动态代理 代理接口
cglib代理 代理类
```


#### spring mvc 

* springmvc的工作原理? 

* 常见注解 

  ```
  @requestmapping
  @requestbody
  @responsebody
  ```

#### mybatis

* #和$的区别

* 一级缓存二级缓存

* insert返回主键id

  

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
*  mysql 引擎 

*  mysql事务 
```
事务的四个特性, 原子性/一致性/隔离性
事务的隔离级别
读已提交
读未提交
可重复读
串行读
```
* 存储过程
```
业务逻辑可以封装在存储过程中,不仅容易维护,执行效率也高
```
*  存储过程和函数的区别?
*  触发器
*    提高mysql的安全性

*  水平拆分和垂直拆分

#### redis

* 特点

* 数据类型 

*  redis性能问题,如何解决


*  [url](www.baidu.com)




### 设计模式

1.单例
2.工厂设计模式
3.观察者模式 



## 2020三月份java面试记录
## 面试记录
我是一名外包公司的员工，目前在职，原本计划年后跳槽，就疫情的原因拖到现在才开始准备面试，在这里记录面试进度和更新一些准备的面试题目。

#### 2020年 0310  

 准备了面试简历，投了几家公司，没有收到回复。

#### 2020年0313 
  网上收集了一些面试题目,一些公司说如果简历通过,下周可以安排面试.

#### 0317
  大公司有几个收了简历,然后就没什么进展了,小公司现在还不想投, 月底计划离职,疫情过去一些,专心找工作,
#### 0318 
  投一线公司,阿里,腾讯, 头条完全收不到回复~~, 下一步投小公司好了

#### 0321  
  收到阿里的邮件,说收到我的简历了,觉得很意外 . 找工作的进度真的好慢啊, 一点头绪都没有,大公司进不去, 疫情的原因中小公司自身难保了还怎么招人,就很疑惑.