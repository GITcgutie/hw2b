/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:14:16 GMT 2021
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnsupportedMimeTypeException_ESTest extends UnsupportedMimeTypeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("%<IlXwo", "%<IlXwo", "");
      String string0 = unsupportedMimeTypeException0.getMimeType();
      assertEquals("%<IlXwo", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("%<IlXwo", "%<IlXwo", "");
      String string0 = unsupportedMimeTypeException0.toString();
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: %<IlXwo. Mimetype=%<IlXwo, URL=", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("%<IlXwo", "%<IlXwo", "");
      String string0 = unsupportedMimeTypeException0.getUrl();
      assertEquals("", string0);
  }
}
