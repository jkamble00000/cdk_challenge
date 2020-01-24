package com.cdk.bill.calculator.model;

import com.cdk.bill.calculator.util.CustomerType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DiscountRange implements Comparable<DiscountRange> {
	
	private CustomerType customerType; 

	private float from;

	private float to;

	private float discount;

	@Override
	public int compareTo(DiscountRange discountRange) {
		return (int) (discountRange.getTo() - this.to);
	}

}
