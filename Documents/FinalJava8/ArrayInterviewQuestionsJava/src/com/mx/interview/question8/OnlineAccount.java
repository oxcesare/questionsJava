package com.mx.interview.question8;

public interface OnlineAccount {

	int basePrice = 120;
	int regularMoviePrice = 45;
	int exclusiveMoviePrice = 80;

}

class Account implements OnlineAccount, Comparable<Account> {

	int noOfRegularMovies, noOfExclusiveMovies;
	String ownerName;

	// 1) Add a parameterized constructor that initializes the attributes
	// noOfExclusiveMovies and noOfExclusiveMovies.

	public Account(int noOfRegularMovies, int noOfExclusiveMovies, String ownerName) {
		super();
		this.noOfRegularMovies = noOfRegularMovies;
		this.noOfExclusiveMovies = noOfExclusiveMovies;
		this.ownerName = ownerName;
	}

	// 2. This method returns the monthly cost for the account.
	public int monthlyCost() {

		int monthlyCost = (this.basePrice + noOfRegularMovies) * (this.regularMoviePrice + noOfExclusiveMovies)
				* this.exclusiveMoviePrice;

		return monthlyCost;

	}

	// 3. Override the compareTo method of the Comparable interface such that two
	// accounts can be compared based on their monthly cost.

	@Override
	public int compareTo(Account a) {	
		return a.monthlyCost();
	}

	// 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
	@Override
	public String toString() {
		return "Account [ownerName=" + ownerName + ", monthlyCost()=" + monthlyCost() + "]";
	}

}
