package com.java.core.innerclass.privatemember;

public class ClassDemo {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.getNum();
	}
}
