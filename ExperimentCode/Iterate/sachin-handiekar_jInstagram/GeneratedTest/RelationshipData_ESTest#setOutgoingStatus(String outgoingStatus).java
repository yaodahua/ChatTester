// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/relationships/RelationshipData_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:09:00 GMT 2024
 */
package org.jinstagram.entity.relationships;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.relationships.RelationshipData;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class RelationshipData_ESTest extends RelationshipData_ESTest_scaffolding {
    @Test
    public void testSetOutgoingStatus() {
        // Given
        RelationshipData relationshipData = new RelationshipData();
        String expectedOutgoingStatus = "FRIENDS";

        // When
        relationshipData.setOutgoingStatus(expectedOutgoingStatus);

        // Then
        assertEquals(expectedOutgoingStatus, relationshipData.getOutgoingStatus());
    }
}
