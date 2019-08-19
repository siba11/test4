package tests;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import testUtil.TestUtil;

public class Login1 extends TestBase{
	@Before
	public void beforTest() throws IOException {
		initialize();
		
	}
	@Test
	public void loginTest() {
		driver.get(CONFIG.getProperty("url"));
	TestUtil.doLogin((OR.getProperty("username")),(OR.getProperty("password")));
		
	}
	@After
	public void TestEnd() {
		driver.quit();
	}
}
