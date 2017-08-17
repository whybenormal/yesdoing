package com.yesdoing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yesdoing.dto.Account;
import com.yesdoing.repository.AccountRepository;

@Controller
public class AccountContoller {

	@Autowired
	AccountRepository accountRepository;
	
	//로그인 페이지 이동
	@GetMapping("/login")
	public String login() {
		return "login/login";
	}
	//회원가입 페이지 이동
	@GetMapping("/join")
	public String join() {
		return "login/join";
	}
	//회원가입
	@PostMapping("/join")
	public String join(Account account) {
		accountRepository.save(account);
		return "redirect:/login";
	}
}
