package com.cdk.bill.calculator.service.impl;

import static com.cdk.bill.calculator.util.DiscountUtil.getDiscountAmout;

import com.cdk.bill.calculator.service.BillService;
import com.cdk.bill.calculator.util.CustomerType;

public class BillServiceImpl implements BillService {

	@Override
	public float calculateBill(String customerType, float purchaseAmount) {
		return purchaseAmount > 0? purchaseAmount - getDiscountAmout(CustomerType.valueOf(customerType), purchaseAmount) : 0f;
	}

}
