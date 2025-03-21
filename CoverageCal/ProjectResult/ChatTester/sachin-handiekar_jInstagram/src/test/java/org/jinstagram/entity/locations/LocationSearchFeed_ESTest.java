// original test path: /Users/zhi/Documents/PH.D/Project/Testing/ChatTESTER/CodePackage/Prompt2Testing/repo_get/Four_project/sachin-handiekar_jInstagram/src/test/java/org/jinstagram/entity/locations/LocationSearchFeed_ESTest.java
/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 27 04:03:11 GMT 2024
 */
package org.jinstagram.entity.locations;


import java.util.*;
import java.lang.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import org.jinstagram.entity.common.Location;
import org.jinstagram.entity.locations.LocationSearchFeed;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Location;
import org.jinstagram.entity.locations.LocationSearchFeed;
import org.junit.runner.RunWith;

import java.util.*;
import java.lang.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jinstagram.entity.common.Location;
import org.jinstagram.entity.locations.LocationSearchFeed;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class LocationSearchFeed_ESTest extends LocationSearchFeed_ESTest_scaffolding {

@Test
public void testSetLocationList() {
    LocationSearchFeed locationSearchFeed = new LocationSearchFeed();
    List<Location> testLocationList = new LinkedList<Location>();

    Location location1 = new Location();
    location1.setName("Location 1");
    location1.setLatitude(123.456);
    location1.setLongitude(789.012);

    Location location2 = new Location();
    location2.setName("Location 2");
    location2.setLatitude(456.789);
    location2.setLongitude(321.654);

    testLocationList.add(location1);
    testLocationList.add(location2);

    locationSearchFeed.setLocationList(testLocationList);
    List<Location> retrievedLocationList = locationSearchFeed.getLocationList();

    assertEquals(testLocationList, retrievedLocationList);
}

@Test
public void testGetLocationList() {
    LocationSearchFeed locationSearchFeed = new LocationSearchFeed();
    List<Location> expectedLocationList = new LinkedList<Location>();

    expectedLocationList.add(new Location());
    expectedLocationList.get(0).setName("Location 1");

    expectedLocationList.add(new Location());
    expectedLocationList.get(1).setName("Location 2");

    locationSearchFeed.setLocationList(expectedLocationList);
    List<Location> actualLocationList = locationSearchFeed.getLocationList();
    assertNotNull(actualLocationList);
    assertEquals(expectedLocationList.size(), actualLocationList.size());
    for (int i = 0; i < expectedLocationList.size(); i++) {
        assertEquals(expectedLocationList.get(i).getName(), actualLocationList.get(i).getName());
    }
}

}
