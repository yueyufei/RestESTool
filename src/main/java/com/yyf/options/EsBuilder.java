package com.yyf.options;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.yyf.utils.EsRootOptions;

public class EsBuilder {
	private Map<EsRootOptions, Object> builder = new HashMap<>();

	public EsBuilder CreteBuilder() {
		return null;
	}

	public EsBuilder addSource(String... fields) {
		List<String> fieldList = new LinkedList<>();
		for (String field : fields) {
			fieldList.add(field);
		}
		builder.put(EsRootOptions._source, fieldList);
		return null;
	}

	public EsBuilder addFrom(Integer from) {
		builder.put(EsRootOptions.form, from);
		return null;
	}

	public EsBuilder addSize(Integer size) {
		builder.put(EsRootOptions.size, size);
		return null;
	}

	public static void main(String[] args) {

	}
}
