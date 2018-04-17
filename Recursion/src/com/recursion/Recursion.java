package com.recursion;

import java.util.Scanner;

public class Recursion {
	//f(f(f(a)))  ---  a = 20
	// f(a) = 5 + a
	//f(20) = 5 +20 = 25
	//f(f(f(20))) --- f(f(25))
	
	// f(25) = 5+25 = 30
	// f(25) = 30
	// f(f(f(20)))--- f(f(25)) -- f(30)
	// f(30) = 5 + 30 = 35
	// f(f(f(20))) -- f(f(25)) -- f(30) -- 35
	public static int Summation(int n)
	{
		if( n <= 0)
		{
			return 0;
			
		}
		else
		{
			return n + Summation(n-1);
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	}

}
