package com.cognizant.account.controller;
import com.cognizant.account.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AccountController {
	@GetMapping("/accounts/{number}")
	
	public Account Account(@PathVariable String number) {

        return new Account(number,"savings",34646);
	}
}
