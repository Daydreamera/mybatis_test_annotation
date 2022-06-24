package com.datayes.test;

import com.datayes.dao.AuthorDao;
import com.datayes.dao.UserDao;
import com.datayes.domain.Author;
import com.datayes.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SQLSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(in);
//        SqlSession session = null;
//        try {
//            //3.使用工厂SQLSession对象
//            session = factory.openSession();
//            //4.使用SQLSession创建Dao接口的代理对象
//            UserDao userDao = session.getMapper(UserDao.class);
//            //5.使用代理对象执行方法
//            List<User> users = userDao.findAll();
//            for (User user : users) {
//                System.out.println(user.toString());
//            }
////        String userName = userDao.findName();
////        System.out.println(userName);
//        } catch (Exception e) {
//            System.out.println(e.fillInStackTrace());
//        } finally {
//            //6.释放资源
//            session.close();
//            in.close();
//        }

        // 新开一个SqlSessionFactory
        SqlSessionFactory rabyteFactory = builder.build(in, "rabyte");
        SqlSession rabyteSqlSession = rabyteFactory.openSession();
        AuthorDao rabyteMapper = rabyteSqlSession.getMapper(AuthorDao.class);
        List<Author> authors = rabyteMapper.getAuthor("4042144");
        for (Author a : authors) {
            System.out.println(a);
        }
        rabyteSqlSession.close();
        in.close();

    }
}
