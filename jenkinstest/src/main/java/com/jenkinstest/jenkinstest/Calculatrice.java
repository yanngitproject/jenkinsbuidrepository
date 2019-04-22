package com.jenkinstest.jenkinstest;

public interface Calculatrice {
	
	public int add(int a, int b);
	public int sub(int a , int b);
	public int div(int a, int b);
	public static int mul(int a , int b){
		return  a*b;
	}
	

}
