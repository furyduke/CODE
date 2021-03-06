package com.xiaofan.dao;

import com.xiaofan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    @Select("select * from mybatis.teacher where id = #{id}")
    Teacher getTeacherById(@Param("id") int id);

    Teacher getTeacher1(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
