package com.within.licensingservice.controller;

import java.util.concurrent.TimeoutException;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/license")
public class LicenseController {
	@GetMapping
	public String getLicenses() throws TimeoutException {
		return "license";
	}

}
