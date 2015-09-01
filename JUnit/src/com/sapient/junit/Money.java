package com.sapient.junit;

public class Money {
	private int fAmount;
	private String fCurrency;
	
	public Money (int amount, String currency){
		if (amount >= 0){
			fAmount = amount;
		} else {
			fAmount = 0;
		}
		fCurrency = currency;
	}
	
	public int amount() {
		return fAmount;
	}
	
	public String currency() {
		return fCurrency;
	}

	public Money add(Money m){
		if (m.amount() >= 0  && m.currency().equals(fCurrency)){
			return new Money(amount()+m.amount(), currency());
		} else {
			return this;
		}
	}
}
