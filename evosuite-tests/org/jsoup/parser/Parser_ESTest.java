/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:28:00 GMT 2021
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("c`h|f}<wm>fcwP", "");
      assertEquals("", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      assertFalse(parser0.isTrackErrors());
      
      parser0.setTrackErrors(854);
      StringReader stringReader0 = new StringReader("");
      parser0.parseInput((Reader) stringReader0, "");
      assertTrue(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      // Undeclared exception!
      try { 
        parser0.parseInput((Reader) pipedReader0, "org.jsou.parserParser");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Parser parser0 = new Parser(xmlTreeBuilder0);
      assertFalse(parser0.isTrackErrors());
      
      Parser parser1 = parser0.setTrackErrors(2589);
      parser1.parseInput("8pl", "8pl");
      assertTrue(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      parser0.parseInput("org.jsou.parserParser", "org.jsou.parserParser");
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = new Document("Qp_Kwa");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(2291);
      List<Node> list0 = Parser.parseFragment("k0R~lNg&~@X`^2PZ", (Element) document0, "", parseErrorList0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      parser0.settings();
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      parser0.getTreeBuilder();
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      parser0.getErrors();
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Parser.parseBodyFragmentRelaxed("$g}D", "$g}D");
      assertEquals("#document", document0.nodeName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser.parseXmlFragment("", "");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      Parser parser1 = parser0.settings(parseSettings0);
      assertFalse(parser1.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = Parser.unescapeEntities("$g}D", false);
      assertEquals("$g}D", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Parser parser1 = parser0.setTreeBuilder(htmlTreeBuilder0);
      assertFalse(parser1.isTrackErrors());
  }
}