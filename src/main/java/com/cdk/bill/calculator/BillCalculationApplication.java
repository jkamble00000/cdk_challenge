package com.cdk.bill.calculator;

import com.cdk.bill.calculator.service.BillService;
import com.cdk.bill.calculator.service.impl.BillServiceImpl;
import com.cdk.bill.calculator.util.CustomerType;

public class BillCalculationApplication {
	
	public static void main(String[] args) {
		BillService billService = new BillServiceImpl();
		float bill = billService.calculateBill(CustomerType.Regular.name(), 10000);
		System.out.println(bill);
	}
}
