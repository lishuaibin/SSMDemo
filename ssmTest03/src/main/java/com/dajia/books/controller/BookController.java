package com.dajia.books.controller;

import com.dajia.books.entity.Book;
import com.dajia.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lishuaibin
 * @create 2019-11-25 5:46 下午
 */

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;


    @RequestMapping("/findBookByID")
    public Book findBookByID(Book book)throws Exception{
        Book book1 = new Book();
        book1.setBookID("1000");
        Book bookByID = bookService.findBookByID(book1);

        return bookByID;
    }

    @RequestMapping("/addBook")
    public void addBook(Book book1)throws Exception{
        book1.setBookID("1005");
        book1.setName("测试");
        book1.setNumber("005");
        bookService.addBook(book1);

    }
}
