package com.Test1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author 碳烤黄蜂
 */

public class Employee
{
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String n, double s, int year, int mouth, int day)
	{
		Objects.requireNonNull(n, "The name cannot be null");
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, mouth, day);
	}
	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public LocalDate getHireDay()
	{
		return hireDay;
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
		/*
		Also can:
		<code>
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
		</code>
		 */
	}

}
