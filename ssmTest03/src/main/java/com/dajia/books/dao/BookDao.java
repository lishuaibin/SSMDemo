package com.dajia.books.dao;

import com.dajia.books.entity.Book;
import org.springframework.stereotype.Repository;

import java.io.IOException;

/**
 * @author lishuaibin
 * @create 2019-11-25 5:30 下午
 */


public interface BookDao {

    public Book findBookByID(Book book) throws IOException;


    public void addBook(Book book)throws IOException;


}
