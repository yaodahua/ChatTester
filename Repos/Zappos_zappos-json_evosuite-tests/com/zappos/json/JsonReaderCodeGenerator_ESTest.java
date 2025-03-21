/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 25 13:55:24 GMT 2024
 */

package com.zappos.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zappos.json.JsonBeanAttribute;
import com.zappos.json.JsonBeanIntrospector;
import com.zappos.json.JsonReaderCodeGenerator;
import com.zappos.json.JsonReaderInvoker;
import com.zappos.json.ZapposJson;
import com.zappos.json.format.JavaTimeInstantFormatter;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsonReaderCodeGenerator_ESTest extends JsonReaderCodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonReaderCodeGenerator jsonReaderCodeGenerator0 = new JsonReaderCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      jsonReaderCodeGenerator0.deregisterAll();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonReaderCodeGenerator jsonReaderCodeGenerator0 = new JsonReaderCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      Class<Object> class0 = Object.class;
      jsonReaderCodeGenerator0.deregister(class0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonReaderCodeGenerator jsonReaderCodeGenerator0 = new JsonReaderCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      Class<Object> class0 = Object.class;
      try { 
        jsonReaderCodeGenerator0.registerReader(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // bean introspection failed
         //
         verifyException("com.zappos.json.JsonBeanIntrospector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZapposJson zapposJson0 = new ZapposJson();
      JsonReaderCodeGenerator jsonReaderCodeGenerator0 = new JsonReaderCodeGenerator(zapposJson0, (JsonBeanIntrospector) null);
      Class<JsonReaderInvoker> class0 = JsonReaderInvoker.class;
      try { 
        jsonReaderCodeGenerator0.registerReader(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.zappos.json.JsonReaderCodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JsonReaderCodeGenerator.TypeInfo jsonReaderCodeGenerator_TypeInfo0 = new JsonReaderCodeGenerator.TypeInfo(class0);
      JsonReaderCodeGenerator.AttributeInfo jsonReaderCodeGenerator_AttributeInfo0 = jsonReaderCodeGenerator_TypeInfo0.addAttributeInfo(class0, (JsonBeanAttribute) null);
      jsonReaderCodeGenerator_AttributeInfo0.getDetail();
      assertEquals(0, jsonReaderCodeGenerator_AttributeInfo0.getArrayType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<JsonReaderInvoker> class0 = JsonReaderInvoker.class;
      JsonReaderCodeGenerator.TypeInfo jsonReaderCodeGenerator_TypeInfo0 = new JsonReaderCodeGenerator.TypeInfo(class0);
      Class<?> class1 = jsonReaderCodeGenerator_TypeInfo0.getType();
      assertFalse(class1.isArray());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JsonReaderCodeGenerator.TypeInfo jsonReaderCodeGenerator_TypeInfo0 = new JsonReaderCodeGenerator.TypeInfo(class0);
      JsonBeanAttribute jsonBeanAttribute0 = new JsonBeanAttribute();
      JsonReaderCodeGenerator.AttributeInfo jsonReaderCodeGenerator_AttributeInfo0 = jsonReaderCodeGenerator_TypeInfo0.addAttributeInfo(class0, jsonBeanAttribute0);
      jsonReaderCodeGenerator_AttributeInfo0.getAttributeType();
      assertEquals(0, jsonReaderCodeGenerator_AttributeInfo0.getArrayType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode0 = new JsonReaderCodeGenerator.PathAndCode(")S+2Mz5", ")S+2Mz5");
      String string0 = jsonReaderCodeGenerator_PathAndCode0.getPath();
      assertEquals(")S+2Mz5", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JsonReaderCodeGenerator.TypeInfo jsonReaderCodeGenerator_TypeInfo0 = new JsonReaderCodeGenerator.TypeInfo(class0);
      List<JsonReaderCodeGenerator.AttributeInfo> list0 = jsonReaderCodeGenerator_TypeInfo0.getAttributeInfos();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JsonReaderCodeGenerator.TypeInfo jsonReaderCodeGenerator_TypeInfo0 = new JsonReaderCodeGenerator.TypeInfo(class0);
      JsonBeanAttribute jsonBeanAttribute0 = new JsonBeanAttribute();
      JsonReaderCodeGenerator.AttributeInfo jsonReaderCodeGenerator_AttributeInfo0 = jsonReaderCodeGenerator_TypeInfo0.addAttributeInfo(class0, jsonBeanAttribute0);
      int int0 = jsonReaderCodeGenerator_AttributeInfo0.getArrayType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode0 = new JsonReaderCodeGenerator.PathAndCode("OBJECT", "OBJECT");
      String string0 = jsonReaderCodeGenerator_PathAndCode0.getCode();
      assertEquals("OBJECT", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode0 = new JsonReaderCodeGenerator.PathAndCode("OBJECT", "OBJECT");
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode1 = new JsonReaderCodeGenerator.PathAndCode("", "D]#&Gx<^@=`");
      boolean boolean0 = jsonReaderCodeGenerator_PathAndCode0.equals(jsonReaderCodeGenerator_PathAndCode1);
      assertFalse(boolean0);
      assertEquals("D]#&Gx<^@=`", jsonReaderCodeGenerator_PathAndCode1.getCode());
      assertEquals("", jsonReaderCodeGenerator_PathAndCode1.getPath());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode0 = new JsonReaderCodeGenerator.PathAndCode((String) null, (String) null);
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode1 = new JsonReaderCodeGenerator.PathAndCode("w#C&S", "w#C&S");
      boolean boolean0 = jsonReaderCodeGenerator_PathAndCode0.equals(jsonReaderCodeGenerator_PathAndCode1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode0 = new JsonReaderCodeGenerator.PathAndCode((String) null, (String) null);
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode1 = new JsonReaderCodeGenerator.PathAndCode((String) null, (String) null);
      boolean boolean0 = jsonReaderCodeGenerator_PathAndCode0.equals(jsonReaderCodeGenerator_PathAndCode1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode0 = new JsonReaderCodeGenerator.PathAndCode("JavaTimeInstantFormatter[]", "JavaTimeInstantFormatter[]");
      boolean boolean0 = jsonReaderCodeGenerator_PathAndCode0.equals("JavaTimeInstantFormatter[]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode0 = new JsonReaderCodeGenerator.PathAndCode("s=<ur", "`YWS=]l1MH/qfeMT ");
      boolean boolean0 = jsonReaderCodeGenerator_PathAndCode0.equals((Object) null);
      assertEquals("s=<ur", jsonReaderCodeGenerator_PathAndCode0.getPath());
      assertEquals("`YWS=]l1MH/qfeMT ", jsonReaderCodeGenerator_PathAndCode0.getCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode0 = new JsonReaderCodeGenerator.PathAndCode("OBJECT", "OBJECT");
      boolean boolean0 = jsonReaderCodeGenerator_PathAndCode0.equals(jsonReaderCodeGenerator_PathAndCode0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode0 = new JsonReaderCodeGenerator.PathAndCode("OBJECT", "OBJECT");
      JsonReaderCodeGenerator.PathAndCode jsonReaderCodeGenerator_PathAndCode1 = new JsonReaderCodeGenerator.PathAndCode("OBJECT", "OBJECT");
      boolean boolean0 = jsonReaderCodeGenerator_PathAndCode1.equals(jsonReaderCodeGenerator_PathAndCode0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<JavaTimeInstantFormatter> class0 = JavaTimeInstantFormatter.class;
      JsonBeanAttribute jsonBeanAttribute0 = new JsonBeanAttribute();
      JsonReaderCodeGenerator.AttributeInfo jsonReaderCodeGenerator_AttributeInfo0 = new JsonReaderCodeGenerator.AttributeInfo(class0, jsonBeanAttribute0);
      jsonReaderCodeGenerator_AttributeInfo0.setArrayType(2015);
      assertEquals(2015, jsonReaderCodeGenerator_AttributeInfo0.getArrayType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<JavaTimeInstantFormatter> class0 = JavaTimeInstantFormatter.class;
      JsonBeanAttribute jsonBeanAttribute0 = new JsonBeanAttribute();
      JsonReaderCodeGenerator.AttributeInfo jsonReaderCodeGenerator_AttributeInfo0 = new JsonReaderCodeGenerator.AttributeInfo(class0, jsonBeanAttribute0);
      jsonReaderCodeGenerator_AttributeInfo0.getCollectionType();
      assertEquals(0, jsonReaderCodeGenerator_AttributeInfo0.getArrayType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<JavaTimeInstantFormatter> class0 = JavaTimeInstantFormatter.class;
      JsonBeanAttribute jsonBeanAttribute0 = new JsonBeanAttribute();
      JsonReaderCodeGenerator.AttributeInfo jsonReaderCodeGenerator_AttributeInfo0 = new JsonReaderCodeGenerator.AttributeInfo(class0, jsonBeanAttribute0);
      JsonReaderCodeGenerator.AttributeInfo jsonReaderCodeGenerator_AttributeInfo1 = jsonReaderCodeGenerator_AttributeInfo0.setCollectionType(class0);
      assertEquals(0, jsonReaderCodeGenerator_AttributeInfo1.getArrayType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<JavaTimeInstantFormatter> class0 = JavaTimeInstantFormatter.class;
      JsonBeanAttribute jsonBeanAttribute0 = new JsonBeanAttribute();
      JsonReaderCodeGenerator.AttributeInfo jsonReaderCodeGenerator_AttributeInfo0 = new JsonReaderCodeGenerator.AttributeInfo(class0, jsonBeanAttribute0);
      // Undeclared exception!
      try { 
        jsonReaderCodeGenerator_AttributeInfo0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.zappos.json.JsonBeanAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<JsonReaderInvoker> class0 = JsonReaderInvoker.class;
      JsonReaderCodeGenerator.TypeInfo jsonReaderCodeGenerator_TypeInfo0 = new JsonReaderCodeGenerator.TypeInfo(class0);
      String string0 = jsonReaderCodeGenerator_TypeInfo0.toString();
      assertEquals("JsonReaderInvoker[]", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZapposJson zapposJson0 = new ZapposJson();
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonReaderCodeGenerator jsonReaderCodeGenerator0 = new JsonReaderCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      Class<Object> class0 = Object.class;
      JsonReaderInvoker jsonReaderInvoker0 = jsonReaderCodeGenerator0.getReader(class0);
      assertNull(jsonReaderInvoker0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZapposJson zapposJson0 = ZapposJson.getInstance();
      JsonBeanIntrospector jsonBeanIntrospector0 = new JsonBeanIntrospector(zapposJson0);
      JsonReaderCodeGenerator jsonReaderCodeGenerator0 = new JsonReaderCodeGenerator(zapposJson0, jsonBeanIntrospector0);
      Class<JavaTimeInstantFormatter> class0 = JavaTimeInstantFormatter.class;
      // Undeclared exception!
      try { 
        jsonReaderCodeGenerator0.registerReader(class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javassist/ClassPool
         //
         verifyException("com.zappos.json.JsonReaderCodeGenerator", e);
      }
  }
}
