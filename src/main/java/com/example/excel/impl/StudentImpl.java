package com.example.excel.impl;

import com.example.excel.bean.Student;
import com.example.excel.dao.StudentDao;
import com.example.excel.service.StudentService;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentDao sd;

    @Override
    public XSSFWorkbook selectAll(Student student) {
        int i = 0;
        int j = 0;
      /*  Integer sid=(Integer) map.get("sid");
        String sname=(String) map.get("sname");
        String birthday=(String) map.get("birthday");
        String sex=(String) map.get("sex");
        String telephone=(String) map.get("telephone");
        String email=(String) map.get("email");*/
        Integer sid = student.getSid();
        String sname = student.getSname();
        String birthday = student.getBirthday();
        String sex = student.getSex();
        String telephone = student.getTelephone();
        String email = student.getEmail();
        List<Student> list = sd.selectAll();
        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Goods");//创建一张表
        Row titleRow = sheet.createRow(0);//创建第一行，起始为0
        titleRow.createCell(i).setCellValue("序号");//第一列
        if (sname != null && sname != "") {

            i++;
            titleRow.createCell(i).setCellValue("姓名");
        }
        if (birthday != null && birthday != "") {

            i++;
            titleRow.createCell(i).setCellValue("生日");
        }
        if (sex != null && sex != "") {

            i++;
            titleRow.createCell(i).setCellValue("性别");
        }
        if (telephone != null && telephone != "") {

            i++;
            titleRow.createCell(i).setCellValue("手机号");
        }
        if (email != null && email != "") {

            i++;
            titleRow.createCell(i).setCellValue("邮箱");
        }

        int cell = 1;
        for (Student stu : list) {
            Row row = sheet.createRow(cell);//从第二行开始保存数据
            row.createCell(j).setCellValue(cell);
            if (sname != null && sname != "") {

                j++;
                row.createCell(j).setCellValue(stu.getSname());
            }
            if (birthday != null && birthday != "") {

                j++;
                row.createCell(j).setCellValue(stu.getBirthday());
            }
            if (sex != null && sex != "") {

                j++;
                row.createCell(j).setCellValue(stu.getSex());
            }
            if (telephone != null && telephone != "") {

                j++;
                row.createCell(j).setCellValue(stu.getTelephone());
            }
            if (email != null && email != "") {

                j++;
                row.createCell(j).setCellValue(stu.getEmail());
            }
            j = 0;
            cell++;
        }
        return wb;
    }
}
