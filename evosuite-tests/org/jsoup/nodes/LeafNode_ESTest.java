/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:04:11 GMT 2021
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LeafNode_ESTest extends LeafNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataNode dataNode0 = new DataNode("pBM,(\";]q6>", "pBM,(\";]q6>");
      Document document0 = new Document("#declaration");
      dataNode0.parentNode = (Node) document0;
      String string0 = dataNode0.baseUri();
      assertEquals("#declaration", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataNode dataNode0 = new DataNode("pBM,(\";]q6>", "pBM,(\";]q6>");
      String string0 = dataNode0.baseUri();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("W5J6,-%c@][Eb");
      String string0 = textNode0.attr("=#eT6PdH");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "", "");
      assertFalse(documentType0.hasParent());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Comment comment0 = new Comment("e", "");
      comment0.setBaseUri("y&pw'\"");
      assertFalse(comment0.hasParent());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DataNode dataNode0 = new DataNode("");
      DataNode dataNode1 = dataNode0.setWholeData("7N?'2L7o1g<C#.");
      assertEquals("#data", dataNode1.nodeName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("W5J6,-%c@][Eb");
      String string0 = textNode0.absUrl("`4[0*-*?8");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DataNode dataNode0 = new DataNode("");
      // Undeclared exception!
      try { 
        dataNode0.ensureChildNodes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Leaf Nodes do not have child nodes.
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DataNode dataNode0 = new DataNode("I1", "kOC&Dcj3J");
      dataNode0.removeAttr("");
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("]xz!ZyFmLJS");
      String string0 = cDataNode0.text();
      assertEquals("]xz!ZyFmLJS", string0);
  }
}
