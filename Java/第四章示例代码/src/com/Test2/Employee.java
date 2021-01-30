package com.Test2;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author 碳烤黄蜂
 */

public class Employee
{
	public static void main(String[] args)
	{
		var potato = new Employee("Potato Yao",100000,2006,2,19);

		System.out.println(potato.getSalary());

		tripleSalary(potato);

		System.out.println(potato.getSalary());
	}

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
	}

	public static void tripleSalary(Employee x)
	{
		x.raiseSalary(200);
	}
}
