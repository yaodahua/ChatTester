/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:09:27 GMT 2024
 */
package technology.tabula;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Ruling;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Ruling_ESTest extends Ruling_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        LinkedList<Ruling> linkedList0 = new LinkedList<Ruling>();
        List<Ruling> list0 = Ruling.collapseOrientedRulings((List<Ruling>) linkedList0);
        assertTrue(list0.isEmpty());
    }
}
