package com.eshop.service;

import java.util.List;

import com.eshop.commons.Pager;
import com.eshop.model.Account;
/**
 * 
 * @author fuxin
 *
 */

public interface AccountService{

	public void createAccount(Account account);
	
	public int deleteAccount(int id);
	
	public Account findAccountById(int id);
	
	public List<Account> findAccountAll();
	
	public int findTotal();
	
	public Pager<Account> findByPage(int showPages,int pageSize);
}