package com.dp.dynamicPrograming;

import java.util.Scanner;

public class Fab {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//cal fab without dynamic programing
	//	int result = fabResult(n);
//		System.out.println(result);
		
		//cal fab with dynamic programing
		int fabDp= fabMem(n,new int[n+1]);
		System.out.println(fabDp);

	}

	private static int fabMem(int n, int[] qp) {
		// TODO Auto-generated method stub
		
		//use the array to remember the result , so we cannot cal. its fab again and again
		
		if(n==0 || n== 1) {
			return n;
		}
		if(qp[n]!=0) {
			// to return the value from array , which stored the fab of that number
			return qp[n];
		}
		System.out.println("calculating fab with dp "+n);
		int fab1 = fabMem(n-1, qp);
		int fab2=fabMem(n-2,qp);
		int febM= fab1+fab2;
		qp[n]=febM;
		
		return febM;
	}

	private static int fabResult(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n== 1) {
			return n;
		}
		
		//as we can see we are calculating the fab of one number at multiple times.
		// bad coding 
		System.out.println("calculating fab without dp "+n);
		int fab1= fabResult(n-1);
		int fab2= fabResult(n-2);
		int result = fab1+fab2;
		return result;
	}

}
