package com.consignment.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.consignment.model.CarrierAccount;
import com.consignment.service.ConsignmentService;

@RestController
public class ConsignmentController {
	
	@Autowired(required=true)
	ConsignmentService service;
	
	
	@PostMapping("/fcmNumber")
	public String createFcmNumber(@RequestBody CarrierAccount account) {
		
		return service.calculateCheckSum(account);
		
	}

}
