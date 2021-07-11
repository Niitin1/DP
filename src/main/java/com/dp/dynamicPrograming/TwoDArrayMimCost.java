package com.dp.dynamicPrograming;

import java.util.Scanner;

public class TwoDArrayMimCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] oA = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				oA[i][j] = scan.nextInt();
			}
		}
		int[][] dP = new int[n][m];
		for (int i = dP.length - 1; i >= 0; i--) {
			for (int j = dP.length - 1; j >=0; j--) {
				if (i == dP.length - 1 && j == dP.length - 1) {
					// last cell in 2d array
					dP[i][j] = oA[i][j];

				} else if (i == dP.length - 1) {
					// last row in 2d array
					dP[i][j] = oA[i][j] + dP[i][j+1];

				} else if (j == dP.length - 1) {
					// last column in 2d array
					dP[i][j] = oA[i][j] + dP[i+1][j];

				} else {
					// all other value
					dP[i][j] = oA[i][j]+Math.min(dP[i+1][j], dP[i][j+1]);

				}

			}

		}
		System.out.println(dP[0][0]);

	}

}
