package io.github.grzegul.Viper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TextFileTest {
	
	private Program classUnderTest;
	
	@Before
	public void setUp() throws Exception{
		classUnderTest = new Program();
	}
	
	@Test
	public void noTextinFileTest() {
		String result = null;
		assertFalse(result == classUnderTest.insertText(null));
	}
	
	

}
