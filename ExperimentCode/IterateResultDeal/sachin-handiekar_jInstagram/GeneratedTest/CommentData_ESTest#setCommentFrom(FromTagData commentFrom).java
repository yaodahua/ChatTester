// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/CommentData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:28:38 GMT 2024
 */
package org.jinstagram.entity.comments;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.common.FromTagData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CommentData_ESTest extends CommentData_ESTest_scaffolding {
    @Test
    public void testSetCommentFrom() {
        CommentData commentData = new CommentData();
        FromTagData fromTagData = new FromTagData();
        
        // Set up the FromTagData object
        fromTagData.setUsername("testUser");
        fromTagData.setFullName("Test User");
        
        // Call the method under test
        commentData.setCommentFrom(fromTagData);
        
        // Verify that the FromTagData object was set correctly
        assertEquals("testUser", commentData.getCommentFrom().getUsername());
        assertEquals("Test User", commentData.getCommentFrom().getFullName());
    }
}
