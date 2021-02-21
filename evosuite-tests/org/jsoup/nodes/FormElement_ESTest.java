/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:00:53 GMT 2021
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.Connection;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FormElement_ESTest extends FormElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tag tag0 = Tag.valueOf("type");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "5e~J [~", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tag tag0 = Tag.valueOf("select");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "select", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tag tag0 = Tag.valueOf("ACTION");
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("?ZM^", "ACTION");
      Attribute attribute0 = Attribute.createFromEncoded("METHOD", "?ZM^");
      Attributes attributes2 = attributes1.put(attribute0);
      FormElement formElement0 = new FormElement(tag0, "ACTION", attributes2);
      String[] stringArray0 = new String[2];
      stringArray0[1] = "POST";
      attributes0.vals = stringArray0;
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: ACTION
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("action", parseSettings0);
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("action", true);
      FormElement formElement0 = new FormElement(tag0, "Jl/G:fN+3", attributes1);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not determine a form action URL for submit. Ensure you set a base URI when parsing.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Tag tag0 = Tag.valueOf("i6z");
      CDataNode cDataNode0 = new CDataNode("i6z");
      Attributes attributes0 = cDataNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, "i6z", attributes0);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: i6z
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Tag tag0 = Tag.valueOf("quirks");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "quirks", attributes0);
      Elements elements0 = formElement0.elements();
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Tag tag0 = Tag.valueOf("dl");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "dl", attributes0);
      Document document0 = Document.createShell("dl");
      // Undeclared exception!
      try { 
        formElement0.removeChild(document0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}