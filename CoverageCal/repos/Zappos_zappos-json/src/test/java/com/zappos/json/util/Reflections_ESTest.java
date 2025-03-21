/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:11:21 GMT 2024
 */
package com.zappos.json.util;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.util.Reflections;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Reflections_ESTest extends Reflections_ESTest_scaffolding {


@Test(timeout = 4000)
public void test03() throws Throwable {
    // Undeclared exception!
    try {
        Reflections.getGenericTypes((Field) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("com.zappos.json.util.Reflections", e);
    }
}


@Test(timeout = 4000)
public void test05() throws Throwable {
    // Undeclared exception!
    try {
        Reflections.getFirstGenericType((Field) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("com.zappos.json.util.Reflections", e);
    }
}


@Test(timeout = 4000)
public void test01() throws Throwable {
    // Undeclared exception!
    try {
        Reflections.getSecondGenericType((Field) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("com.zappos.json.util.Reflections", e);
    }
}


@Test(timeout = 4000)
public void test06() throws Throwable {
    // Undeclared exception!
    try {
        Reflections.getFirstGenericParameterType((Method) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("com.zappos.json.util.Reflections", e);
    }
}


@Test(timeout = 4000)
public void test10() throws Throwable {
    Class<Annotation> class0 = Annotation.class;
    boolean boolean0 = Reflections.hasAnnotation((Field) null, class0);
    assertFalse(boolean0);
}


@Test(timeout = 4000)
public void test04() throws Throwable {
    // Undeclared exception!
    try {
        Reflections.getGenericParameterTypes((Method) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("com.zappos.json.util.Reflections", e);
    }
}


@Test(timeout = 4000)
public void test12() throws Throwable {
    Class<Annotation> class0 = Annotation.class;
    boolean boolean0 = Reflections.hasAnnotation((Method) null, (Field) null, class0);
    assertFalse(boolean0);
}


@Test(timeout = 4000)
public void test11() throws Throwable {
    Class<Annotation> class0 = Annotation.class;
    Annotation annotation0 = Reflections.getAnnotation((Method) null, (Field) null, class0);
    assertNull(annotation0);
}


@Test(timeout = 4000)
public void test13() throws Throwable {
    Class<Reflections> class0 = Reflections.class;
    Field field0 = Reflections.getField(class0, "com.zappos.json.util.Reflections");
    assertNull(field0);
}


@Test(timeout = 4000)
public void test02() throws Throwable {
    // Undeclared exception!
    try {
        Reflections.getSecondGenericParameterType((Method) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("com.zappos.json.util.Reflections", e);
    }
}


@Test(timeout = 4000)
public void test00() throws Throwable {
    boolean boolean0 = Reflections.classPresent("|B7");
    assertFalse(boolean0);
}

}
