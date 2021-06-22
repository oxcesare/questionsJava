package com.mx.interview.question12;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {

		List<Integer> individualPlayScore = new ArrayList<Integer>();
		individualPlayScore.add(2);
		individualPlayScore.add(3);
		individualPlayScore.add(7);
		
		
		int finalScore=12;
		
		int  numberOfCombinations=  numCombinationsForFinalScore(finalScore, individualPlayScore);
		
		System.out.println("numberOfCombinations : " + " " +  numberOfCombinations);
		
		
	}

	public static int numCombinationsForFinalScore(int finalScore, List<Integer> individualPlayScore) {

		int[][] numCombinationsForScore = new int[individualPlayScore.size()][finalScore + 1];

		for (int i = 0; i < numCombinationsForScore.length; i++) {

			numCombinationsForScore[i][0] = 1;

			for (int j = 1; j <= finalScore; j++) {
				int withoutThisPlay = i - 1 > 0 ? numCombinationsForScore[i - 1][j] : 0;

				int withThisPlay = j >= individualPlayScore.get(i)
						? numCombinationsForScore[i][j - individualPlayScore.get(i)]
						: 0;

				numCombinationsForScore[i][j] = withoutThisPlay + withThisPlay;

			}

		}

		return numCombinationsForScore[individualPlayScore.size() - 1][finalScore];

	}

}
