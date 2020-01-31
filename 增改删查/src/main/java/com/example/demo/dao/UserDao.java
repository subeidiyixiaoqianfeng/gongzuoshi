package com.example.demo.dao;


import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    @Insert("INSERT INTO new_table(img, title, name, des,classify, isdownload, empower) value(#{img},#{title},#{name}" +
            ",#{des},#{classify},#{isdownload},#{empower})")
    void add(String img,String title,String name,String des,String classify,Integer isdownload,String empower);


    @Delete("DELETE FROM new_table WHERE id = #{id} ")
    void del(long id);


    @Select("SELECT * FROM new_table where id = #{id} ")
    User get(long id);


    @Select("SELECT * FROM new_table")
    List<User> lists();


    @Update("UPDATE new_table set img=#{img},title=#{title},name=#{name},des=#{des},classify=#{classify},isdownload=" +
            "#{isdownload},empower=#{empower} where id=#{id}")
    void up(User user);
}
