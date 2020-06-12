package com.mn.test;

import com.mn.model.CalCulator;

public class Test {

	public static void main(String[] args) {
		
		CalCulator c=new CalCulator();
		
		int result=c.add(10, 20);
		System.out.println(result);
		double d=c.div(10, 2);
		System.out.println(d);
	}
	
	
}
