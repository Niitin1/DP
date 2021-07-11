package com.dp.dynamicPrograming;

import java.util.Scanner;

public class GoldMinePRo {

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

		for (int j = n; j >= 0; j--) {
			for (int i = m; i >= 0; i--) {
				if (j == m) {
					// last cell of first row
					dP[i][j] = oA[i][j];
				} else if (i == 0) {
					dP[i][j] = oA[i][j] + Math.max(dP[i + 1][j], dP[i + 1][j + 1]);
				} else if (i == n - 1) {
					dP[i][j] = oA[i][j] + Math.max(dP[i][j + 1], dP[i - 1][j + 1]);
				} else {
					int t=Math.max(dP[i][j + 1], dP[i - 1][j + 1]);
					dP[i][j] = oA[i][j] +Math.max(t , dP[i+1][j+1]);
				}

			}
		}

	}

}
