// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/http/Response_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:44:51 GMT 2024
 */
package org.jinstagram.http;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.jinstagram.http.Response;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Response_ESTest extends Response_ESTest_scaffolding {
    @Test
    public void testGetURL() {
        // Create a mock HttpURLConnection object
        HttpURLConnection connection = mock(HttpURLConnection.class);
        
        // Create a Response object using the mock connection
        Response response = new Response(connection);
        
        // Set the expected URL
        String expectedUrl = "https://example.com";
        
        // Set the URL of the mock connection
        when(connection.getURL()).thenReturn(new URL(expectedUrl));
        
        // Call the getURL() method of the Response object
        String actualUrl = response.getURL();
        
        // Assert that the actual URL matches the expected URL
        assertEquals(expectedUrl, actualUrl);
    }
}
