Mybatis的练习
使用的是注解(@Select)的方式使用Mybatis

1.创建一个User类
2.创建一个UserDao接口(接口方法使用@Select修饰)
3.创建一个SqlMapConfig.xml文件	--该文件为mybatis的主配置文件
4.使用注解后不需要这步--有了主配置文件后还要建立一个接口的独立配置文件UserDao.xml
5.在主配置文件中使用<mapper class="com/datayes/dao/UserDao"/>指定接口
6.在测试文件中测试


