package com.cdk.bill.calculator.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.cdk.bill.calculator.model.DiscountRange;

public class DiscountUtil {

	private static final List<DiscountRange> DISCOUNT_RANGES = new ArrayList<>();

	static {
		DISCOUNT_RANGES.add(new DiscountRange(CustomerType.Regular, 5000, 10000, 10));
		DISCOUNT_RANGES.add(new DiscountRange(CustomerType.Regular, 10000, Float.MAX_VALUE, 20));
		DISCOUNT_RANGES.add(new DiscountRange(CustomerType.Premium, 0, 4000, 10));
		DISCOUNT_RANGES.add(new DiscountRange(CustomerType.Premium, 4000, 8000, 15));
		DISCOUNT_RANGES.add(new DiscountRange(CustomerType.Premium, 8000, 12000, 20));
		DISCOUNT_RANGES.add(new DiscountRange(CustomerType.Premium, 12000, Float.MAX_VALUE, 30));
	}

	private DiscountUtil() {
	}

	public static float getDiscountAmout(CustomerType customerType, float amount) {
		float discount = 0f;
		List<DiscountRange> ranges = getCustomerTypeDiscount(customerType);
		Collections.sort(ranges);
		for (DiscountRange range : ranges) {
			if (amount > range.getFrom() && amount <= range.getTo()) {
				discount = discount + (amount - range.getFrom()) * range.getDiscount() / 100;
				amount = amount - (amount - range.getFrom());
			}
		}
		return discount;
	}

	private static List<DiscountRange> getCustomerTypeDiscount(CustomerType customerType) {
		return DISCOUNT_RANGES.stream().filter(r -> r.getCustomerType().equals(customerType)).collect(Collectors.toList());
	}

}
