package com.mx.interview.question8;

import java.util.ArrayList;

public class TestAccount {

	public static void main(String[] args) {

		ArrayList<Account> ls = new ArrayList<Account>();

		ls.add(new Account(12, 13, "César"));
		ls.add(new Account(1, 17, "Julio"));
		ls.add(new Account(1, 17, "Pedro"));

		for (Account account : ls) {

			System.out.println(account.toString());

		}

	}

}
