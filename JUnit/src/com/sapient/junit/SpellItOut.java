package com.sapient.junit;

public class SpellItOut {
	int numToSpell;
	int million = 1000000;
	
	
	private String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private String[] teens = { "", "eleven", "twelve", "thirteen", "fourteen",
			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	private String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	private String[] thousandsPlus = { "hundred", "thousand", "million" };
	
	public SpellItOut (int numToSpell) {
		this.numToSpell = numToSpell;
		checkNumDigits();
	}
	
	public int checkNumDigits(){
		if (numToSpell == 0){
			return 1;
		} 
		return (int)(Math.log10(numToSpell)+1);
	}
	public String convertedString() {
		String result = "";
		if (numToSpell == 0){
			return "zero";
		}
		if (checkNumDigits() > 0 && (numToSpell%10 != 0 || numToSpell == 0)){
			result = getOnes();
		}
		if (checkNumDigits() > 1 && (numToSpell>19 || numToSpell == 10) ){
			if (numToSpell%10 != 0){
				result = getTens()+"-"+result;
			} else {
				result = getTens()+result;
			}
		}
		if (checkNumDigits() > 2 && numToSpell%1000 != 0){
			if (numToSpell%100 != 0){
				result = getHundreds()+ " " + result;
			} else {
				result = getHundreds() + result;
			}
		}
		if (checkNumDigits() > 3 && numToSpell%10000 != 0){
			if (numToSpell%1000 != 0){
				result = getThousands()+ " " + result;
			} else {
				result = getThousands() + result;
			}
		}
		
		return result;
	}
	
	public String getOnes() {
		if (numToSpell<20 && numToSpell>9){
			String numString = "" + numToSpell;
			String result = numString.substring(checkNumDigits()-1,checkNumDigits());	
			int resultToNum = Integer.parseInt(result);
			return teens[resultToNum];
		}
		String numString = "" + numToSpell;
		String result = numString.substring(checkNumDigits()-1,checkNumDigits());	
		int resultToNum = Integer.parseInt(result);
		return ones[resultToNum];
	}
	
	public String getTens() {
		String numString = "" + numToSpell;
		String result = numString.substring(checkNumDigits()-2,checkNumDigits()-1);	
		int resultToNum = Integer.parseInt(result);
		return tens[resultToNum];
	}
	
	public String getHundreds() {
		String numString = "" + numToSpell;
		String result = numString.substring(checkNumDigits()-3,checkNumDigits()-2);	
		int resultToNum = Integer.parseInt(result);
		return ones[resultToNum] + " hundred";
	}
	
	public String getThousands() {
		String numString = "" + numToSpell;
		String result = numString.substring(checkNumDigits()-4,checkNumDigits()-3);	
		int resultToNum = Integer.parseInt(result);
		return ones[resultToNum] + " thousand";
	}
	
	public String getTenThousands() {
		
		String numString = "" + numToSpell;
		String result = numString.substring(checkNumDigits()-5,checkNumDigits()-4);	
		int resultToNum = Integer.parseInt(result);
		return tens[resultToNum] + " thousand";
	}
	
}
