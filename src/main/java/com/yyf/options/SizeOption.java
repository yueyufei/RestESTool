package com.yyf.options;

public class SizeOption {
	private int size;

	public SizeOption(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return size + "";
	}

}
