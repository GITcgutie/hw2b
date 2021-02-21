/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:24:59 GMT 2021
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HtmlTreeBuilder_ESTest extends HtmlTreeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell("vw[CSz.W[`+U^Obh.&.");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.pushActiveFormattingElements((Element) null);
      Element element0 = htmlTreeBuilder0.getActiveFormattingElement("!w^nIw?Z(LcS$");
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell("vw[CSz.W[`+U^Obh.&.");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.pushActiveFormattingElements(document0);
      Element element0 = htmlTreeBuilder0.getActiveFormattingElement("!7k^nIwZ(LcS$");
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.pushActiveFormattingElements((Element) null);
      htmlTreeBuilder0.removeFromActiveFormattingElements((Element) null);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.removeFromActiveFormattingElements(document0);
      assertEquals(0, document0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell("vw[CSzW[`+U^Obh&");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.pushActiveFormattingElements((Element) null);
      htmlTreeBuilder0.clearFormattingElementsToLastMarker();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell("vw[CSz.W[`+U^Obh.&.");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      Element element0 = document0.appendElement("!w^nIw?Z(LcS$");
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.pushActiveFormattingElements(document0);
      htmlTreeBuilder0.pushActiveFormattingElements(element0);
      assertFalse(element0.isBlock());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell("vw[CSz.W[`+U^Obh.&.");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.pushActiveFormattingElements((Element) null);
      htmlTreeBuilder0.pushActiveFormattingElements(document0);
      assertFalse(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell("vw[CSz.W[`+U^Obh.&.");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.pushActiveFormattingElements(document0);
      htmlTreeBuilder0.pushActiveFormattingElements(document0);
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.pushActiveFormattingElements(document0);
      htmlTreeBuilder0.clearFormattingElementsToLastMarker();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      Element element0 = htmlTreeBuilder0.removeLastFormattingElement();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell("vw[CSz.W[`+U^Obh.&.");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.pushActiveFormattingElements((Element) null);
      htmlTreeBuilder0.reconstructFormattingElements();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      htmlTreeBuilder0.parseFragment(">!N2$tGt`z*Uw8u ", (Element) null, "!w^nIv?Z(LcS$", (ParseErrorList) null, parseSettings0);
      htmlTreeBuilder0.generateImpliedEndTags("m[nfa%*U8#");
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      List<Node> list0 = htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      assertEquals(1, list0.size());
      assertTrue(parseErrorList0.isEmpty());
      
      boolean boolean0 = htmlTreeBuilder0.inSelectScope("col");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      String[] stringArray0 = new String[4];
      stringArray0[1] = ".@wQsSy5j'\"#Wd!5Ic";
      stringArray0[2] = "href";
      stringArray0[3] = "col";
      htmlTreeBuilder0.popStackToClose(stringArray0);
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.inSelectScope("col");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Should not be reachable
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      boolean boolean0 = htmlTreeBuilder0.inButtonScope("V~9SzTD(x+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Document document0 = htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      assertEquals(1, document0.childNodeSize());
      
      htmlTreeBuilder0.popStackToClose("V~9SzTD(x+");
      boolean boolean0 = htmlTreeBuilder0.inScope((String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      boolean boolean0 = htmlTreeBuilder0.inTableScope("V~9SzTD(x+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Document document0 = htmlTreeBuilder0.parse(stringReader0, "R~9ZzTD(Y+", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.insert(document0);
      htmlTreeBuilder0.resetInsertionMode();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.popStackToBefore("V~9SzTD(x+");
      htmlTreeBuilder0.resetInsertionMode();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("object", parseSettings0);
      Element element0 = new Element(tag0, "object");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("fr[p';OE|D^3-b])i?", element0, "fr[p';OE|D^3-b])i?", parseErrorList0, parseSettings0);
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.insertOnStackAfter(element0, element0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Document document0 = htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      Element element0 = document0.body();
      htmlTreeBuilder0.insert(document0);
      htmlTreeBuilder0.aboveOnStack(element0);
      assertEquals(2, element0.childNodeSize());
      assertEquals(1, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Document document0 = htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      Element element0 = document0.body();
      Element element1 = htmlTreeBuilder0.aboveOnStack(element0);
      List<Node> list0 = htmlTreeBuilder0.parseFragment("5k$6j~", element1, "html", parseErrorList0, parseSettings0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.popStackToClose("3b:D? X0f7/^V");
      htmlTreeBuilder0.clearStackToTableBodyContext();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Document document0 = htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      Element element0 = document0.body();
      boolean boolean0 = htmlTreeBuilder0.removeFromStack(element0);
      assertTrue(boolean0);
      assertEquals(1, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell("vw[CSz.W[`+U^Obh.&.");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      List<Node> list0 = htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      assertEquals(1, list0.size());
      assertEquals(0, parseErrorList0.size());
      
      boolean boolean0 = htmlTreeBuilder0.removeFromStack(document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.insertInFosterParent(document0);
      assertEquals(1, document0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      Token.Comment token_Comment0 = new Token.Comment();
      htmlTreeBuilder0.insert(token_Comment0);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      Token.CData token_CData0 = new Token.CData("ol");
      htmlTreeBuilder0.insert(token_CData0);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      Token.StartTag token_StartTag0 = new Token.StartTag();
      CDataNode cDataNode0 = new CDataNode((String) null);
      Attributes attributes0 = cDataNode0.attributes();
      token_StartTag0.nameAttr("~b+.[cBak.:", attributes0);
      Element element0 = htmlTreeBuilder0.insertEmpty(token_StartTag0);
      assertEquals(1, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      HtmlTreeBuilderState htmlTreeBuilderState0 = HtmlTreeBuilderState.AfterFrameset;
      htmlTreeBuilder0.error(htmlTreeBuilderState0);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("noframes");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      HtmlTreeBuilderState htmlTreeBuilderState0 = HtmlTreeBuilderState.AfterFrameset;
      htmlTreeBuilder0.error(htmlTreeBuilderState0);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      htmlTreeBuilder0.maybeSetBaseUri(document0);
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Tag tag0 = Tag.valueOf("strong");
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "", attributes0);
      htmlTreeBuilder0.parseFragment("", formElement0, "script", (ParseErrorList) null, parseSettings0);
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.replaceOnStack(formElement0, formElement0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.clearStackToTableContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.originalState();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = new Element("td");
      boolean boolean0 = htmlTreeBuilder0.isSpecial(element0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = new Document("?_5LKBbqQ+t6u");
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.push(document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.setFosterInserts(false);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.replaceActiveFormattingElement((Element) null, (Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      boolean boolean0 = htmlTreeBuilder0.isFragmentParsing();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.isInActiveFormattingElements((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = new ParseErrorList(4, 100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Document document0 = htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.aboveOnStack(document0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      List<String> list0 = htmlTreeBuilder0.getPendingTableCharacters();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      String string0 = htmlTreeBuilder0.getBaseUri();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.inScope("<O");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = htmlTreeBuilder0.getDocument();
      assertNull(document0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      htmlTreeBuilder0.setPendingTableCharacters(linkedList0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.state();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.clearStackToTableRowContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      FormElement formElement0 = htmlTreeBuilder0.getFormElement();
      assertNull(formElement0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.newPendingTableCharacters();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.generateImpliedEndTags();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.markInsertionMode();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      CharacterReader characterReader0 = new CharacterReader("*xR1p,9m^jZ");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      Token.Tag token_Tag0 = tokeniser0.createTagPending(false);
      HtmlTreeBuilderState htmlTreeBuilderState0 = HtmlTreeBuilderState.Initial;
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.process(token_Tag0, htmlTreeBuilderState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.inListItemScope("l2:0r%N5DDaQOJs.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ArrayList<Element> arrayList0 = htmlTreeBuilder0.getStack();
      assertNull(arrayList0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("details");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parse(stringReader0, "V~9SzTD(x+", parseErrorList0, parseSettings0);
      Token.StartTag token_StartTag0 = new Token.StartTag();
      CDataNode cDataNode0 = new CDataNode((String) null);
      Attributes attributes0 = cDataNode0.attributes();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("~b+.[cBak.:", attributes0);
      FormElement formElement0 = htmlTreeBuilder0.insertForm(token_StartTag1, false);
      assertEquals(1, formElement0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = htmlTreeBuilder0.getHeadElement();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(100);
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parseFragment("", (Element) null, "3xce", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.clearStackToTableRowContext();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell(".@wQsSy5j'\"#Wd!5Ic");
      ParseErrorList parseErrorList0 = new ParseErrorList(100, 100);
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment(".@wQsSy5j'\"#Wd!5Ic", document0, "col", parseErrorList0, parseSettings0);
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Attributes attributes0 = new Attributes();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("html", attributes0);
      htmlTreeBuilder0.insertForm(token_StartTag1, true);
  }
}