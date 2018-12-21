package com.yyf.builders;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.yyf.options.FromOption;
import com.yyf.options.SizeOption;
import com.yyf.utils.EsRootOptions;

public class RootBuilder {
	private Map<EsRootOptions, Object> rootBuilder = null;
	Gson gson = new Gson();

	private RootBuilder() {
		rootBuilder = new HashMap<>();
	}

	public static RootBuilder getBuilder() {
		return new RootBuilder();
	}

	public RootBuilder from(int from) {
		FromOption fromOption = new FromOption(from);
		rootBuilder.put(EsRootOptions.form, fromOption.getFrom());
		return this;
	}

	public RootBuilder size(int size) {
		SizeOption sizeOption = new SizeOption(size);
		rootBuilder.put(EsRootOptions.size, sizeOption.getSize());
		return this;
	}

	public RootBuilder aggs(AggsBuilder aggs) {
		rootBuilder.put(EsRootOptions.aggs, aggs);
		return this;
	}

	public RootBuilder query(QueryBuilder query) {
		// TODO
		rootBuilder.put(EsRootOptions.query, query);
		return this;
	}

	public RootBuilder source(Sourcebuilder source) {
		rootBuilder.put(EsRootOptions._source, source.getSourceOption().getFieldList());
		return this;
	}
	public static void main(String[] args) {
		RootBuilder builder = RootBuilder.getBuilder();
		RootBuilder from = builder.from(0).size(20).source(new Sourcebuilder("123haha", "456"));
		String string = from.rootBuilder.toString();
		Gson gson = new Gson();
		String json = gson.toJson(from.rootBuilder);
		System.out.println(json);
	}

}
