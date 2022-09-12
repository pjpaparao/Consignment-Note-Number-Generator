package com.consignment.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.consignment.model.CarrierAccount;
import com.consignment.service.ConsignmentService;

@RunWith(SpringRunner.class)
public class ConsignmentControllerTest {

	@Mock
	ConsignmentController controller;
	
	@Mock
	ConsignmentService service;
	
	@Test
	public void testCreateFcmNumber() {
		
		CarrierAccount account = getCarrierAccount();
		String result = "FMCC123ABC00000196054";
		
		Mockito.when(service.calculateCheckSum(account)).thenReturn(result);
		String actual = controller.createFcmNumber(account);
		assertEquals(result, actual);
	}
	
protected CarrierAccount getCarrierAccount() {
		
		CarrierAccount account = new CarrierAccount();
		account.setAccountNumber("123ABC");
		account.setCarrierName("FreightmateCourierCo");
		account.setDigits(10);
		account.setLastUsedIndex(19604L);
		account.setRangeStart(19000L);
		account.setRangeEnd(20000L);
		return account;
	}
	
	
	
}
