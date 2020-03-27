package com.tester.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @program: AutoTest
 * @description:
 * @author: MickelWu
 * @create: 2020-03-27 17:06
 **/

public class testMethodDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","bbb");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是自己写的日志");
        throw new  RuntimeException("自己跑的异常");
    }
}
