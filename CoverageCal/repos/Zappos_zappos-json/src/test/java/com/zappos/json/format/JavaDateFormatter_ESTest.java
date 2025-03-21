/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:35:46 GMT 2024
 */
package com.zappos.json.format;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.JavaDateFormatter;
import com.zappos.json.format.ValueFormatter;
import java.text.ParseException;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class JavaDateFormatter_ESTest extends JavaDateFormatter_ESTest_scaffolding {


@Test(timeout = 4000)
public void test10() throws Throwable {
    JavaDateFormatter javaDateFormatter0 = new JavaDateFormatter();
    ValueFormatter<Date> valueFormatter0 = javaDateFormatter0.newInstance();
    assertNotSame(javaDateFormatter0, valueFormatter0);
}


@Test(timeout = 4000)
public void test03() throws Throwable {
    JavaDateFormatter javaDateFormatter0 = new JavaDateFormatter();
    javaDateFormatter0.setPattern("r32");
    ZapposJson zapposJson0 = ZapposJson.getInstance("r32");
    try {
        javaDateFormatter0.parse(zapposJson0, "r32");
        fail("Expecting exception: IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        // 
        // Illegal pattern character 'r'
        // 
        verifyException("java.text.SimpleDateFormat", e);
    }
}


@Test(timeout = 4000)
public void test04() throws Throwable {
    JavaDateFormatter javaDateFormatter0 = new JavaDateFormatter();
    // Undeclared exception!
    try {
        javaDateFormatter0.format((ZapposJson) null, (Date) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("com.zappos.json.format.JavaDateFormatter", e);
    }
}


@Test(timeout = 4000)
public void test05() throws Throwable {
    JavaDateFormatter javaDateFormatter0 = new JavaDateFormatter();
    Object object0 = new Object();
    // Undeclared exception!
    try {
        javaDateFormatter0.cast(object0);
        fail("Expecting exception: ClassCastException");
    } catch (ClassCastException e) {
    }
}

}
