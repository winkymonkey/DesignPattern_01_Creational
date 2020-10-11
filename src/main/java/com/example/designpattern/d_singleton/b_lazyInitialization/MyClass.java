package com.example.designpattern.d_singleton.b_lazyInitialization;


public class MyClass {
	private static MyClass mc;
	
	private MyClass() {}
	
	public static MyClass getInstance() {
		if(mc == null) {
			mc = new MyClass();
		}
		return mc;
	}
}
