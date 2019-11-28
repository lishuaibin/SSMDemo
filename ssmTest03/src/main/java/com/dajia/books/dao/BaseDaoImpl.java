package com.dajia.books.dao;

import com.dajia.books.entity.PaginationParameters;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import sun.jvm.hotspot.debugger.Page;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author lishuaibin
 * @create 2019-11-27 3:49 下午
 */
public class BaseDaoImpl<T,E> extends SqlSessionDaoSupport {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;


    public BaseDaoImpl(){

    }


    //添加下面的代码，即可就意味着继承于 SqlSessionDaoSupport 的 DAO 类，它们的对象能被自动注入 SqlSessionFactory 或 SqlSessionTemplate 对象

    /**
     *
     * 其实，在 StudentDao 的 init 方法上，加上 @PostConstruct 注解（需要引入 javax.annotation.PostConstruct ）就可以了。用 @PostConstruct 标注 init 方法后，
     * init 方法就会成为初始化方法，而在 Spring 完成依赖注入后被 Spring 调用。也就是说，此注解与前面提到的 init-method 属性的用途类似，读者可自行尝试一下
     */
    @PostConstruct
    private void init(){
        super.setSqlSessionFactory(this.sqlSessionFactory);
    }

    public T findByID(String paramName,Object object) throws Exception {
        try{
            return this.getSqlSession().selectOne(paramName,object);
        }catch (Exception e){
            throw new Exception(e);
        }
    }


//    public Page< T > findByPage(String paramName, Object paramValue, PaginationParameters paginationParameters)throws Exception{
//        try{
//            int totalDataSize = this.findTotalDataSize(paramName,paramValue,paginationParameters);
//
//        }
//    }


//    public int findTotalDataSize(String paramName, Object paramValue,PaginationParameters paginationParameters)throws Exception{
//        try{
//            List countDataList = this.getSqlSession().selectList(paramName,paramValue,new ESNRowBounds(-1,-1,paginationParameters.getOrderKey(),paginationParameters.getOrderType(),paginationParameters.getOrderBy()))
//           if(countDataList.size() == 0){
//               return 0;
//           }else{
//               int count_num = (Integer)countDataList.get(0);
//               return count_num;
//           }
//        }catch (Exception e){
//            throw new Exception(e);
//        }
//    }


    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate)
    {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }
}
