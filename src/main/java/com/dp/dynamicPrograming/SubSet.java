package com.dp.dynamicPrograming;

import java.util.Scanner;

public class SubSet {

	public static void main(String[] args) {
		// problem statement
		// Given array, and a number to find the subset from the array to find the
		// number

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] oA = new int[n];

		for (int i = 0; i < n; i++) {
			oA[i] = scan.nextInt();
		}
		int total = scan.nextInt();
		boolean[][] dp = new boolean[n + 1][total + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if (i == 0 && j == 0) {
					// first cell
					dp[i][j] = true;
				} else if (i == 0) {
					// first row
					dp[i][j] = false;
				} else if (j == 0) {
					// first column of all rows
					dp[i][j] = true;
				} else {
					// all other cases
					if (dp[i - 1][j] == true) {
						dp[i][j] = dp[i - 1][j];
					} else {
						int val = oA[i - 1];
						if (j >= val) {
							if (dp[i - 1][j - val]) {
								dp[i][j] = true;
							}
						}
					}
				}

			}
			System.out.println(dp[oA.length][total]);
		}
	}

}
