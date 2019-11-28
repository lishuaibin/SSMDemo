package com.dajia.books.service.impl;

import com.dajia.books.dao.BookDao;
import com.dajia.books.entity.Book;
import com.dajia.books.service.BookService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author lishuaibin
 * @create 2019-11-25 5:39 下午
 */

@Service
public class BookServiceImpl implements BookService {
    public static final Logger logger = Logger.getLogger(BookServiceImpl.class);

    @Autowired
    private BookDao bookDao;

    @Override
    public Book findBookByID(Book book) throws IOException{
        logger.info("bookDao是啥");
        logger.info(bookDao);
        return bookDao.findBookByID(book);
    }

    @Override
    public void addBook(Book book) throws IOException {
        bookDao.addBook(book);
    }


}
