/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:50:55 GMT 2024
 */
package org.jinstagram.entity.common;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Pagination;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Pagination_ESTest extends Pagination_ESTest_scaffolding {


@Test(timeout = 4000)
public void test08() throws Throwable {
    Pagination pagination0 = new Pagination();
    pagination0.setNextCursor("");
    String string0 = pagination0.getNextCursor();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test12() throws Throwable {
    Pagination pagination0 = new Pagination();
    pagination0.setDepreciationWarning("");
    String string0 = pagination0.getDepreciationWarning();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test01() throws Throwable {
    Pagination pagination0 = new Pagination();
    pagination0.setNextUrl("");
    String string0 = pagination0.getNextUrl();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test03() throws Throwable {
    Pagination pagination0 = new Pagination();
    pagination0.setNextMinId("");
    String string0 = pagination0.getNextMinId();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test10() throws Throwable {
    Pagination pagination0 = new Pagination();
    pagination0.setMinTagId("");
    String string0 = pagination0.getMinTagId();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test15() throws Throwable {
    Pagination pagination0 = new Pagination();
    pagination0.setNextMaxId("Pagination [depreciationWarning=%s, minTagId=%s, nextMaxId=%s, nextMaxTagId=%s, nextMinId=%s, nextUrl=%s]");
    String string0 = pagination0.getNextMaxId();
    assertEquals("Pagination [depreciationWarning=%s, minTagId=%s, nextMaxId=%s, nextMaxTagId=%s, nextMinId=%s, nextUrl=%s]", string0);
}


// @Test(timeout = 4000)
// public void test13() throws Throwable {
//     Pagination pagination0 = new Pagination();
//     // Undeclared exception!
//     try {
//         pagination0.hasNextPage();
//         fail("Expecting exception: NoClassDefFoundError");
//     } catch (NoClassDefFoundError e) {
//         //
//         // org/apache/commons/lang3/StringUtils
//         //
//         verifyException("org.jinstagram.entity.common.Pagination", e);
//     }
// }


@Test(timeout = 4000)
public void test05() throws Throwable {
    Pagination pagination0 = new Pagination();
    pagination0.setNextMaxTagId("");
    String string0 = pagination0.getNextMaxTagId();
    assertEquals("", string0);
}


@Test(timeout = 4000)
public void test21() throws Throwable {
    Pagination pagination0 = new Pagination();
    String string0 = pagination0.toString();
    assertEquals("Pagination [depreciationWarning=null, minTagId=null, nextMaxId=null, nextMaxTagId=null, nextMinId=null, nextUrl=null]", string0);
}

}
