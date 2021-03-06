/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:05:09 GMT 2021
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.CDataNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CDataNode_ESTest extends CDataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("form");
      cDataNode0.text();
      assertEquals("#cdata", cDataNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("form");
      String string0 = cDataNode0.toString();
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals("<![CDATA[form]]>", string0);
  }
}
