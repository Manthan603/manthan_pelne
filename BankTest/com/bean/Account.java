package com.bean;

public class Account
{

	private int accno=0;
	private String name=null;
	private float amount=0.0f;

	public Account( int accno, String name, float amount)
	{
		this.accno = accno;
		this.name = name;
		this.amount = amount;
	}


	public void setAccno(int accno)
	{
		this.accno = accno;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAmount(float amount)
	{
		this.amount = amount;
	}

	public int getAccno()
	{
		return accno;
	}
	public String getName()
	{
		return name;
	}
	public float getAmount()
	{
			return amount;
	}

}

