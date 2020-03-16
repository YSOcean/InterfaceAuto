package com.ys.interfaceauto.testng;

import org.testng.annotations.Test;

/**
 * 依赖测试：
 * 比如后一个方法要依赖前一个方法，换句话说，前一个方法运行成功后了，后面方法才会运行
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2");
    }
}
