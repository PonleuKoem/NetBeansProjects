/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.controller;

/**
 *
 * @author UC
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	
	@GetMapping("/article")
	public String admin(){
		return "redirect:article/pagination/view";
	}
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
}
