package com.consignment.service;

import org.springframework.stereotype.Service;

import com.consignment.model.CarrierAccount;


@Service
public class ConsignmentService {

public  String calculateCheckSum(CarrierAccount carrierAccount) {
		
		Long id = carrierAccount.getLastUsedIndex();
		Integer digits = carrierAccount.getDigits();
		Long currentIndex = id+1;
		if(currentIndex<=carrierAccount.getRangeEnd()) {
		int addZeros = digits-id.toString().length();
		String zeros = "";
		for(int i =0;i<addZeros;i++) {
			zeros=zeros+0;
		}
		String accountNumber = zeros+currentIndex.toString();
		String s = zeros+id.toString();
		String rev = new StringBuilder(s).toString();
		int oddCount=0;
		int eventCount = 0;
		
		for(int i=0;i<=rev.length()-1;i++) {
			
			int v = s.charAt(i)-'0';
			
			if(i%2==0) {
				eventCount=eventCount+v;
			}
			else {
				oddCount=oddCount+v;
			}
		}
		
		oddCount = oddCount*3;
		eventCount = eventCount*7;
		int count = eventCount+oddCount;
		int cofficient = count/10;
		
		int checkSum = (10*(cofficient+1))-count;
		
		String conNoteNumber = "FMCC"+carrierAccount.getAccountNumber()+accountNumber;
		
		return conNoteNumber+checkSum;
		}
	
	else {
		return "Current using index "+currentIndex+" is greater than "+carrierAccount.getRangeEnd();
	}
		
	}

}

