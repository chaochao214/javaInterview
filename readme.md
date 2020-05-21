> 2020年深圳java打工仔找工作记录帖,有一段时间的社畜了,所以直奔主题, 找的资料都是面试常用的,整理一下,希望能帮到大家 
> 主要三个部分 1.搜集面试题目  2.java资料 3 找工作日期记录,看从准备工作开始,多久可以找到工作(疫情原因,进度放缓不少)


| 📊 |⚔️ | 🖥 |
| :--------: | :---------: | :---------: |
| [面试题](#面试题) | [面试资料](#面试资料)|[面试记录](#面试记录) |

## 面试题

#####  0521联科科技

Springboot和spring相比优缺点。 

/**　

​      依赖太多，一个spring boot项目就有很多M

　　缺少服务的注册和发现等解决方案

　　缺少监控集成方案，安全管理方案

**/
Springboot缺点，重量级和轻量级的区别？springboot重量的么？

Springboot怎么自动配置？Springboot如果实现只引入jar包就可用

 @Conditional  接口实现的

Springboot加载配置优先级？？

项目中为什么要用到rabbitmq 可以去掉么

Redis缓存时间到了，内存中还有数据么，是否会删除

Springbean为什么默认单例模式？

单例模式 懒汉饿汉有什么问题？ 饿汉线程安全问题

Arraylist底层

Integer  a 100  

Integer b = 100  

A==b  为什么是返回true  缓存大小127

##### 0521华阳国际 设计集团

项目中最难的点

什么是分布式

分布式事物怎么实现

项目中有没有用到分布式，听完我说没有兴致缺缺。

##### 手付通 0521

面试手续很繁琐  hr视频面试-一个小时的笔试-hr聊天--来公司挺久了没有碰到技术

项目的难点

项目哪些表

自己实现过接口么

索引的类型

索引为什么快

Mvn常用命令都有哪些  clean install

Token了解过么，

加密方式都知道什么, 加密算法 ?    AES,DES,3DES 

加盐是什么

表怎么设计的

 

##### 0520 百果园  

分布式做过么？

注册中心挂了怎么样？ > 地址不变就可以通

Linux

创建一个文件  touch  mkdir

修改文件内容   Vim

Mysql的事物隔离级别，区别？ https://www.cnblogs.com/jian-gao/p/10795407.html 

脏读和幻读是什么？

数据库引擎

binlog  redolog   https://www.cnblogs.com/kongzhongqijing/articles/7905051.html 

索引的数据结构？为什么是b tree  

rpc是什么？中文翻译？远程过程调用

Spring事物传播机制  https://www.cnblogs.com/fxtx/p/11630331.html 

Spring aop 带来什么问题  

Java自带的命令     https://blog.csdn.net/qq_31156277/article/details/80035236 

jps  jsat   jinfo  jmap  jstack 

Mq用途 

Mq遇到哪些问题？

Mq数据丢失？ack

Mq重复消费  > amqp消费者消费者确认机制

Jvm内存模型，

方法区， 永生带，元空间是都什么东西?   https://blog.csdn.net/u011635492/article/details/81046174 

一个对象从创建到销毁，在jvm中经历了哪些过程

索引失效的情况 

Left join 和innerjoin 的区别

##### 深圳航信

Bean的五个作用域

Java设计模式

Java设计原则  开闭原则，单一逻辑职责，

Thread start  run的区别

Thread runable的区别

线程池里哪些实现类？

怎么确定最大最大线程数

Nio和bio

Bio同步阻塞的。

乐观锁悲观锁？

设计模式

Redis用到哪些 

Redis缓存血崩，redis缓存穿透

Spring cloud组件,网关spring  gateway 或者zull

Feign 底层是什么？调用方式？

怎么将feign流程完成？？  过程讲一下

申朴信息，

线程池 讲一下  

多线程的源码

##### 0519和合信诺   (一直在引导我, 感觉缺人

数据量大，拆表

Jvm

栈溢出怎么处理，循环引用，递归

写一个class，注意什么？有两个实例如何判断指向同一个引用？

Mysql存储日期类型的数据，怎么处理

Date timestap

Simpledateformat线程安全么，不安全

Get post的理解

Spring的事物怎么实现，

transactional接口。

Redis

Oauth怎么实现的

数据库  悲观锁乐观锁

Currenthashmap  锁是分段锁

Redission做session 设置过期时间 expire

代码管控

日志查看 头几行  

Less more  

Awk 写法比较麻烦 

##### 0519  企保科技

 java深复制浅复制 ,复制一个类怎么处理?  克隆,  序列化

wait()  和 sleep() 的区别?

cas 和aqs

threadlocal这个类了解么? 数据类型什么形式的

 java接触到什么锁?  

synchronized可以修饰静态方法么? 

synchronized 修饰静态方法和实例方法相互影响? 加锁的对象不一样

volidate 怎么用? 

引入volidate 解决了什么问题?虚拟机    多线程.解决可见性的问题

static 可以修饰代码块么?

父类 子类 构造器 静态代码块执行顺序

 servlet 线程安全的么?

OAuth协议? 几种实现方式?怎么交互的? 

http 协议分层的,下层是什么协议?  

tcp 三次握手四次挥手? 

jvm ? 

mysql 主从 复制策略?   binlog 

zk的选举算法 ? 

redis 锁怎么实现?

百万千万亿级的表解决方案? 

linux 

awk 

sed  

 一个文件复制到其他服务器命令  : 

zuul和gateway的区别:

io个nio的区别? 怎么用

##### 0519 金蝶

 bean的生命周期

为什么使用currentmap 比hashtable  效率高?

concureethash map会带来别的问题?

统计每段的size()?

aqs了解么?

java的异常体系? 

nio 了解过么?

int占了多少个字节 

#### 0518    友德医面试

面试官过来拿着简历看了一下问我会不会cloud 

说你这个项目是运维比较多吧 感觉你业务写得很少.然后就让我走了

#### 0517     alchimest遇到的面试题

项目中是怎么实现分布式锁的

订单系统和库存系统事务是怎么实现的

redis事务

消息队列实现的发送短信功能，你们怎么保证消息能够全部都投递到消费方

 谈谈你对zookeeper的认识

mysql是如何实现repeatable read 这一隔离级别的

####  0517   极简汇率  CTO 面试 

简单聊了聊,  感觉有点忌讳外包出身,  说外包的环境限制, 学到的东西很浅

####  0516 睿程时代  初试

 面试很随意, 问了很多api ? 记得不太清楚了

mysql查询替换用什么方法   replace

 union unionAll 有什么区别 ? union返回不允许重复的

 声明式事务和编程式事务?

 ioc几种注入方式?  https://www.cnblogs.com/jiangzhaowei/p/9629950.html

 mybatis  动态SQL?  foreach都有什么属性

map的key唯一么, 是否可以为空 

 map怎么遍历

thread  run 和start 什么区别?

 final关键字是干什么的? 

###### final关键字可以用来修饰类、方法和变量（包括成员变量和局部变量 

#### 0515  晚七点  创铁科技 

 实例变量和静态变量 

 https://blog.csdn.net/ole_triangle_java/article/details/79507608 

 == 和equals  

​    https://www.cnblogs.com/tian-ci/p/10543121.html 

同步和异步

  https://blog.csdn.net/yexiangcsdn/article/details/84971827 

引用传递值传递

bean的生命周期 

事务的隔离级别, 具体

####  0515  下午五点   极简汇率  初试

 聊的面比较广, 但是没有深挖

#### 0515 下午四点 深科技

 java为什么跨平台

 c++ c了解过么? 

 jvm回收机制? jvm 怎么判断对象是可回收的? 然后用什么算法回收? 

 jvm区域划分 ? 程序计数器用来干嘛的? 

 arraylist 和linkedlist 

arraylist为什么查询快?  O(1)的复杂度? 

 手写双向链表?     class node  {   Node firstNode,Node lastNode , int size }

lastnode的数据类型?

ioc aop ? 

aop的实现?  动态代理哪两种? 

spring全家桶  怎么处理http 请求?  

spring 的HTTPservlet 实现了servlet 接口,  tomcat定义了一些读取servlet的方法

springmvc的步骤? 

MySQL 的使用版本? 默认引擎?

innodb和  myisam 区别? 

 https://blog.csdn.net/qq_35642036/article/details/82820178 

innodb锁的级别? 行锁还是 表锁?  mysam 是表锁还是行锁?

索引的匹配规则? 怎么让索引生效?

redis 持久化策略?

业务场景 : 如何防止用户抓包篡改数据  md5加密特征值比对 

 如果抓包while() 刷接口,怎么处理? 限制ip

限制ip 如果防止误杀?

对我的评价?  

jvm 答得不好,数据库引擎这块需要加强

java基础和框架挺好的

#### 0515上午懒人易健  

面试官不知道怎么问

我一通乱讲

#### 0514   上午 某金融外包 名字懒得记 练手用  复试

 JUC下常用的api ?  

concreentHashMap为什么比hashTable 快?  

 synchronized 重量级锁还是轻量级锁,锁升降级?

  cas了解过么? cas怎么解决线程冲突

java基础类型并发情况下使用的方法?Integer 被改写?

java的反射机制?  静态代理 动态代理的区别? 应用场景? 

spring的aop?

springboot怎么自动化配置? 

springboot怎么不使用默认的tomcat?

 微服务? 

微服务带来哪些问题? 

 分布式系统cap无法三个都实现?

如何保证分布式数据库事务一致性?  读一致性要求不高, 写一致性要求很高? 

听说过微服务理论servcie match 网格服务, 栅格微服务? 

 服务间调用feign 负载均衡策略? 什么组件   ribbon .,  feign 集成了 ribbon  

有没有 接触过 其他的注册中心?  springcloud alibaba中其他注册中心

redis单线程为什么这么快?

redis 后面的版本还是多线程? 多个io复用实现很快?

#### 0514   上午 某金融外包 名字懒得记 练手用 初试 

 集合

hashtable 和concrorrenthashmap 怎么实现的, 锁加到哪里了?

linkedlist怎么实现的?  E  item;  Node noxt ; Node prev; 

迭代器?和for的区别? 

一边遍历一边删除 用迭代器还是for比较好?     这里

aop通知方式类型? 

拦截器过滤器的区别?  哪个先执行? 

代码实现事务用哪个注解?   

mysql索引的数据结构? b+ 

索引的类型? 

 复合索引生效原则?优化规则? 

linux常用命令



#### 0512 上午 创互科技

hr 简单聊了一会儿让我回去了,很不专业

####  0511  下午 深圳掌众智能科技股份公司

自己哪些方面比较擅长?   
centos7 默认的内核版本?   
常用的linux命令?   
磁盘满了? 怎么看?   
du知道么?  /     
怎么理解redis 讲一下?    
所有项目中把redis砍了,会有什么效果?  
不用redis会慢到什么概念 ?   
select*from userid  会慢到多少?  
<u>/我之前做过优化    3秒到0.3秒</u>   
0.3秒? 正常不都是应该在5ms之内的?  
一个SQL 接口特别慢怎么处理?   
怎么看索引是不是生效? 建了一个索引, 怎么看是不是生效的?  

rabbitMQ了解多少? 为什么要用rabbitMQ ?  
对下一份工作 有什么期望?   
 工作有一段时间了,没什么竞争力,  
有什么规划?往哪个方向去看?  
其实你没有想过这些   
你怎么认识spring?我不要常规的答案, 按你的理解来,它是一个什么东西?  
spring有没有可以让你提高的东西?怎么用好   
es解决了什么问题?lucense也可以么?  
怎么解释es封装了lucense?   
lucense是分布式的么?  
分布式是什么?   
为什么要搞成集群的形式?搞成集群是为了解决什么问题?  
这种技术叫什么?   
这个叫分片.  
分布式有哪些技术特点?  这个叫复制   
有什么想问我的?  

 <u>对我有什么建议?</u>   

你的简历比较普通,你用过什么东西和用好是两回事?  
你用rabbit的细节不太懂, 但你的耐心比较好., 为什么全部把题目做完?   
笔试题难么? 可以搜出来, 做不出来  
我帮你总结一下 ? 不是计算机本专业的,计算机基础比较薄弱, 概念不够理解  
分布式完全无知状态, 运维技能有一些.    
但你的技术太浅了, 你用什么东西,没有去想.   
elasticsearch 和Lucense 你应该很明白的? 你要清楚, 有一个很全面的想法 ?   
录音第27分钟:  咱们俩沟通不畅是这个原因,思维水平不在一个线上, 用的东西太浅了   
思维上有明显的缺陷? 你对一个东西的抽象概括能力比较弱, 描述一个东西很难描述清楚.   
你被问很被动, 可能是我问的比较奇怪  
建议:不要再去外包公司了,强烈建议的, 在外包如果超过两年废的概率比较大, 外包废的概率比较大,外包超过两年我们直接筛的,  
 思考一下后端怎么发展?  缺少系统性的学习 ,这个建议很中肯   
 你不要看你大老远跑过来,我们也不招你,但我们的建议是很中肯的.  
 一些东西你是要了解的   
 你简历上写得每一个英文单词都是一个 血盆大口,会耗费你很多的青春.  
 希望你后面调整一下 .  

#### 0512 下午 招联金融软件运维管理平台 视频面试

介绍项目    
你这个项目具体的流程      
shell脚本熟悉么,怎么用的     
你这简历写得挺乱的    
简历中说用了redis,怎么用的,用的什么数据结构,只是用了String么? 全部用的string么   
项目中说用了ansible  ansbile哪里用了,怎么用的   
你说使用了线程池,项目中哪里使用了线程池, 为什么要使用线程池? 具体怎么使用的?    
你的项目你还是没有讲清楚,   
说说你开发过程中可以用来吹牛逼的点,哪一点最难?    
代码怎么上线的?自己部署过项目么?1000个tomcat怎么部署的?   
我们已经给了你很多机会了,不符合我们的要求. 不要浪费时间了  
0512 上午创互科技  一面   
是做项目   
做很简单的笔试题, 个人信息  
hr过来聊了聊,扯会儿淡,没问技术.   
完了和我说把这些信息反馈给技术,合适的话会给你打电话  
奇怪的公司,这些信息完全可以电话完成的    

#### 0511 上午 图灵机器人

Hashnap底层，为什么要用红黑树   
线程池 项目用的哪一个？   
为什么用这个？   
线程池 最大线程数100 核心线程数是5   
200个线程执行，线程数量怎么变化  
缓存队列？  
redis怎么解决查询接口慢  
Redis同步策略，你们怎么同步的？  
100w条数据怎么确定热点数据，100w条怎么确定热点数据  
redis怎么确定热点数据  
Es  
Es存储结构？为什么是这种结构，这种结构什么好处  
堆满了怎么办？直接溢出？怎么区分对象是不是垃圾  
Concrenthashmap 为什么效率高  
原子类  
事物，事物的隔离级别？  
你的优势？  
未来发现规划，  
架构师的理解？  



#### 20200509   鸿普森 

一个巴基斯坦人面试的我,全程英语交流,给你一个链接,共享屏幕看着你做题   

打印下列字符

  ```
   *
  **
 ***
**** 

然后倒过来 打印, 然后上下颠倒打印
  ```

类构造器,和父类先后执行顺序

同一个类中实例化对象 ,都是代码题, 一共三四道

一个老外看着我做题,网页编辑器我用着很不熟练,还不让我开风扇说声音太吵

#### 20200508  vivo外包

 1.自我介绍

 你这项目有点简单啊.(简历上只详细写了最近的一个项目, 其他写得过于简单)  

2  hashmap的加载因子, 干什么用的, Map<String, String> map=new HashMap<>(1);

[关于new HashMap<>(1)中1的理解（hashMap的加载因子）](https://www.cnblogs.com/wangzun/p/7147238.html)

 hashmap 是这样存的  
先利用hashcode 找到需要存的地方  
但是 存的地方肯定是有限的 就是hashMap分配到的空间 比如是 10  
现在你 第一个元素来了 那么他会根据 你 hashcode%10 得到你 在 10个位置中该存到哪里 

3.hashmap的底层数据结构, 扩容机制  

4.int integer的区别  

5.线程池了解么,   

6. 线程池核心线程数,最大线程数   
7. 超过最大线程数会怎么样? 如何考虑设置 核心线程数最大线程数   
8.  jvm组成  
9. new 对象 堆和栈怎么存?    
10. 死递归, 是什么溢出   
11. 生成字节码到加载的过程classloader   
12. gc了解么   
13. gc在jvm里分为哪些区域?分为哪些算法   
14. while()死循环一直在new ,  最终经理哪个过程?   

实际业务中不停new对象, 出现什么样的过程最终什么样的溢出   

15. 线上业务没有遇到这种 gc   

16. mysql 数据引擎   

17. 设计表有没有null的字段 ,对数据有什么影响   

18.  mysql索引    

19. 唯一索引和普通索引的区别   

20. 联合索引 abc  a和B, b和c可以击中索引么   

21. springbean生命周期   

22. springboot注解   

23. es用过,mapping的数据结构是你设计的么 mapping 的数据类型  

     https://blog.csdn.net/chengxiong7602/article/details/100912541 

     es数据类型?   

24. 精确检索 用什么数据类型   

25. 模糊查询用什么数据类型  

26. es的倒排索引  

27. MQ的订阅发布的模式  

28. 不同mq订阅模式的差异  

29. mq的结构,怎么对消息做分发   

30. 负载均衡策略  

    

    

#### **2020 0430 开思时代 **  

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



