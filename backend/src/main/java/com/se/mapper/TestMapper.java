package com.se.mapper;

import com.se.entity.Test;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestMapper {
    @Select("SELECT * FROM test")
    List<Test> queryById();

}
