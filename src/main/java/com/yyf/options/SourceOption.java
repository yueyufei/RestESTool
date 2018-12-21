package com.yyf.options;

import java.util.LinkedList;
import java.util.List;

public class SourceOption {
	List<String> fieldList = new LinkedList<>();

	public List<String> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<String> fieldList) {
		this.fieldList = fieldList;
	}

	public List<String> source(String[] fields) {
		for (String field : fields) {
			fieldList.add(field);
		}
		return fieldList;
	}

	public List<String> source(List<String> fields) {
		String[] fieldArray = fields.toArray(new String[] {});
		return source(fieldArray);
	}

	@Override
	public String toString() {
		return fieldList.toString();
	}

}
