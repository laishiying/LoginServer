package com.hxyl.jason.mapper;


import com.hxyl.jason.entity.WpUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LoginMapper {
    @Select("SELECT * FROM wp_user WHERE workNumber = #{workNumber} AND userPassword = #{userPassword}")
    WpUser UserLogin(@Param("workNumber")String workNumber, @Param("userPassword")String userPassword);
}
