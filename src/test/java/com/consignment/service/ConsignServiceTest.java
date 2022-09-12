package com.consignment.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.consignment.model.CarrierAccount;

@RunWith(SpringRunner.class)
public class ConsignServiceTest {
	
	@Mock
	private ConsignmentService service;
	

	@Test
	public void testCalculateCheckSum() {
		
		CarrierAccount account = getCarrierAccount();
		String fcmnumber = service.calculateCheckSum(account);
		assertNotNull(fcmnumber);
		
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
