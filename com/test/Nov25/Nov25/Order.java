package com.test.Nov25.Nov25;

public class Order<T> {

	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public Order(T item) {
		super();
		this.item = item;
	}

	@Override
	public String toString() {
		return "Order [item=" + item + "]";
	}
}
