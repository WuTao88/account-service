package com.example.cloud.service.accountservice.service.implement;

import com.example.cloud.service.accountservice.entity.account;
import com.example.cloud.service.accountservice.mapper.AccountMapper;
import com.example.cloud.service.accountservice.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class accountServiceBack implements accountService {

    @Autowired
    private AccountMapper mapper;
    @Override
    public String login_service(String name, String pass) {
        String fallback=null;
        account account=mapper.findOne(name);
        if (account.getPassword().equals(pass)&&account.getStatus()==1){
            fallback="info:"+account.getId()+","+account.getUsername()+","+account.getReg_time();
        }

        return fallback;
    }

    @Override
    public String reg_service(String name, String pass) {

        String fallback=null;
        mapper.add(name,pass);
        if (mapper.findOne(name)!=null){
            fallback="success:"+mapper.findOne(name).getId();
        }
        return fallback;
    }
}
