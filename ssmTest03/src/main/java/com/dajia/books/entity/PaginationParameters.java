package com.dajia.books.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 * @author lishuaibin
 * @create 2019-11-27 4:15 下午
 */
public class PaginationParameters implements Serializable {
    private static final long serialVersionUID = -5977615750376896283L;

    private String orderKey;

    private String orderType;

    private String orderBy;

    private int Page_Max_Size;

    private LinkedHashMap orderMap;

    private String _page_div;

    private int currentPageNumber;

    private int pageMaxSize;

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getPage_Max_Size() {
        return Page_Max_Size;
    }

    public void setPage_Max_Size(int page_Max_Size) {
        Page_Max_Size = page_Max_Size;
    }

    public LinkedHashMap getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(LinkedHashMap orderMap) {
        this.orderMap = orderMap;
    }

    public String get_page_div() {
        return _page_div;
    }

    public void set_page_div(String _page_div) {
        this._page_div = _page_div;
    }

    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    public void setCurrentPageNumber(int currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }

    public int getPageMaxSize() {
        return pageMaxSize;
    }

    public void setPageMaxSize(int pageMaxSize) {
        this.pageMaxSize = pageMaxSize;
    }

    public PaginationParameters(int pageNumber,int pageMaxSize){
        this.orderBy = null;
        this.Page_Max_Size = 20;
        this.orderMap = null;
        this.pageMaxSize = 20;
        this.currentPageNumber = pageNumber;
        this.pageMaxSize = pageMaxSize;
    }

    public PaginationParameters(int pageNumber){
        this.orderBy = null;
        this.Page_Max_Size = 20;
        this.orderMap = null;
        this.pageMaxSize = 20;
        this.currentPageNumber = pageNumber;
    }

    public PaginationParameters(){
        this(1);
    }
}
