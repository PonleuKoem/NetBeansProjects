/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.model;

/**
 *
 * @author UC
 */
import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority{

	private static final long serialVersionUID = 1L;
	private int id;
	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String getAuthority() {
		return "ROLE_" + role;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", authorities=" + getAuthority() + "]";
	}
	
	
}
