/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:06:35 GMT 2021
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities.CoreCharset.byName("");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Charset charset0 = Charset.forName("ascii");
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset(charset0);
      String string0 = Entities.escape("]D7ij", document_OutputSettings1);
      assertEquals("]D7ij", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.encoder();
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.fallback;
      document_OutputSettings0.coreCharset = entities_CoreCharset0;
      String string0 = Entities.escape("l8};FFuu*q$3B2>|\"p", document_OutputSettings0);
      assertEquals("l8};FFuu*q$3B2&gt;|\"p", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      Entities.escape((Appendable) mockPrintStream0, "l8};FFuu*q$3B2|\"p", document_OutputSettings0, true, true, true);
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
      Entities.escape((Appendable) stringWriter0, "PKLQ,Yk<}=5", document_OutputSettings1, true, false, true);
      assertEquals("PKLQ,Yk&lt;}=5", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      PipedWriter pipedWriter0 = new PipedWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.escapeMode(entities_EscapeMode0);
      try { 
        Entities.escape((Appendable) pipedWriter0, "\u00A0", document_OutputSettings0, false, false, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      try { 
        Entities.escape((Appendable) pipedWriter0, "\u00A0", document_OutputSettings0, false, false, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      String string0 = Entities.escape("s5N*BFQ&gt;%Ot^FZvi", document_OutputSettings0);
      assertEquals("s5N*BFQ&amp;gt;%Ot^FZvi", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      MockPrintStream mockPrintStream0 = new MockPrintStream("u#K4x~Jg");
      Entities.escape((Appendable) mockPrintStream0, "                ", document_OutputSettings0, false, true, false);
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Entities.escape((Appendable) charArrayWriter0, "  >HIUw:o y+i[y]", document_OutputSettings0, true, true, true);
      assertEquals(15, charArrayWriter0.size());
      assertEquals(">HIUw:o y+i[y]", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      MockPrintStream mockPrintStream0 = new MockPrintStream("UTF-8En'hnaZ:'QR4I-7");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      BufferedWriter bufferedWriter0 = new BufferedWriter(mockPrintWriter0);
      Entities.escape((Appendable) bufferedWriter0, "<ilNd", document_OutputSettings0, true, true, false);
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Entities.escape((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = Entities.codepointsForName("", intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = Entities.getByName("gd>");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = Entities.getByName("nbsp");
      assertNotNull(string0);
      assertEquals("\u00A0", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Entities.unescape("amp=i2;&gt=3q;3lt=1o;2&quoty;0&");
      assertEquals("amp=i2;>=3q;3lt=1o;2&quoty;0&", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("cacute");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(8202);
      assertEquals("hairsp", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(62);
      assertEquals("gt", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(160);
      assertEquals("nbsp", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(1810);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = Entities.escape("C#HEN7^:aML<\"lL");
      assertEquals("C#HEN7^:aML&lt;\"lL", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Character character0 = Entities.getCharacterByName(".@sghZ:J+}Qg\"( ");
      assertEquals('\uFFFF', (char)character0);
  }
}