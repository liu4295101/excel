package com.example.excel.impl;

import com.example.excel.bean.Angent;
import com.example.excel.dao.AngentDao;
import com.example.excel.service.AngentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AngentServiceImpl implements AngentService {
    @Autowired
    AngentDao angentDao;
    @Override
    public int addAngent(Angent angent) {


        return angentDao.addAngent(angent);
    }
}
