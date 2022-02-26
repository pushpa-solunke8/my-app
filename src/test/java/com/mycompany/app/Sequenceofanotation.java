package com.mycompany.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sequenceofanotation {
	@Test
	public void a() {
		System.out.println("Helo TestNG");
	}
	@Test
	public void b() {
		System.out.println("Helo TestNG");
		Assert.assertEquals(false, true);

}
}