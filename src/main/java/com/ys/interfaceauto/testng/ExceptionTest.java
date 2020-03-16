package com.ys.interfaceauto.testng;

import org.testng.annotations.Test;

/**
 * 期待异常测试：
 * 当我们期望某个方法运行结果是某个异常时，通过下面注解来测试
 */
public class ExceptionTest {

    @Test(expectedExceptions = ArithmeticException.class)
    public void testA(){
        int i = 1/0;
        System.out.println(i);
    }
}
