package com.dajia.books.service;

import com.dajia.books.entity.Book;

import java.io.IOException;

/**
 * @author lishuaibin
 * @create 2019-11-25 5:38 下午
 */

public interface BookService {

    public Book findBookByID(Book book) throws IOException;

    public void addBook(Book book)throws IOException;


}
