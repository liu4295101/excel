package com.example.excel.controller;

import com.example.excel.bean.Student;
import com.example.excel.service.StudentService;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

@RestController
public class exportController {
//    private  final Logger logger = LoggerFactory.getLogger(exportController.class);

    @Autowired
    StudentService ss;


    @ResponseBody
    @RequestMapping("student")
    public void goodsExcel(HttpServletResponse response, Student s) {
        XSSFWorkbook wb = ss.selectAll(s);
        String fileName = "Student报表.xlsx";
        OutputStream outputStream = null;
        try {
            fileName = URLEncoder.encode(fileName, "UTF-8");
            //设置ContentType请求信息格式
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            outputStream = response.getOutputStream();
            System.out.println("test");
            wb.write(outputStream);
            outputStream.flush();
            outputStream.close();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("失败1");

        } catch (IOException e) {
            System.out.println("失败2");
            e.printStackTrace();

        }
    }
}
