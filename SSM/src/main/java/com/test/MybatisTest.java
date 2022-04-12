package com.test;

import com.bean.Account;
import com.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Date 2022/3/10 - 下午 2:49
 */
public class MybatisTest {

    @Test
    public void testMybatis() throws IOException {
        //连接核心文件配置
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //获取工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //会话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccountDao mapper = sqlSession.getMapper(AccountDao.class);

        List<Account> all = mapper.findAll();

        for (Account account : all) {
            System.out.println(account);
        }


    }
}
