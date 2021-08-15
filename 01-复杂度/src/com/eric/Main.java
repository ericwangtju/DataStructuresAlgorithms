package com.eric;

public class Main {
	
/*
 * 0 1 1 2 3 5 8 13
 */
	
	public static int fib1(int n) {
		if (n<=1) {
			return n;
		}
		// O（2^n）
		return fib1(n-1) + fib1(n-2);
	}
	
	public static int fib2(int n) {
		if (n<=1) {
			return n;
		}
		int first =0;
		int second = 1;
		// O（n）
		for (int i = 0; i < n-1; i++) {
			int sum = first+second;
			first = second;
			second = sum;
		}
		return second;
	}
	public static void main(String[] args) {
//		System.out.println(fib1(4));
	}
}

//main函数-》main方法