package com.example.excel.service;

import com.example.excel.bean.Student;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;
import java.util.Map;

public interface StudentService {

    public XSSFWorkbook selectAll(Student student);
}
