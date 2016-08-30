package com.java.core.innerclass.privatemember;

public class OuterClass {
	int num = 175;

	class InnerClass {
		public int getNum() {
			System.out.println("This is the getnum method of the inner class");
			return num;
		}
	}
}
