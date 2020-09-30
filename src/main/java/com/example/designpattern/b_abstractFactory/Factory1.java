package com.example.designpattern.b_abstractFactory;


public class Factory1 implements AbstractFactory {
	public ProductA createA() {
		return new ProductA1();
	}
	public ProductB createB() {
		return new ProductB1();
	}
}
