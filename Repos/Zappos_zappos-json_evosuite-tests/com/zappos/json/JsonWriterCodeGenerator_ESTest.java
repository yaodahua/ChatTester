/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 14:02:58 GMT 2024
 */

package com.zappos.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.JsonBeanIntrospector;
import com.zappos.json.JsonWriterCodeGenerator;
import com.zappos.json.JsonWriterInvoker;
import com.zappos.json.ZapposJson;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsonWriterCodeGenerator_ESTest extends JsonWriterCodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonWriterCodeGenerator jsonWriterCodeGenerator0 = new JsonWriterCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      jsonWriterCodeGenerator0.deregisterAll();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      Class<ZapposJson> class0 = ZapposJson.class;
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonWriterCodeGenerator jsonWriterCodeGenerator0 = new JsonWriterCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      jsonWriterCodeGenerator0.deregister(class0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      Class<ZapposJson> class0 = ZapposJson.class;
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonWriterCodeGenerator jsonWriterCodeGenerator0 = new JsonWriterCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      JsonWriterInvoker jsonWriterInvoker0 = jsonWriterCodeGenerator0.getWriter(class0);
      assertNull(jsonWriterInvoker0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonWriterCodeGenerator jsonWriterCodeGenerator0 = new JsonWriterCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      try { 
        jsonWriterCodeGenerator0.registerWriter((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.zappos.json.JsonWriterCodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance("niLm");
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonWriterCodeGenerator jsonWriterCodeGenerator0 = new JsonWriterCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      Class<ZapposJson> class0 = ZapposJson.class;
      // Undeclared exception!
      try { 
        jsonWriterCodeGenerator0.registerWriter(class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javassist/ClassPool
         //
         verifyException("com.zappos.json.JsonWriterCodeGenerator", e);
      }
  }
}
