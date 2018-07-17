package com.example.cloud.service.accountservice.mapper;


import com.example.cloud.service.accountservice.entity.account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Insert("insert into accounts (username,password) values (#{name},#{pass})")
    public void add(@Param("name") String name,@Param("pass") String pass);

    @Select("select * from accounts")
    public List<account> findAll();

    @Select("select * from accounts where username=#{name}")
    public account findOne(@Param("name")String name);
}
