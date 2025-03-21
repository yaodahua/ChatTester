// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/auth/oauth/InstagramService_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 03:26:33 GMT 2024
 */
package org.jinstagram.auth.oauth;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.auth.InstagramApi;
import org.jinstagram.auth.model.OAuthConfig;
import org.jinstagram.auth.model.OAuthRequest;
import org.jinstagram.auth.model.Token;
import org.jinstagram.auth.model.Verifier;
import org.jinstagram.auth.oauth.InstagramService;
import org.jinstagram.http.Verbs;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class InstagramService_ESTest extends InstagramService_ESTest_scaffolding {
    @Test
    public void testGetAuthorizationUrl() {
        // Create a mock InstagramApi object
        InstagramApi api = Mockito.mock(InstagramApi.class);
        
        // Create a mock OAuthConfig object
        OAuthConfig config = Mockito.mock(OAuthConfig.class);
        
        // Create an instance of InstagramService using the mock objects
        InstagramService instagramService = new InstagramService(api, config);
        
        // Define the expected result
        String expectedUrl = "https://www.instagram.com/oauth/authorize";
        
        // Mock the behavior of the api.getAuthorizationUrl() method
        Mockito.when(api.getAuthorizationUrl(config)).thenReturn(expectedUrl);
        
        // Call the getAuthorizationUrl() method
        String actualUrl = instagramService.getAuthorizationUrl();
        
        // Verify that the api.getAuthorizationUrl() method was called with the correct arguments
        Mockito.verify(api).getAuthorizationUrl(config);
        
        // Verify that the actual result matches the expected result
        assertEquals(expectedUrl, actualUrl);
    }
}
