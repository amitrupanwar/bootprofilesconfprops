package com.prac.model;

public class Item {
	private String type;
	private String desc;
	private long cost;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Item [type=" + type + ", desc=" + desc + ", cost=" + cost + "]";
	}

}
