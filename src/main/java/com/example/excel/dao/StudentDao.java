package com.example.excel.dao;

import com.example.excel.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {

    public List<Student> selectAll();
}
