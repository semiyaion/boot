package com.example.springboot_2_mybatis.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_2_mybatis.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Classname BookMapper
 * @Description TODO
 * @Date 2024/12/5 20:41
 * @Created by cxx
 */
@Mapper

public interface BookMapper extends BaseMapper<Book> {
}
