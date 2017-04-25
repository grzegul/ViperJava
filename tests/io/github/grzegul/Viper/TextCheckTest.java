package io.github.grzegul.Viper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TextCheckTest {
	
	private Program classUnderTest;
	
	@Before
	public void setUp() throws Exception{
		classUnderTest = new Program();
	}
	
	@Test
	public void textIsNotPresentTest() {
		String result = null;
		assertEquals(result, classUnderTest.insertText(null));
	}
	@Test
	public void textIsPresentTest() {
		String result = null;
		assertNotEquals(result, classUnderTest.insertText("Hello"));
	}
	

}
