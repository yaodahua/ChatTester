// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/CohenSutherlandClipping_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 09:46:24 GMT 2024
 */
package technology.tabula;
import java.awt.geom.Rectangle2D;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.CohenSutherlandClipping;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CohenSutherlandClipping_ESTest extends CohenSutherlandClipping_ESTest_scaffolding {
    @Test
    public void testSetClip() {
        // Create a new instance of CohenSutherlandClipping
        CohenSutherlandClipping clipping = new CohenSutherlandClipping();

        // Create a Rectangle2D object for testing
        Rectangle2D clipWindow = new Rectangle2D.Double(0, 0, 10, 10);

        // Call the setClip method
        clipping.setClip(clipWindow);

        // Verify that the clip window coordinates are set correctly
        assertEquals(0, clipping.xMin, 0);
        assertEquals(10, clipping.xMax, 0);
        assertEquals(0, clipping.yMin, 0);
        assertEquals(10, clipping.yMax, 0);
    }
}
