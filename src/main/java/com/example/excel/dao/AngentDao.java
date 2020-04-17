package com.example.excel.dao;

import com.example.excel.bean.Angent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AngentDao  {

    public  int addAngent(Angent angent);
}
