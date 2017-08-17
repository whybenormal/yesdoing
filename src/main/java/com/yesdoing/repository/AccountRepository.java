package com.yesdoing.repository;
import org.springframework.data.repository.CrudRepository;

import com.yesdoing.dto.Account;

public interface AccountRepository extends CrudRepository<Account, String>{
}