// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/InstagramObject_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:52:13 GMT 2024
 */
package org.jinstagram;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.comments.MediaCommentResponse;
import org.jinstagram.entity.locations.LocationInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class InstagramObject_ESTest extends InstagramObject_ESTest_scaffolding {
    @Test
    public void testGetRemainingLimitStatus() {
        // Given
        Map<String, String> headers = new HashMap<>();
        headers.put("X-Rate-Limit-Limit", "500");
        headers.put("X-Rate-Limit-Remaining", "100");
        
        InstagramObject instagramObject = new InstagramObject() {
            @Override
            void setHeaders(Map<String, String> headers) {
                this.headers = headers;
            }

            @Override
            public Map<String, String> getHeaders() {
                return this.headers;
            }

            @Override
            public int getAPILimitStatus() {
                return 0;
            }

            @Override
            public int getRemainingLimitStatus() {
                return APILimitUtils.getRemainingLimitStatus(this.headers);
            }
        };

        instagramObject.setHeaders(headers);

        // When
        int remainingLimitStatus = instagramObject.getRemainingLimitStatus();

        // Then
        assertEquals(100, remainingLimitStatus);
    }
}
