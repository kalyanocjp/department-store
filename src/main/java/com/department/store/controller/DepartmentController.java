package com.department.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@GetMapping("/status")
	public String getStatus() {
		return "Success";
	}

}
