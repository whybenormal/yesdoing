package com.yesdoing.repository;
import org.springframework.data.repository.CrudRepository;

import com.yesdoing.dto.Member;

public interface MemberRepository extends CrudRepository<Member, String>{
}