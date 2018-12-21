package com.yyf.builders;

import java.util.HashMap;
import java.util.Map;

public class AggsBuilder {
	private Map<String, Object> Aggsmap = null;

	private AggsBuilder() {
		Aggsmap = new HashMap<>();
	}

	public AggsBuilder getAggsBUilder() {
		return new AggsBuilder();
	}

	// public AggsBuilder getAggs
}
