package com.ys.interfaceauto.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * 运行结果见suite.xml
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite:suite整体套件运行开始");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("@AfterSuite:suite整体套件运行结束");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest:suite每个测试类运行之前的方法");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest:suit每个测试类运行之后的方法");
    }
}
