package test;

import org.testng.annotations.Test;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testoutput {
	
	@Test
	 public void TestCase1() {
	 System.out.println("First Test Case 1-------Test Case1--@Test ");
	 }
	 // Test case 2
	/* @Test
	 public void TestCase2() {
	 System.out.println("Second Test Case 2-------Test Case2");
	 }*/
	 @BeforeMethod
	 public void beforeMethod() {
	 System.out.println(" @BeforeMethod");
	 }
	 @AfterMethod
	 public void afterMethod() {
	 System.out.println(" @AfterMethod ");
	 }
	 @BeforeTest
	 public void BeforeTest() {
	 System.out.println(" @BeforeTest ");
	 }
	 @AfterTest
	 public void AfterTest() {
	 System.out.println(" @AfterTest");
	 }
	 @BeforeSuite
	 public void BeforeSuite() {
	 System.out.println("	@BeforeSuite ");
	 }
	 @AfterSuite
	 public void AfterSuite() {
	 System.out.println(" @AfterSuite");
	 }
	 @BeforeClass
	 public void BeforeClass() {
		 System.out.println(" @BeforeClass");
	 }
	@AfterClass
	 public void AfterClass() {
		 System.out.println(" 	@AfterClass");
	}
	@BeforeGroups
	public void BeforeGroup() {
		 System.out.println(" @BeforeGroups");
		 
	}
	@AfterGroups
	public void AfterGroups() {
		 System.out.println("@AfterGroups");
	 }
}
