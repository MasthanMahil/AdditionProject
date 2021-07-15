package com.example.Addition.Entity;

import org.springframework.stereotype.Component;

@Component
public class Addition {
	
	private long num1;
	private long num2;
	
	public long getNum2() {
		return num2;
	}
	public void setNum2(long num2) {
		this.num2 = num2;
	}
	public long getNum1() {
		return num1;
	}
	public void setNum1(long num1) {
		this.num1 = num1;
	}
	
	public long Numbers() {
		return num1+num2;
	}

}
