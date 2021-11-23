package com.practice.publicmodifier;

import com.practice.protectedmodifier.ProtectedAccessModifier;

class PublicAccessModifierDemo {

	public static void main(String[] args) {
		
		PublicAccessModifier modifier = new PublicAccessModifier();
		modifier.methodA();//public method can be used anywhere
		
		ProtectedAccessModifier modifier2 = new ProtectedAccessModifier();
		//modifier2.methodProtected();//protected method cannot be used outside package.
	}

}
