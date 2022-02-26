package com.mycompany.app;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AnnotationSeq {
	@Test
	public void a() {
		System.out.println("Hello a");
	}
 	@Test
 	public void b() {
	System.out.println("Hello b");
	Assert.assertEquals(true, false);
	
}

}
