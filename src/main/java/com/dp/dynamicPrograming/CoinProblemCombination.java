package com.dp.dynamicPrograming;

import java.util.Scanner;

public class CoinProblemCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given the array, find the combination of given number
		//ex 2 ,3,5 . Now sum to be calculate is 7
		//ans is 223, 25 (combination)
		// for permutation: 223,232,322.25,52
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] oA = new int[n];

		for (int i = 0; i < n; i++) {
			oA[i] = scan.nextInt();
		}

	}

}
