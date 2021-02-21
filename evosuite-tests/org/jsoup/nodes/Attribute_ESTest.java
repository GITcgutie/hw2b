/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 19:52:53 GMT 2021
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Attribute_ESTest extends Attribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attribute attribute0 = new Attribute("##0+'^$CfRpqTEv{F", "itemscope");
      Attributes attributes0 = new Attributes();
      attribute0.parent = attributes0;
      attribute0.setValue((String) null);
      attribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attribute attribute0 = new Attribute("!q", "!q");
      attribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attribute attribute0 = new Attribute("##0+'^$CfRpqTEv{F", "itemscope");
      Attributes attributes0 = new Attributes();
      attribute0.parent = attributes0;
      assertEquals("itemscope", attribute0.getValue());
      
      String string0 = attribute0.setValue((String) null);
      assertNotNull(string0);
      
      Attribute attribute1 = attribute0.clone();
      boolean boolean0 = attribute0.equals(attribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attribute attribute0 = new Attribute("##0+'^$CfRpqTEv{F", "itemscope");
      Attribute attribute1 = Attribute.createFromEncoded("##0+'^$CfRpqTEv{F", "BSWdomjI4IHl");
      //  // Unstable assertion: assertFalse(attribute1.equals((Object)attribute0));
      
      Attributes attributes0 = new Attributes();
      attribute0.parent = attributes0;
      attribute0.setValue((String) null);
      boolean boolean0 = attribute0.equals(attribute1);
      //  // Unstable assertion: assertTrue(attribute1.equals((Object)attribute0));
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attribute attribute0 = new Attribute("!q", "!q");
      Attribute attribute1 = attribute0.clone();
      boolean boolean0 = attribute0.equals(attribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("Xd", "z_P9:4bGL[7");
      boolean boolean0 = attribute0.equals("allowfullscreen");
      assertEquals("z_P9:4bGL[7", attribute0.getValue());
      assertFalse(boolean0);
      assertEquals("Xd", attribute0.getKey());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attribute attribute0 = new Attribute("fLG", (String) null, (Attributes) null);
      boolean boolean0 = attribute0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = Attribute.createFromEncoded("Xd", "z_P9:4bGL[7");
      Attribute attribute1 = new Attribute("5%1z`/?s_Q", "5%1z`/?s_Q", attributes0);
      boolean boolean0 = attribute0.equals(attribute1);
      assertEquals("z_P9:4bGL[7", attribute0.getValue());
      assertEquals("Xd", attribute0.getKey());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("9gt>;bN=", (String) null, attributes0);
      boolean boolean0 = attribute0.isBooleanAttribute();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("Xd", "z_P9:4bGL[7");
      boolean boolean0 = attribute0.isBooleanAttribute();
      assertEquals("z_P9:4bGL[7", attribute0.getValue());
      assertFalse(boolean0);
      assertEquals("Xd", attribute0.getKey());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attribute attribute0 = new Attribute("truespeed", "html");
      boolean boolean0 = attribute0.isBooleanAttribute();
      assertTrue(boolean0);
      assertEquals("html", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(3160);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      Attribute.html("n;.\"P,g`-Gw`76g\"!c", "n;.\"P,g`-Gw`76g\"!c", (Appendable) stringWriter0, document_OutputSettings1);
      assertEquals("n;.\"P,g`-Gw`76g\"!c=\"n;.&quot;P,g`-Gw`76g&quot;!c\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Attribute.isDataAttribute("data-U\"vFL5;{g[[<2'c?4Wk");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Attribute.isDataAttribute("data-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Attribute attribute0 = new Attribute("gFHZ", (String) null);
      String string0 = attribute0.toString();
      assertEquals("gFHZ", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("9>UujOUw=>E;", "");
      Attribute attribute0 = new Attribute("9>UujOUw=>E;", "9>UujOUw=>E;", attributes1);
      String string0 = attribute0.setValue("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("#.*:>u7(J(Le+}Mg", "3 ", attributes0);
      assertEquals("#.*:>u7(J(Le+}Mg", attribute0.getKey());
      
      attribute0.setKey("U");
      assertEquals("3 ", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded(") `#8I^a\"", ") `#8I^a\"");
      Attributes attributes0 = new Attributes();
      attributes0.put(attribute0);
      attribute0.setKey("y!.5;aagN!;l;");
      assertEquals("y!.5;aagN!;l;", attribute0.getKey());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attribute attribute0 = new Attribute("ulMi<]ple", "ulMi<]ple");
      attribute0.setKey("ulMi<]ple");
      assertEquals("ulMi<]ple", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attribute attribute0 = new Attribute("multiple", "");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean0 = attribute0.shouldCollapseAttribute(document_OutputSettings0);
      assertEquals("", attribute0.getValue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("9>UujOUw=>E;", "9>UujOUw=>E;", attributes0);
      String string0 = attribute0.toString();
      assertEquals("9>UujOUw=>E;=\"9>UujOUw=>E;\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("9>UujOUw=>E;", "9>UujOUw=>E;", attributes0);
      boolean boolean0 = attribute0.isDataAttribute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attribute attribute0 = new Attribute("#", "noshade");
      String string0 = attribute0.html();
      assertEquals("#=\"noshade\"", string0);
  }
}
