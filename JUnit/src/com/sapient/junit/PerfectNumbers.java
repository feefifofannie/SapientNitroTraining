package com.sapient.junit;

import java.util.List;
import java.util.ArrayList;

public class PerfectNumbers {
	List<Integer> divisorList;
	int numToTest;
	
	public PerfectNumbers(int num) {
		if (num>=0){
			numToTest = num;
		} else {
			numToTest = 1;
		}
		divisorList = new ArrayList<Integer>();
	}
	
	public List<Integer> findDivisors () {
		for (int count = 1; count<numToTest; count++){
			if (numToTest%count == 0){
				divisorList.add(count);
			}
		}
		return divisorList;
	}
	
	public boolean isPerfectNumber() {
		if (sumOfDivisors(findDivisors()) == numToTest){
			return true;
		} 
		return false;
	}
	
	public int sumOfDivisors(List<Integer> div){
		int sum=0;
		for (int elementInDivisorList : div){
			sum += elementInDivisorList;
		}
		return sum;
	}
	
	public List<Integer> getDivisorList(){
		return divisorList;
	}
}
