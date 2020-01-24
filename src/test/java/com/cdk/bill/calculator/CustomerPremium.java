package com.cdk.bill.calculator;

import org.junit.Assert;
import org.junit.Test;

import com.cdk.bill.calculator.service.BillService;
import com.cdk.bill.calculator.service.impl.BillServiceImpl;
import com.cdk.bill.calculator.util.CustomerType;

public class CustomerPremium {
	
	private BillService BillService = new BillServiceImpl(); 

	@Test
	public void test4000() {
		float bill = BillService.calculateBill(CustomerType.Premium.name(), 4000);
		Assert.assertTrue(bill == 3600);
	}
	
	@Test
	public void test8000() {
		float bill = BillService.calculateBill(CustomerType.Premium.name(), 8000);
		Assert.assertTrue(bill == 7000);
	}
	
	@Test
	public void test12000() {
		float bill = BillService.calculateBill(CustomerType.Premium.name(), 12000);
		Assert.assertTrue(bill == 10200);
	}
	
	@Test
	public void test20000() {
		float bill = BillService.calculateBill(CustomerType.Premium.name(), 20000);
		Assert.assertTrue(bill == 15800);
	}
	
}
