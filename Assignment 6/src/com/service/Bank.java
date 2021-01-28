package com.service;

public interface Bank
{
	void withdraw(int accno, float ammount);
	void deposit(int accno, float ammount);
	void checkBalance(int accno);
}
