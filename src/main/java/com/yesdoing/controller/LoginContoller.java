package com.yesdoing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yesdoing.dto.Member;
import com.yesdoing.repository.MemberRepository;

@Controller
public class LoginContoller {
	@Autowired
	MemberRepository memberRepository;
	@GetMapping("/login")
	public String login() {
		return "login/login";
	}
	@GetMapping("/join")
	public String join() {
		return "login/join";
	}
	@PostMapping("/join")
	public String join(Member member) {
		System.out.println(member);
		System.out.println(member.getMemberId());
		System.out.println(member.getName());
		System.out.println(member.getPassword());
		memberRepository.save(member);
		System.out.println("저장완료");
		return "redirect:/login";
	}
}
