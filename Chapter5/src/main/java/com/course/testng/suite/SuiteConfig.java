package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.SocketTimeoutException;

/**
 * @program: AutoTest
 * @description:
 * @author: MickelWu
 * @create: 2020-03-27 15:14
 **/

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suite");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suite");
    }
}
