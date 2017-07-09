/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.service;

/**
 *
 * @author UC
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.kps.model.User;
import com.example.kps.repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		//TODO: retrieve user and roles from database
		User user = userRepository.loadUserByUsername(username);
		if(user == null) 
			throw new UsernameNotFoundException("-> User not found!");
		System.out.println(user);
		return user;
	}

	

	
	
	
	
	
	
	
	
	
	
	
}
