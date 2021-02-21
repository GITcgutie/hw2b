/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:10:02 GMT 2021
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Jsoup_ESTest extends Jsoup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Jsoup.parse((InputStream) null, "", "");
      assertFalse(document0.hasParent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Jsoup.connect("nofollow");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: nofollow
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Jsoup.parse("V3(UR9s52<", "V3(UR9s52<", (Parser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.Jsoup", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      try { 
        Jsoup.parse(uRL0, 1510);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // Only http & https protocols supported
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      try { 
        Jsoup.parse((File) mockFile0, "");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Whitelist whitelist0 = new Whitelist();
      boolean boolean0 = Jsoup.isValid("org.jsoup.Jsoup", whitelist0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("String must not be empty", "String must not be empty");
      try { 
        Jsoup.parse((File) mockFile0, "String must not be empty", (String) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      Document document0 = Jsoup.parse((InputStream) null, "&5-M#4>[hEG", "", parser0);
      assertEquals("", document0.location());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basicWithImages();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      String string0 = Jsoup.clean("", "", whitelist0, document_OutputSettings0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Jsoup.parse("=X88@5LcSf9n+");
      assertFalse(document0.isBlock());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Jsoup.clean("", (Whitelist) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Jsoup.parse("org.jsoup.Jsoup", "org.jsoup.Jsoup");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Jsoup.parseBodyFragment("org.jsoup.select.Evaluator$IsNthOfType");
  }
}
