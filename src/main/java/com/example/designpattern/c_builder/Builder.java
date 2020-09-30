package com.example.designpattern.c_builder;


public interface Builder {
	public void step1();
	public void step2();
	
	public Product build();
}
