/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 05:11:49 GMT 2024
 */
package org.jinstagram.utils;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.utils.EnforceSignedRequestUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class EnforceSignedRequestUtils_ESTest extends EnforceSignedRequestUtils_ESTest_scaffolding {


@Test(timeout = 4000)
public void test0() throws Throwable {
    HashMap<String, String> hashMap0 = new HashMap<String, String>();
    // Undeclared exception!
    try {
        EnforceSignedRequestUtils.signature("", hashMap0, "");
        fail("Expecting exception: IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        // 
        // Empty key
        // 
        verifyException("javax.crypto.spec.SecretKeySpec", e);
    }
}

}
