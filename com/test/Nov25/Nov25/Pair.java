package com.test.Nov25.Nov25;

public class Pair<K,V> {

	
	private K key;
	private V value;

	public Pair() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
	
}
