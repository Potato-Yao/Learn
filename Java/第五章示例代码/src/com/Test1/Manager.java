package com.Test1;

/**
 * @author 碳烤黄蜂
 */

public class Manager extends Employee
{

	private double bonus;

	public Manager(String n, double s, int year, int mouth, int day)
	{
		super(n, s, year, mouth, day);
		bonus = 0;
	}

	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
}
