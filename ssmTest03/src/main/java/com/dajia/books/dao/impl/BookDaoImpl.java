package com.dajia.books.dao.impl;


import com.dajia.books.dao.BaseDaoImpl;
import com.dajia.books.dao.BookDao;
import com.dajia.books.entity.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lishuaibin
 * @create 2019-11-26 11:48 上午
 */

@Repository
public class BookDaoImpl extends BaseDaoImpl implements BookDao {

    @Override
    public Book findBookByID(Book book) throws IOException{
        Book  book1 = this.getSqlSession().selectOne("Mapper.BookDaoMapper.findBookByID", book);
        return book1;
    }

    @Override
    public void addBook(Book book) throws IOException {
        this.getSqlSession().insert("Mapper.BookDaoMapper.addBook",book);
    }


}
