package com.example.demo.kgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.kgn.service.KgnService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/kgn")
@RequiredArgsConstructor
public class KgnController {
	
	private final KgnService kgnService;
	
	@GetMapping()
	public ModelAndView SelectList(ModelAndView mav) {
		
		mav.setViewName("/kgn/list");
		
		return mav;
		
	}
	
}
