package com.cdk.bill.calculator;

import org.junit.Assert;
import org.junit.Test;

import com.cdk.bill.calculator.service.BillService;
import com.cdk.bill.calculator.service.impl.BillServiceImpl;
import com.cdk.bill.calculator.util.CustomerType;

public class CustomerRegular {
	
	private BillService BillService = new BillServiceImpl(); 

	@Test
	public void test5000() {
		float bill = BillService.calculateBill(CustomerType.Regular.name(), 5000);
		Assert.assertTrue(bill == 5000);
	}
	
	@Test
	public void test10000() {
		float bill = BillService.calculateBill(CustomerType.Regular.name(), 10000);
		Assert.assertTrue(bill == 9500);
	}
	
	@Test
	public void test15000() {
		float bill = BillService.calculateBill(CustomerType.Regular.name(), 15000);
		Assert.assertTrue(bill == 13500);
	}
	
}
