package com.example.excel.controller;

import com.example.excel.service.Excelservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@RestController
public class excelcontroller {
@Autowired
Excelservice excelservice;
    @RequestMapping("upload")
    @ResponseBody
    //导入
    public String doUpload(HttpServletRequest file) throws IOException {
        MultipartHttpServletRequest mreq = null;
        if(file instanceof  MultipartHttpServletRequest){
            mreq = (MultipartHttpServletRequest) file;
        }else {
            return "shibai123";
        }
        try{
            boolean flag = excelservice.analysisFile(mreq);
            if(!flag){
                return "shibai456";
            }
            return "chenggong";
        }catch (Exception e){
            return "shibai789";
        }
    }


    @RequestMapping("hhh")
    public String a(){

        return "hhh";
    }
}
