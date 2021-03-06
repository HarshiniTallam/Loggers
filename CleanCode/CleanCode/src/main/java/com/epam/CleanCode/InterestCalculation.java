package com.epam.CleanCode;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestCalculation {
	
	private static final Logger LOGGER = LogManager.getLogger(InterestCalculation.class);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("Enter principle Value:");
		int principle = sc.nextInt();
		LOGGER.info("Principle value is:"+principle);
		LOGGER.info("Enter Daily Interest Rate:");
		float rate = sc.nextFloat();
		LOGGER.info("Interest is:"+rate);
		LOGGER.info("Enter number of days between payments:");
		int days = sc.nextInt();
		LOGGER.info(days+" days");
		Calculation obj = new Calculation(principle, rate, days);
		LOGGER.info("Simple Interest is:"+obj.simpleInterest());
	    LOGGER.info("Compound Interest is:"+obj.compoundInterest()+"\n");
	}

}
