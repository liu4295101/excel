package com.example.excel.impl;

import com.example.excel.service.Excelservice;
import com.example.excel.util.Excelutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;
import java.util.Map;

@Service
public class ExcelserviceImpl implements Excelservice {
    @Autowired
    Excelutil excelutil;
    @Override
    public boolean analysisFile(MultipartHttpServletRequest mreq) {
        List<Map> maps = null;
        try {
            maps = excelutil.analysisFile (mreq);

        } catch (Exception e) {
            return false;
        }
        if(maps==null){
            return false;
        }else{
       //
            System.out.println("===="+maps+"================");
            for (Map m:maps){

                System.out.println(m.get("姓名"));
            }
            return true;
        }

    }
}
