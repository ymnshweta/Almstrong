package com.aa;

public class Almstrong_Number {
public static void main(String[] args) {
	int n=153;
	int sum=0;
	int t=n;
	while(n>0) {
		int r=n%10;
		n=n/10;
		sum=sum+(r*r*r);
	}
	if(sum==t) {
		System.out.println("its almstrong:"+t);
	}else {
		System.out.println("its  not almstrong:"+t);

	}
}
}
