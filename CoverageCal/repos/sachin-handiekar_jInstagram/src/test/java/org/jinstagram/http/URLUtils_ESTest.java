/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:48:19 GMT 2024
 */
package org.jinstagram.http;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.http.URLUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class URLUtils_ESTest extends URLUtils_ESTest_scaffolding {


@Test(timeout = 4000)
public void test01() throws Throwable {
    String string0 = URLUtils.encodeURIComponent("");
    assertEquals("", string0);
}


// @Test(timeout = 4000)
// public void test16() throws Throwable {
//     // Undeclared exception!
//     try {
//         URLUtils.percentEncode("3hN.}:/+52^r5+fT");
//         fail("Expecting exception: NoClassDefFoundError");
//     } catch (NoClassDefFoundError e) {
//         //
//         // org/apache/commons/lang3/StringUtils
//         //
//         verifyException("org.jinstagram.utils.Preconditions", e);
//     }
// }


// @Test(timeout = 4000)
// public void test08() throws Throwable {
//     HashMap<String, String> hashMap0 = new HashMap<String, String>();
//     // Undeclared exception!
//     try {
//         URLUtils.appendParametersToQueryString("Received an invalid parameter", hashMap0);
//         fail("Expecting exception: NoClassDefFoundError");
//     } catch (NoClassDefFoundError e) {
//         //
//         // org/apache/commons/lang3/StringUtils
//         //
//         verifyException("org.jinstagram.utils.Preconditions", e);
//     }
// }


@Test(timeout = 4000)
public void test03() throws Throwable {
    // Undeclared exception!
    try {
        URLUtils.queryStringToMap("=");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
        // 
        // 0
        // 
        verifyException("org.jinstagram.http.URLUtils", e);
    }
}


@Test(timeout = 4000)
public void test15() throws Throwable {
    HashMap<String, String> hashMap0 = new HashMap<String, String>();
    // Undeclared exception!
    try {
        URLUtils.concatSortedPercentEncodedParams(hashMap0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch (StringIndexOutOfBoundsException e) {
    }
}


// @Test(timeout = 4000)
// public void test10() throws Throwable {
//     // Undeclared exception!
//     try {
//         URLUtils.formURLDecode("[cD.)i4,C~r}U5;_x$5");
//         fail("Expecting exception: NoClassDefFoundError");
//     } catch (NoClassDefFoundError e) {
//         //
//         // org/apache/commons/lang3/StringUtils
//         //
//         verifyException("org.jinstagram.utils.Preconditions", e);
//     }
// }


// @Test(timeout = 4000)
// public void test04() throws Throwable {
//     // Undeclared exception!
//     try {
//         URLUtils.formURLEncodeMap((Map<String, String>) null);
//         fail("Expecting exception: NoClassDefFoundError");
//     } catch (NoClassDefFoundError e) {
//         //
//         // org/apache/commons/lang3/StringUtils
//         //
//         verifyException("org.jinstagram.utils.Preconditions", e);
//     }
// }


@Test(timeout = 4000)
public void test05() throws Throwable {
    // Undeclared exception!
    try {
        URLUtils.decodeURIComponent((String) null);
        fail("Expecting exception: NullPointerException");
    } catch (NullPointerException e) {
        // 
        // no message in exception (getMessage() returned null)
        // 
        verifyException("java.net.URLDecoder", e);
    }
}


// @Test(timeout = 4000)
// public void test09() throws Throwable {
//     // Undeclared exception!
//     try {
//         URLUtils.formURLEncode((String) null);
//         fail("Expecting exception: NoClassDefFoundError");
//     } catch (NoClassDefFoundError e) {
//         //
//         // org/apache/commons/lang3/StringUtils
//         //
//         verifyException("org.jinstagram.utils.Preconditions", e);
//     }
// }

}
