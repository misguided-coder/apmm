package com.example;

import com.example.exception.InvalidSalaryException;

public class PayrollService{

	public double hra(double salary) throws InvalidSalaryException{
		if(salary <= 0) {
			throw new InvalidSalaryException("Salary can not be zero or lesser!!!!!");
		}
		return salary*.60;
	}


	/**
	 * Done.
	 * @param salary
	 * @return
	 * @throws InvalidSalaryException
	 */
	public double da(final double salary) throws InvalidSalaryException {
		if(salary <= 0) {
			throw new InvalidSalaryException("Salary can not be zero or lesser!!!!!");
		}
		return salary*.10;
	}

}