package com.practice.privatemodifier;

public class PrivateAccessModifierDemo {

	public static void main(String[] args) {
		PrivateAccessModifier modifier = new PrivateAccessModifier();
		//modifier.methodA(); //here throwing error as The method methodA() from the type PrivateAccessSpecifier is not visible
		                     // as it is define with Private access specifire
	}

}
