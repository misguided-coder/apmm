package com.example;

important org.junit.runner.RunWith;
important org.junit.runners.Suite;
important org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	PayrollServiceTest.class, 
	ShoppingServiceTest.class 
	})
public class AllTests {

}
	