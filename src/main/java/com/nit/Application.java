package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.helper.MinBalanceVerifier;
import com.nit.repository.AccountRepository;
import com.nit.repository.impl.AccountRepositoryImpl;
import com.nit.service.AccountService;

public class Application {

	public static void main(String[] args) {

		/*
		 * AccountRepository accountRepository = new AccountRepositoryImpl();
		 * AccountService acctService = new AccountService(accountRepository);
		 * MinBalanceVerifier minBalanceVerifier = new MinBalanceVerifier(100);
		 * acctService.setMinBalanceVerifier(minBalanceVerifier);
		 * acctService.deposit(123, 300); acctService.withdraw(123, 600);
		 */
		
		//spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		AccountService accountService = context.getBean("service", AccountService.class);
		accountService.deposit(123, 400);
		
	}

}
