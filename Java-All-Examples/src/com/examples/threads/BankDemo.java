package com.examples.threads;

class Bank {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		notify();
	}
}

class Withdraw implements Runnable {
	Bank bank;

	Withdraw(Bank bank) {
		this.bank = bank;
		new Thread(this).start();
	}

	public void run() {
		bank.withdraw(15000);
	}

}

class Deposit implements Runnable {
	Bank bank;

	Deposit(Bank bank) {
		this.bank = bank;
		new Thread(this).start();
	}

	public void run() {
		bank.deposit(10000);
	}

}

class BankDemo {
	public static void main(String args[]) {
		Bank bank = new Bank();
		new Withdraw(bank);
		new Deposit(bank);
	}
}