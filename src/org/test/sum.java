package org.test;

public class sum {
	public static void main(String[] args) {
		int n=123;
		int a,i=0,sum=0;
		a=n;
		while(a>0) {
			i=a%10;
			sum=sum+i;
			a=a/10;
		}
		}
}
