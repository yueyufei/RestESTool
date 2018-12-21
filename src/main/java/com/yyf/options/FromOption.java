package com.yyf.options;

public class FromOption {
	private int from;

	public FromOption(int from) {
		this.from = from;
	}
	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	@Override
	public String toString() {
		return from + "";
	}

}
