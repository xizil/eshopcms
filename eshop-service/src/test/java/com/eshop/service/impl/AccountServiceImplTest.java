package com.eshop.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eshop.mappers.AccountMapper;
import com.eshop.model.Account;
import com.eshop.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:applicationContext.xml")
public class AccountServiceImplTest{

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Test
	public void testFindAllStudents() {
		List<Account> accounts = accountService.findAccountAll();
		assertNotNull(accounts);
		for (Account account : accounts){
			System.err.println(account);
		}
	}

/*	@Test
	public void testFindStudentById() {
		Account account = accountService.findAccountById(1);
		System.err.println(account);
		System.err.println(account.getUsername()+":"+account.getUsername());
	}*/

	
	/*@Test
	public void testCreateStudent() {
		Account account = new Account();
		account.setUsername("moocss@126.com");
		account.setPassword("123456");
		System.err.println("CreatedStudent: "+account);
	}

	@Test
	public void testDeleteStudent() {
		int deleted = accountService.deleteStudent(3);
		System.err.println("deleteStudent:"+deleted);
	}*/

}