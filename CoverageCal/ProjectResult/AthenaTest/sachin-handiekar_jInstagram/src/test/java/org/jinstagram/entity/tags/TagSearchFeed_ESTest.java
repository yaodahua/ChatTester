/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:18:17 GMT 2024
 */
package org.jinstagram.entity.tags;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.tags.TagInfoData;
import org.jinstagram.entity.tags.TagSearchFeed;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class TagSearchFeed_ESTest extends TagSearchFeed_ESTest_scaffolding {
    @Test 
    public void testSetMeta() { 
    TagSearchFeed feed = new TagSearchFeed();
    feed.setMeta(new Meta());
    }
    
}
