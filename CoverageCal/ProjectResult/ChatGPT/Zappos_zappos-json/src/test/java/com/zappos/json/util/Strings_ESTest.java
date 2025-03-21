// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/util/Strings_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:13:31 GMT 2024
 */
package com.zappos.json.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.util.Strings;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.util.Strings;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Strings_ESTest extends Strings_ESTest_scaffolding {

    @Test
    public void testRandomNumber() {
        int n = 5;
        String result = Strings.randomNumber(n);
        assertEquals(n, result.length());
        assertTrue(Strings.isNumber(result));
    }

    @Test
    public void testFromReader() throws IOException {
        // Create a test input string
        String input = "This is a test string";

        // Create a StringReader with the test input string
        Reader reader = new StringReader(input);

        // Set the buffer size
        int bufferSize = 10;

        // Call the method under test
        String result = Strings.fromReader(reader, bufferSize);

        // Verify the result
        assertEquals(input, result);
    }

    @Test
    public void testIsNumber_withValidNumber_shouldReturnTrue() {
        // Arrange
        String validNumber = "12345";

        // Act
        boolean result = Strings.isNumber(validNumber);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testRandomAlphabetic() {
        int n = 5;
        String result = Strings.randomAlphabetic(n);
        
        // Check if the length of the result is equal to n
        assertEquals(n, result.length());
        
        // Check if all characters in the result are alphabetic
        for (char c : result.toCharArray()) {
            assertTrue(Character.isAlphabetic(c));
        }
    }

    @Test
    public void testFromReader_2() throws IOException {
        // Create a test input string
        String input = "This is a test string";
        
        // Create a StringReader object with the test input string
        Reader reader = new StringReader(input);
        
        // Call the method under test
        String result = Strings.fromReader(reader);
        
        // Verify the result
        assertEquals(input, result);
    }

}
