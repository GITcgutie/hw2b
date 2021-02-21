/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:39:25 GMT 2021
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseSettings_ESTest extends ParseSettings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = parseSettings0.normalizeAttributes(attributes0);
      assertEquals(0, attributes1.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = parseSettings0.normalizeAttributes(attributes0);
      assertEquals(0, attributes1.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      String string0 = parseSettings0.normalizeAttribute("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      String string0 = parseSettings0.normalizeTag("meta[name=charset]");
      assertEquals("meta[name=charset]", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      String string0 = parseSettings0.normalizeTag("uS,b7|N:in:");
      assertEquals("uS,b7|N:in:", string0);
  }
}