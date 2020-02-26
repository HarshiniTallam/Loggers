package com.epam.CleanCode;

public class Calculation {
	int principle;
	float rate;
	int days;
	Calculation(int principle, float rate, int days) {
		this.principle = principle;
		this.rate = rate;
		this.days = days;
	}
	float simpleInterest() {
		return ((principle * rate * days) / 100);
	}
	
	float compoundInterest() {
		float ans = principle * (float)Math.pow((1 + (rate / 100)), days);
		return ans;
	}
	
	
}
