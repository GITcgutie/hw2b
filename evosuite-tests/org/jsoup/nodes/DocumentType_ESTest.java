/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:04:47 GMT 2021
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DocumentType_ESTest extends DocumentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, "", (String) null, (String) null);
      MockFile mockFile0 = new MockFile("label");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      documentType0.outerHtmlHead(mockFileWriter0, 65535, document_OutputSettings0);
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DocumentType documentType0 = new DocumentType(".xl;", ".xl;", ".xl;", "");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      Document.OutputSettings document_OutputSettings0 = documentType0.getOutputSettings();
      documentType0.outerHtmlHead(mockPrintStream0, 1135, document_OutputSettings0);
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("#doctype", "9ga1[=1JV#vhmKKn.d", "#doctype", "9ga1[=1JV#vhmKKn.d", "#doctype");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("%");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      documentType0.outerHtmlHead(mockPrintWriter0, 368, document_OutputSettings1);
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("#doctype", "9ga1[=1JV#vhmKKn.d", "#doctype", "9ga1[=1JV#vhmKKn.d", "#doctype");
      documentType0.setPubSysKey("}T>8vx=<o");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, "nth-last-child", ".%s");
      documentType0.setPubSysKey((String) null);
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, "Un8gib/(>6pV", "sub", "systemId");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("$@aV9<A?#Z'", "0", "org.jsoup.select.Evaluator$AttributeWithValueNot");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "", "B[4%.jy[^r8[aGF");
      StringBuffer stringBuffer0 = new StringBuffer();
      documentType0.html(stringBuffer0);
  }
}
