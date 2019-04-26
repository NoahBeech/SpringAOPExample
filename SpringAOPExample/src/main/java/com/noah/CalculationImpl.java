package com.noah;

import java.math.BigInteger;

public class CalculationImpl implements Calculation {

	public BigInteger calc(int iterations) {
		BigInteger value1 = BigInteger.ONE, value2 = BigInteger.ONE;
		for(int i = 0; i < iterations; i++)
		{
			BigInteger v = value1.add(value2);
			value1 = value2;
			value2 = v;
		}
		
		return value2;
	}
	


}
