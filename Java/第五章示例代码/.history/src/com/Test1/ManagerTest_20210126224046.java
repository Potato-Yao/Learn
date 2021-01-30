package com.Test1;

/**
 * @author 碳烤黄蜂
 */

public class ManagerTest
{
	public static void main(String[] args)
	{
		var boss = new Manager("Bee Wang",100000,2005,8,15);
		boss.setBonus(50000);

		var staff = new Employee[4];

		staff[0] = boss;
		staff[1] = new Employee("Potato Yao",60000,2006,2,19);
		staff[2] = new Employee("Sansan Jin",60000,2006,9,17);
		staff[3] = new Employee("Tomato Wa",60000,2006,10,31);

		

		/*
		for (Employee e : staff)
		{
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		}
		 */
	}
}
