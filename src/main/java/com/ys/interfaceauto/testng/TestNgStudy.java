package com.ys.interfaceauto.testng;


import org.testng.annotations.*;

public class TestNgStudy {

    @Test
    public void testMethod(){
        System.out.println("@Test：这是测试方法");
    }

    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("@BeforeMethod：这是测试方法运行之前的方法");
    }

    @AfterMethod
    public void testAfterMethod(){
        System.out.println("@AfterMethod：这是测试方法运行之后的方法");
    }

    @BeforeClass
    public void testBeforeClass(){
        System.out.println("@BeforeClass：这是类运行之前的方法");
    }


    @AfterClass
    public void testAfterClass(){
        System.out.println("@AfterClass：这是类运行之后的方法");
    }

}
