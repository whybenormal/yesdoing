/*package com.yesdoing.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.dom4j.util.UserDataDocumentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yesdoing.dto.Account;
import com.yesdoing.repository.AccountRepository;

@Service
@Transactional	//이곳에 적용되는 퍼블릭 메서드는 트랜젝션이 적용
public class AccountService {

	@Autowired
	private AccountRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public Account createAccount(Account account) {
		account.setPassword(passwordEncoder.encode(account.getPassword()));
		return repository.save(account);
	}
}
*/