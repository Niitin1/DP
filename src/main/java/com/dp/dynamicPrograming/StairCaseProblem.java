package com.dp.dynamicPrograming;

import java.util.Scanner;

public class StairCaseProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// problem statement
		// to find all the paths, ex 4 ->0
		// 4 (1111)(211)(22)(31)(121)(112)(13)

		// without dp
		// int result = stairPath(n);
		// System.out.println("result "+result);

		// with dp
		// int stairDp= stairMem(n, new int[n+1]);
		// System.out.println("result "+stairDp);

		// with tabulation
		int tabluation = stairPathTable(n);
		System.out.println("result " + tabluation);
	}

	private static int stairPathTable(int n) {
		// TODO Auto-generated method stub
		int[] dp = new int[n + 1];
		dp[0] =1 ;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				dp[i] = dp[i - 1];
			} else if (i == 2) {
				dp[i] = dp[i - 1] + dp[i - 2];
			} else {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

			}

		}

		return dp[n];
	}

	private static int stairMem(int n, int[] is) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		}
		if (is[n] != 0) {
			return is[n];
		}
		System.out.println("calculating stair case with dp " + n);
		int f1 = stairMem(n - 1, is);
		int f2 = stairMem(n - 2, is);
		int f3 = stairMem(n - 3, is);
		int result = f1 + f2 + f3;
		is[n] = result;
		return result;
	}

	private static int stairPath(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		}
		System.out.println("calculating stair case without dp " + n);
		int f1 = stairPath(n - 1);
		int f2 = stairPath(n - 2);
		int f3 = stairPath(n - 3);
		int result = f1 + f2 + f3;
		return result;
	}

}
