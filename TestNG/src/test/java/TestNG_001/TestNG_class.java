package TestNG_001;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_class {
	@Test
	public void f() {
		System.out.println("test1");
	}

	@BeforeSuite
	public void a() {
		System.out.println("beforesuite");
	}

	@BeforeTest
	public void b() {
		System.out.println("beforetest");
	}

	@BeforeClass
	public void c() {
		System.out.println("beforeclass");
	}

	@BeforeMethod
	public void d() {
		System.out.println("beforemethod");
	}

	@Test
	public void g() {
		System.out.println("test2");
	}

	@Test
	public void e() {
		System.out.println("test3");
	}

	@AfterMethod
	public void h() {
		System.out.println("aftermethod");
	}

	@AfterTest
	public void j() {
		System.out.println("aftertest");
	}

	@AfterSuite
	public void k() {
		System.out.println("aftersuite");
	}

	@AfterClass
	public void i() {
		System.out.println("afterclass");
	}
}
