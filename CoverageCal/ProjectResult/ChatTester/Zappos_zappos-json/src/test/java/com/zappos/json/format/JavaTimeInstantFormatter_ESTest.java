// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/Zappos_zappos-json/src/test/java/com/zappos/json/format/JavaTimeInstantFormatter_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:40:01 GMT 2024
 */
package com.zappos.json.format;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.JavaTimeInstantFormatter;
import com.zappos.json.format.ValueFormatter;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.Instant;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.JavaTimeInstantFormatter;
import com.zappos.json.format.ValueFormatter;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class JavaTimeInstantFormatter_ESTest extends JavaTimeInstantFormatter_ESTest_scaffolding {

    @Test
    public void testNewInstance() {
        JavaTimeInstantFormatter javaTimeInstantFormatter = new JavaTimeInstantFormatter();
        ValueFormatter<Instant> newInstance = javaTimeInstantFormatter.newInstance();

        assertNotNull(newInstance);
        assertTrue(newInstance instanceof JavaTimeInstantFormatter);
    }

    @Test
    public void testCast_ValidInstantObject_ReturnsInstant() {
        // Arrange
        JavaTimeInstantFormatter formatter = new JavaTimeInstantFormatter();
        Instant expectedInstant = Instant.now();
        
        // Act
        Instant result = formatter.cast(expectedInstant);
        
        // Assert
        assertEquals(expectedInstant, result);
    }

}
