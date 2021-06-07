package com.mx.examen.demo.albo.response;

import java.util.ArrayList;
import java.util.List;

public class DataCharacter {

	private Integer offset;
	private Integer limit;
	private Integer total;
	private Integer count;
	private List<Results> results;

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Results> getResults() {

		if (results == null) {
			results = new ArrayList<Results>();
		}

		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

}
