package com.yesdoing.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.yesdoing.dto.Account;

public class UserDetailsImpl extends User{

	public UserDetailsImpl(Account account) {
		super(account.getMemberId(), account.getPassword(), authorities(account));
	}

	private static Collection<? extends GrantedAuthority> authorities(Account account) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return authorities;
	}

}
