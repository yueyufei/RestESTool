package com.yyf.builders;

import java.util.List;

import com.yyf.options.SourceOption;

public class Sourcebuilder {
	private SourceOption sourceOption = new SourceOption();

	public Sourcebuilder(String... fields) {
		sourceOption = new SourceOption();
		sourceOption.source(fields);

	}

	public Sourcebuilder(List<String> fields) {
		sourceOption.source(fields);
	}

	public SourceOption getSourceOption() {
		return sourceOption;
	}

	public void setSourceOption(SourceOption sourceOption) {
		this.sourceOption = sourceOption;
	}

	@Override
	public String toString() {
		return sourceOption.toString();
	}

}
