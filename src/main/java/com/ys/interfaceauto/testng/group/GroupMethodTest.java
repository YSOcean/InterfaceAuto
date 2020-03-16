package com.ys.interfaceauto.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupMethodTest {


    @Test(groups = "group1")
    public void testGroup1(){
        System.out.println("这是group1测试方法");
    }


    @Test(groups = "group2")
    public void testGroup2(){
        System.out.println("这是group2测试方法");
    }

    @BeforeGroups("group1")
    public void beforeGroup1(){
        System.out.println("@BeforeGroups：这是group1测试方法运行之前的方法");
    }

    @AfterGroups("group1")
    public void afterGroups1(){
        System.out.println("@AfterGroups：这是group1测试方法运行之后的方法");
    }


    @BeforeGroups(groups = {"group2"})
    public void beforeGroup2(){
        System.out.println("@BeforeGroups：这是group2测试方法运行之前的方法");
    }

    @AfterGroups("group2")
    public void afterGroups2(){
        System.out.println("@AfterGroups：这是group2测试方法运行之后的方法");
    }
}
