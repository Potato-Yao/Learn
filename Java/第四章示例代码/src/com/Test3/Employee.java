package com.Test3;

import java.time.LocalDate;

/**
 * @author 碳烤黄蜂
 */

public class Employee
{
	private static int nextId;

	private int id;
	private String name;
	private double salary;

	/**
	 * @deprecated 这就是初始化块
	 */
	{
		id = nextId;
		nextId++;
	}

	/**
	 * @deprecated 初始化
	 */
	public Employee()
	{
		name = "";
		salary = 0;
	}

	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
}
