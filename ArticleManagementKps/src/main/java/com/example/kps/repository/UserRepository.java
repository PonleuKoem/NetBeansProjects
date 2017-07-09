/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.repository;

/**
 *
 * @author UC
 */
import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.kps.model.Role;
import com.example.kps.model.User;

@Repository
public interface UserRepository {
	
	@Select("Select u.id, u.username, u.password, u.status From tbl_user u Where u.username=#{username}")
	@Results({
		@Result(property="id", column="id"),
		@Result(property="roles", column="id", many=@Many(select="findRoleByUserId"))
	})
	User loadUserByUsername(String username);
	
	@Select("Select r.id, r.role From tbl_user_role ur Inner Join tbl_role r on r.id=ur.role_id Where ur.user_id=#{id}")
	List<Role> findRoleByUserId(int id);	
}