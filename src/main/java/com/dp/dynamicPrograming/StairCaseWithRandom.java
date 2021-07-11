package com.dp.dynamicPrograming;

import java.util.Scanner;

public class StairCaseWithRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		 //problem statement: suppose u have to move from 5->0
		// from 5th position you can move only 1
		// from 4th position , you can move 2(given) 4->5, 4->6(its not acceptable as out of size)
		// from 3rd , you can move 2(given), 3->4,3->5, so total count (1+1, for4->5(1),total count =3)
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int []dp= new int[n+1];
		dp[n]=1;
		for(int i=n-1;i>=0;i--) {
			for(int j=1; j<=arr[i] && i+ j<dp.length ;j++) {
				dp[i] += dp[i+j];
				
			}
		}
		System.out.println("result "+ dp[0]);
		
	}

}
