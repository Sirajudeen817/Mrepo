package com.test.Nov25.Nov25;

public class Pizza {
	@Override
	public String toString() {
		return "Builder [size=" + size + ", cheese=" + cheese + ", olives=" + olives + "]";
	}
	private String size;
	private boolean cheese;
	private boolean olives;
	
	private Pizza(Builder builder) {
		this.size=builder.size;
		this.cheese=builder.cheese;
		this.olives=builder.olives;
	}
	
	public static class Builder{
		private String size;
		private boolean cheese;
		private boolean olives;
		
		public Builder(String size) {
			this.size=size;
		}
		
		public Builder cheese(boolean value) {
			this.cheese=value;
			return this;
		}
		public Builder olives(boolean value) {
			this.olives=value;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}

		
	}

}
