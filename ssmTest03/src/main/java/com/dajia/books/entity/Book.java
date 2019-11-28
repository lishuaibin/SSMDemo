package com.dajia.books.entity;

/**
 * @author lishuaibin
 * @create 2019-11-25 5:33 下午
 */
public class Book {

    private String bookID;// 图书ID

    private String name;// 图书名称

    private String number;// 馆藏数量



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Book(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
