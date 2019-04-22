package com.jenkinstest.jenkinstest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	final static App app = new App();
	final static int a = 23, b = 27;

	@Test
	public void testAdd() {
		assertEquals(50, app.add(a, b));
	}

	@Test
	public void testSub() {
		assertEquals(-4, app.sub(a, b));
	}

	@Test
	public void testDiv() {
		assertEquals(1, app.div(b, a));
	}

}
