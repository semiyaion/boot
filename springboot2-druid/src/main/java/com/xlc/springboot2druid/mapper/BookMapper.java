package com.xlc.springboot2druid.mapper;

import com.xlc.springboot2druid.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Classname BookMapper
 * @Description TODO
 * @Date 2024/12/5 20:41
 * @Created by cxx
 */
@Mapper
public interface BookMapper {
    @Select(" select * from tbl_book where id= #{id}")
    public Book getbyid(Integer id);
}
