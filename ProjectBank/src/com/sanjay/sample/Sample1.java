package com.sanjay.sample;

public class Sample1 {
	int field1;
	String name1;
	public int getField1() {
		return field1;
	}
	public void setField1(int field1) {
		this.field1 = field1;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	@Override
	public String toString() {
		return "Sample1 [field1=" + field1 + ", name1=" + name1 + "]";
	}
	
	public static void Main(String[] args) {
		Sample1 s1 = new Sample1();
		System.out.println(s1);
		
	}
	

}
