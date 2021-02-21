/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 21 20:22:32 GMT 2021
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataUtil_ESTest extends DataUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)87;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        DataUtil.load((InputStream) byteArrayInputStream0, "", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-81);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        DataUtil.load((InputStream) byteArrayInputStream0, "", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = DataUtil.mimeBoundary();
      assertEquals("--------------------------------", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = DataUtil.getCharsetFromContentType((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = DataUtil.getCharsetFromContentType("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Z");
      mockFile0.mkdirs();
      try { 
        DataUtil.readFileToByteBuffer(mockFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "$,P*;G/0!~^:[c%");
      try { 
        DataUtil.readFileToByteBuffer(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File does not exist, and RandomAccessFile is not open in write mode
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = MockFile.createTempFile("-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
      ByteBuffer byteBuffer0 = DataUtil.readFileToByteBuffer(file0);
      assertFalse(byteBuffer0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        DataUtil.readToByteBuffer(byteArrayInputStream0, (-335));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize must be 0 (unlimited) or larger
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Document document0 = DataUtil.load((InputStream) byteArrayInputStream0, (String) null, "`c)kilg5HE{_)o(aB");
      assertEquals("`c)kilg5HE{_)o(aB", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document document0 = DataUtil.load((InputStream) null, "[\"']", "[\"']");
      assertEquals("[\"']", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("`c)kilg5HE{_)o(aB");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(objectOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      DataUtil.crossStreams(byteArrayInputStream0, dataOutputStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      Parser parser0 = Parser.xmlParser();
      try { 
        DataUtil.load((InputStream) pushbackInputStream0, "", "", parser0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = MockFile.createTempFile("V`ii", "$hcS3{6K");
      try { 
        DataUtil.load(file0, "$hcS3{6K", "r&_xU'");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteBuffer byteBuffer0 = DataUtil.emptyByteBuffer();
      assertEquals(0, byteBuffer0.capacity());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        DataUtil.readToByteBuffer((InputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }
}
