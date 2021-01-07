package com.practice.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/userfallback")
	public String userServiceFallback() {
		return "User service is taking longer than expected";
	}

	@GetMapping("/departmentfallback")
	public String departmentServiceFallback() {
		return "Department service is taking longer than expected.Please trry again later";
	}

}
