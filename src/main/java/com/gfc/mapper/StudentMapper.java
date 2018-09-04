package com.gfc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {

    @Select("select * from 0904_student")
    List<Map<String,Object>> listStudent();
}
