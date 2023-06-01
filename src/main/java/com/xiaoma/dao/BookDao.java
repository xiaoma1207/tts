
//TODO  添加mapper

package com.xiaoma.dao;

import com.xiaoma.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper//让springboot可以扫描，生成自动代理
public interface BookDao {

//    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into test (name,id,state,age) values(#{name},#{id},#{state},#{age})")
    public int save(Book book);

    @Update("update test set name = #{name},, state = #{state},age = #{age} where id = #{id}")
    public int update(Book book);

    @Delete("delete from test where id = #{id}")
    public int delete(Integer id);

    @Select("select * from test where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from test")
    public List<Book> getAll();
}
