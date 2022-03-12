package com.BankingApp;

import java.util.Scanner;

public class Banking {

	public int balance;
	public int transaction;
	public String name;
	public String id;
	public int amount;

	Banking(String cname, String cid) {
		name = cname;
		id = cid;

	}

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			transaction = amount;
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			transaction = -amount;

		}
	}

	void transfer(int amount) {

		withdraw(amount);
		deposit(amount);
		balance = balance - amount;
		transaction = amount;
	}

	void getTransaction() {
		if (transaction > 0) {
			System.out.println("Deposited:" + transaction);
		} else if (transaction < 0) {
			System.out.println("Withdrawn:" + Math.abs(transaction));
		}

		else {
			System.out.println("No transaction occur");
		}
	}

	public void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome" + name);
		System.out.println("Your Id is " + id);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Transfer");

		System.out.println("E. Transaction");
		System.out.println("F. Exit");

		do {

			System.out.println("=============================================================");
			System.out.println("Enter an option");
			System.out.println("=============================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");

			switch (option) {
			case 'A':
				System.out.println("=============================================================");
				System.out.println("Balance =" + balance);
				System.out.println("=============================================================");
				System.out.println("\n");
				break;

			case 'B':
				System.out.println("=============================================================");
				System.out.println("Enter an amount to deposit:");
				System.out.println("=============================================================");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;

			case 'C':
				System.out.println("=============================================================");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("=============================================================");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;

			case 'D':
				System.out.println("=============================================================");
				System.out.println("Enter an amount to transfer:");
				System.out.println("=============================================================");
				int amount3 = scanner.nextInt();
				transfer(amount3);
				System.out.println("Amount tranfered succesfuly");

				System.out.println("\n");
				break;

			case 'E':
				System.out.println("=============================================================");
				getTransaction();
				System.out.println("=============================================================");
				System.out.println("\n");
				break;

			case 'F':
				System.out.println("=============================================================");
				break;

			default:
				System.out.println("Invalid option! Please emter again");
				break;
			}

		} while (option != 'E');
		System.out.println("Thank you!");
	}

}
