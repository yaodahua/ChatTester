// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/URLUtils_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:48:19 GMT 2024
 */
package org.jinstagram.http;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class URLUtils_ESTest extends URLUtils_ESTest_scaffolding {
    @Test
    public void testAppendParametersToQueryString() {
        // Given
        String url = "https://example.com/api";
        Map<String, String> params = new HashMap<>();
        params.put("param1", "value1");
        params.put("param2", "value2");

        // When
        String result = URLUtils.appendParametersToQueryString(url, params);

        // Then
        // Check if the result contains the original URL
        assert result.contains(url);

        // Check if the result contains the encoded parameters
        assert result.contains("param1=value1");
        assert result.contains("param2=value2");

        // Check if the result is correctly formatted with the query string separator
        if (url.contains("?")) {
            assert result.contains("&");
        } else {
            assert result.contains("?");
        }
    }
}
