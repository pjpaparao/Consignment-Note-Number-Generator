package com.consignment.model;


public class CarrierAccount {
	
	private String carrierName;
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Integer getDigits() {
		return digits;
	}
	public void setDigits(Integer digits) {
		this.digits = digits;
	}
	public Long getLastUsedIndex() {
		return lastUsedIndex;
	}
	public void setLastUsedIndex(Long lastUsedIndex) {
		this.lastUsedIndex = lastUsedIndex;
	}
	public Long getRangeStart() {
		return rangeStart;
	}
	public void setRangeStart(Long rangeStart) {
		this.rangeStart = rangeStart;
	}
	public Long getRangeEnd() {
		return rangeEnd;
	}
	public void setRangeEnd(Long rangeEnd) {
		this.rangeEnd = rangeEnd;
	}
	private String accountNumber;
	private Integer digits;
	private Long lastUsedIndex;
	private Long rangeStart;
	private Long rangeEnd;
}

