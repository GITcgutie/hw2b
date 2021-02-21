/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:31:27 GMT 2021
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.ParseErrorList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseErrorList_ESTest extends ParseErrorList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseErrorList parseErrorList0 = new ParseErrorList(770, 770);
      boolean boolean0 = parseErrorList0.canAddError();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      boolean boolean0 = parseErrorList0.canAddError();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      int int0 = parseErrorList0.getMaxSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      assertTrue(parseErrorList0.isEmpty());
  }
}
