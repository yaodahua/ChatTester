/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:43:58 GMT 2024
 */
package me.gosimple.nbvcxz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import me.gosimple.nbvcxz.Nbvcxz;
import me.gosimple.nbvcxz.matching.PasswordMatcher;
import me.gosimple.nbvcxz.resources.AdjacencyGraph;
import me.gosimple.nbvcxz.resources.Configuration;
import me.gosimple.nbvcxz.resources.Dictionary;
import me.gosimple.nbvcxz.scoring.Result;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Nbvcxz_ESTest extends Nbvcxz_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test25() throws Throwable {
        Nbvcxz nbvcxz0 = new Nbvcxz();
        nbvcxz0.estimate("|ain.feeback.suggestio");
    }
    
    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SystemInUtil.addInputLine("e");
        SystemInUtil.addInputLine("e");
        SystemInUtil.addInputLine("q");
        String[] stringArray0 = new String[1];
        Nbvcxz.main(stringArray0);
        assertEquals(1, stringArray0.length);
    }
    
    @Test(timeout = 4000)
    public void test24() throws Throwable {
        Nbvcxz nbvcxz0 = new Nbvcxz();
        Configuration configuration0 = nbvcxz0.getConfiguration();
        nbvcxz0.setConfiguration(configuration0);
        assertEquals(256, (int) configuration0.getMaxLength());
    }
}
