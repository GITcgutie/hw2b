/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:38:07 GMT 2021
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tag_ESTest extends Tag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("title", parseSettings0);
      tag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Tag tag0 = Tag.valueOf("nav");
      tag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tag tag0 = Tag.valueOf("keygen", (ParseSettings) null);
      tag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("Q{:ytyt*EH2p1(Z", parseSettings0);
      assertFalse(tag0.isSelfClosing());
      
      Tag tag1 = tag0.setSelfClosing();
      Tag tag2 = Tag.valueOf("Q{:ytyt*EH2p1(Z", parseSettings0);
      boolean boolean0 = tag1.equals(tag2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(";:", parseSettings0);
      Tag tag1 = Tag.valueOf(";:", parseSettings0);
      boolean boolean0 = tag1.equals(tag0);
      assertFalse(tag1.preserveWhitespace());
      assertFalse(tag1.isSelfClosing());
      assertFalse(tag1.isFormListed());
      assertFalse(tag1.isData());
      assertTrue(boolean0);
      assertTrue(tag1.formatAsBlock());
      assertFalse(tag1.isFormSubmittable());
      assertFalse(tag1.isBlock());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Tag tag0 = Tag.valueOf("nav");
      boolean boolean0 = tag0.equals("nav");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("Q{:ytyt*EH2p1(Z", parseSettings0);
      Tag tag1 = Tag.valueOf("mwYr)*0]PO<P");
      boolean boolean0 = tag0.equals(tag1);
      assertFalse(boolean0);
      assertTrue(tag1.formatAsBlock());
      assertFalse(tag1.isData());
      assertFalse(tag1.isFormListed());
      assertFalse(tag1.isFormSubmittable());
      assertFalse(tag1.preserveWhitespace());
      assertFalse(tag1.canContainBlock());
      assertFalse(tag1.isSelfClosing());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = Tag.isKnownTag("nav");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Tag.isKnownTag("S#L9M$P]#{$eF!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("blockquote", parseSettings0);
      boolean boolean0 = tag0.isKnownTag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Tag tag0 = Tag.valueOf("e(3[^");
      boolean boolean0 = tag0.isKnownTag();
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isData());
      assertFalse(boolean0);
      assertFalse(tag0.canContainBlock());
      assertTrue(tag0.formatAsBlock());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(";:", parseSettings0);
      boolean boolean0 = tag0.isSelfClosing();
      assertTrue(tag0.formatAsBlock());
      assertFalse(boolean0);
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isData());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.canContainBlock());
      assertFalse(tag0.preserveWhitespace());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("input", parseSettings0);
      boolean boolean0 = tag0.isSelfClosing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Tag tag0 = Tag.valueOf("keygen", (ParseSettings) null);
      boolean boolean0 = tag0.isData();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(";:", parseSettings0);
      boolean boolean0 = tag0.isData();
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.preserveWhitespace());
      assertFalse(boolean0);
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.canContainBlock());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(";:", parseSettings0);
      boolean boolean0 = tag0.isInline();
      assertFalse(tag0.isData());
      assertTrue(boolean0);
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isFormSubmittable());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isFormListed());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Tag tag0 = Tag.valueOf("head");
      boolean boolean0 = tag0.isInline();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("B", parseSettings0);
      assertFalse(tag0.preserveWhitespace());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(";:", parseSettings0);
      assertFalse(tag0.isSelfClosing());
      
      tag0.setSelfClosing();
      boolean boolean0 = tag0.isSelfClosing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("'o:Swv", parseSettings0);
      boolean boolean0 = tag0.isFormSubmittable();
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.preserveWhitespace());
      assertFalse(boolean0);
      assertFalse(tag0.isData());
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.canContainBlock());
      assertTrue(tag0.formatAsBlock());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(";:", parseSettings0);
      boolean boolean0 = tag0.canContainBlock();
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isData());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(boolean0);
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isSelfClosing());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(";:", parseSettings0);
      boolean boolean0 = tag0.isBlock();
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isSelfClosing());
      assertFalse(boolean0);
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.isData());
      assertFalse(tag0.isFormListed());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(";:", parseSettings0);
      boolean boolean0 = tag0.isFormListed();
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.canContainBlock());
      assertFalse(tag0.isSelfClosing());
      assertFalse(boolean0);
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Tag tag0 = Tag.valueOf("keygen", (ParseSettings) null);
      String string0 = tag0.toString();
      assertEquals("keygen", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf(";:", parseSettings0);
      tag0.getName();
      assertFalse(tag0.isData());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isBlock());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Tag tag0 = Tag.valueOf(".");
      boolean boolean0 = tag0.formatAsBlock();
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isSelfClosing());
      assertTrue(boolean0);
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.canContainBlock());
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("4", parseSettings0);
      assertNotNull(tag0);
      
      boolean boolean0 = tag0.preserveWhitespace();
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isFormListed());
      assertFalse(boolean0);
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.isData());
      assertFalse(tag0.canContainBlock());
      assertFalse(tag0.isFormSubmittable());
  }
}
