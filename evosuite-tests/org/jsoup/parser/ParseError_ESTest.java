/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:35:21 GMT 2021
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.ParseError;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseError_ESTest extends ParseError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1979), "");
      String string0 = parseError0.toString();
      assertEquals("-1979: ", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseError parseError0 = new ParseError(559, "8@f;*YL<keRm`|K$;", (Object[]) null);
      assertEquals(559, parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1979), "");
      parseError0.getErrorMessage();
      assertEquals((-1979), parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1979), "");
      int int0 = parseError0.getPosition();
      assertEquals((-1979), int0);
  }
}