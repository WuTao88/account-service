package com.example.cloud.service.accountservice;

import com.example.cloud.service.accountservice.entity.account;
import com.example.cloud.service.accountservice.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceApplicationTests {
	@Autowired
	AccountMapper accountMapper;
	@Test
	public void contextLoads() {
		List<account> list=accountMapper.findAll();

		for (account a:list
			 ) {

			System.out.println(a.getId()+":"+a.getUsername());

		}
	}

}
