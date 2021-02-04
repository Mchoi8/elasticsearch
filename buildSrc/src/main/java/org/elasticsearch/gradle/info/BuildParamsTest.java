package org.elasticsearch.gradle.info;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuildParamsTest {

	@Test
	void test1() {
		BuildParams bp = new BuildParams();
		
		String pname = bp.propertyName("");
		
		assertTrue(pname.equals(""));
	}

	@Test
	void test2() {
		BuildParams bp = new BuildParams();
		String pname = bp.propertyName("sdahklfasdlkjfhewuicvbnxklvzghieubveklnmbzsdlfhddd");
		
		assertTrue(pname.equals("sdah"));
	}
	
	@Test
	void test3() {
		BuildParams bp = new BuildParams();
				
		String pname = bp.propertyName("&*^%^&*#%^&#Q@");
		
		assertTrue(pname.equals(""));	}
	
	
	@Test
	void test4() {
		BuildParams bp = new BuildParams();
				
		String pname = bp.propertyName("");
		
		assertTrue(pname.equals(""));	}

	
}
