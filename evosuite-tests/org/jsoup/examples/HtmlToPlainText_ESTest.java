/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:11:27 GMT 2021
 */

package org.jsoup.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HtmlToPlainText_ESTest extends HtmlToPlainText_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      Document document0 = Document.createShell("~");
      document0.appendText("~");
      Element element0 = document0.text("\n+{>_p'Do#ZT/TA4M#u");
      document0.appendText("\n+{>_p'Do#ZT/TA4M#u");
      TextNode textNode0 = new TextNode("\n+{>_p'Do#ZT/TA4M#u");
      element0.prependChild(textNode0);
      element0.prepend("\n+{>_p'Do#ZT/TA4M#u");
      String string0 = htmlToPlainText0.getPlainText(element0);
      assertEquals(" +{>_p'Do#ZT/TA4M#u +{>_p'Do#ZT/TA4M#u +{>_p'Do#ZT/TA4M#u~ +{>_p'Do#ZT/TA4M#u", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      Document document0 = Document.createShell("\n");
      Document document1 = (Document)document0.text("\n");
      document1.title(" <%s>");
      String string0 = htmlToPlainText0.getPlainText(document1);
      assertEquals(" <%s> ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      Document document0 = Document.createShell("\n");
      Document document1 = (Document)document0.text("\n");
      document1.title("F ");
      String string0 = htmlToPlainText0.getPlainText(document1);
      assertEquals("F ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("a", parseSettings0);
      Attributes attributes0 = new Attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "a", attributes0);
      String string0 = htmlToPlainText0.getPlainText(pseudoTextElement0);
      assertEquals(" <>", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      Tag tag0 = Tag.valueOf("p", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "p", attributes0);
      String string0 = htmlToPlainText0.getPlainText(formElement0);
      assertEquals("\n\n", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      Tag tag0 = Tag.valueOf("dt", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "dt", attributes0);
      String string0 = htmlToPlainText0.getPlainText(formElement0);
      assertEquals("  \n", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      Tag tag0 = Tag.valueOf("li", parseSettings0);
      Attributes attributes0 = new Attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "li", attributes0);
      String string0 = htmlToPlainText0.getPlainText(pseudoTextElement0);
      assertEquals("\n * ", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HtmlToPlainText htmlToPlainText0 = new HtmlToPlainText();
      Document document0 = Document.createShell("\n");
      Element element0 = document0.text("\n");
      htmlToPlainText0.getPlainText(element0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        HtmlToPlainText.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        HtmlToPlainText.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a valid URL
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        HtmlToPlainText.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a valid URL
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
