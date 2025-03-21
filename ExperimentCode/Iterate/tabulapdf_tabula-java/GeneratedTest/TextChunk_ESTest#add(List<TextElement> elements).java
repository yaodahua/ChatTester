// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/tabulapdf_tabula-java/src/test/java/technology/tabula/TextChunk_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 10 10:15:23 GMT 2024
 */
package technology.tabula;







import java.util.*;
import java.lang.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import technology.tabula.Line;
import technology.tabula.Rectangle;
import technology.tabula.TextChunk;
import technology.tabula.TextElement;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TextChunk_ESTest extends TextChunk_ESTest_scaffolding {
    


    
    
    
    
    
    @Test
    public void testAddMultipleElements() {
        TextElement te1 = new TextElement(10, 20, 30, 40);
        TextElement te2 = new TextElement(50, 60, 70, 80);
        TextElement te3 = new TextElement(90, 100, 110, 120);

        List<TextElement> elements = new ArrayList<>();
        elements.add(te1);
        elements.add(te2);
        elements.add(te3);

        TextChunk textChunk = new TextChunk(5, 5, 200, 150);
        textChunk.add(elements);

        List<TextElement> addedElements = textChunk.getElements();

        assertEquals(3, addedElements.size());
        assertEquals(te1, addedElements.get(0));
        assertEquals(te2, addedElements.get(1));
        assertEquals(te3, addedElements.get(2));
    }
}
