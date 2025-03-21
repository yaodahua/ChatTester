// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/comments/MediaCommentsFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:32:11 GMT 2024
 */
package org.jinstagram.entity.comments;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.CommentData;
import org.jinstagram.entity.comments.MediaCommentsFeed;
import org.jinstagram.entity.common.Meta;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MediaCommentsFeed_ESTest extends MediaCommentsFeed_ESTest_scaffolding {
    @Test
    public void testGetCommentDataList() {
        // Create a MediaCommentsFeed object
        MediaCommentsFeed mediaCommentsFeed = new MediaCommentsFeed();

        // Create a list of CommentData objects
        List<CommentData> commentDataList = new ArrayList<>();
        CommentData commentData1 = new CommentData();
        CommentData commentData2 = new CommentData();
        commentDataList.add(commentData1);
        commentDataList.add(commentData2);

        // Set the commentDataList in the MediaCommentsFeed object
        mediaCommentsFeed.setCommentDataList(commentDataList);

        // Call the getCommentDataList method
        List<CommentData> result = mediaCommentsFeed.getCommentDataList();

        // Assert that the returned list is equal to the original list
        assertEquals(commentDataList, result);
    }
}
