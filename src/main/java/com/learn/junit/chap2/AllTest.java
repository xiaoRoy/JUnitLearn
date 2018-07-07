package com.learn.junit.chap2;

import com.learn.junit.chap1.CalculatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {CalculatorTest.class})
public class AllTest {
}
