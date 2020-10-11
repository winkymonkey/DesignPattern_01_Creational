package com.example.designpattern.d_singleton.a_eagerInitialization;


public class MyClass {
	private static MyClass mc = new MyClass();
	
	private MyClass() {}
	
	public static MyClass getInstance() {
		return mc;
	}
}
