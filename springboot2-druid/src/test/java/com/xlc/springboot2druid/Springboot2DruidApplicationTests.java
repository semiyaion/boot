package com.xlc.springboot2druid;

import com.xlc.springboot2druid.mapper.BookMapper;
import com.xlc.springboot2druid.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot2DruidApplicationTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
        Book getbyid = bookMapper.getbyid(4);
        System.out.println(getbyid);
    }

}
