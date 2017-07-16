package com.wenliuz.transactional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wenliu on 2017/7/16.
 */
public class TransactionProxyFactoryBeanTest {

    @org.junit.Test
    public void testTrans(){
        // 创建Spring容器
        ApplicationContext ctx = new
                ClassPathXmlApplicationContext("transactional/transactionProxyFactoryBean.xml");
        // 获取事务代理Bean
        NewsDao dao = (NewsDao)ctx
                .getBean("newsDaoTrans" , NewsDao.class);
        // 执行插入操作
        dao.insert("疯狂Java" , "轻量级Java EE企业应用实战");
    }
}
