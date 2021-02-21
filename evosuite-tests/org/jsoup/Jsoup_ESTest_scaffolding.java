/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Feb 21 20:10:02 GMT 2021
 */

package org.jsoup;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Jsoup_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.Jsoup"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/cgutie/Desktop/eecs481/hw2b/jsoup-master"); 
    java.lang.System.setProperty("user.home", "/home/cgutie"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "cgutie"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Jsoup_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.parser.HtmlTreeBuilderState$18",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.parser.HtmlTreeBuilderState$19",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.parser.HtmlTreeBuilderState$16",
      "org.jsoup.Connection$Response",
      "org.jsoup.parser.HtmlTreeBuilderState$17",
      "org.jsoup.parser.HtmlTreeBuilderState$14",
      "org.jsoup.parser.HtmlTreeBuilderState$15",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IsOnlyOfType",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.safety.Cleaner",
      "org.jsoup.nodes.Element",
      "org.jsoup.parser.HtmlTreeBuilderState$12",
      "org.jsoup.parser.HtmlTreeBuilderState$13",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.parser.HtmlTreeBuilderState$10",
      "org.jsoup.parser.HtmlTreeBuilderState$11",
      "org.jsoup.safety.Whitelist$TypedValue",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.nodes.Document",
      "org.jsoup.Jsoup",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.UnsupportedMimeTypeException",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.nodes.XmlDeclaration",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.select.Evaluator$TagEndsWith",
      "org.jsoup.parser.HtmlTreeBuilderState$23",
      "org.jsoup.parser.HtmlTreeBuilderState$24",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.parser.HtmlTreeBuilderState$21",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.parser.HtmlTreeBuilderState$22",
      "org.jsoup.parser.HtmlTreeBuilderState$20",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.nodes.Comment",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.select.Selector",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.jsoup.select.Collector$FirstFinder",
      "org.jsoup.helper.HttpConnection$KeyVal",
      "org.jsoup.safety.Whitelist$Protocol",
      "org.jsoup.nodes.Node",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.helper.DataUtil$BomCharset",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.nodes.DataNode",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.select.Evaluator$ContainsData",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.helper.Validate",
      "org.jsoup.select.Evaluator$CssNthEvaluator",
      "org.jsoup.parser.Token$Comment",
      "org.jsoup.select.Evaluator$IsFirstOfType",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.parser.TokeniserState$56",
      "org.jsoup.parser.TokeniserState$57",
      "org.jsoup.parser.ParseError",
      "org.jsoup.parser.TokeniserState$58",
      "org.jsoup.parser.TokeniserState$59",
      "org.jsoup.parser.TokeniserState$52",
      "org.jsoup.parser.TokeniserState$53",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.TokeniserState$54",
      "org.jsoup.parser.TokeniserState$55",
      "org.jsoup.nodes.PseudoTextElement",
      "org.jsoup.parser.TokeniserState$50",
      "org.jsoup.parser.TokeniserState$51",
      "org.jsoup.parser.Parser",
      "org.jsoup.select.Evaluator$IsEmpty",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.select.Evaluator$IsNthChild",
      "org.jsoup.parser.HtmlTreeBuilderState$Constants",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.parser.TokeniserState$67",
      "org.jsoup.parser.TokeniserState$63",
      "org.jsoup.nodes.Node$OuterHtmlVisitor",
      "org.jsoup.parser.TokeniserState$64",
      "org.jsoup.parser.TokeniserState$65",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.TokeniserState$66",
      "org.jsoup.safety.Cleaner$CleaningVisitor",
      "org.jsoup.parser.TokeniserState$60",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.parser.TokeniserState$61",
      "org.jsoup.parser.TokeniserState$62",
      "org.jsoup.select.Evaluator$IsNthLastOfType",
      "org.jsoup.parser.Tag",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.select.Evaluator$IsLastOfType",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.select.NodeFilter$FilterResult",
      "org.jsoup.Connection$KeyVal",
      "org.jsoup.nodes.Entities",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.parser.Token$CData",
      "org.jsoup.select.Elements",
      "org.jsoup.select.Evaluator$AllElements",
      "org.jsoup.safety.Whitelist$AttributeKey",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.nodes.BooleanAttribute",
      "org.jsoup.SerializationException",
      "org.jsoup.select.CombiningEvaluator$Or",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.safety.Whitelist$TagName",
      "org.jsoup.Connection$Base",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.select.Evaluator$IsNthOfType",
      "org.jsoup.safety.Whitelist",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.jsoup.internal.ConstrainableInputStream",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.select.Evaluator$IsFirstChild",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.select.NodeVisitor",
      "org.jsoup.parser.TokeniserState$2",
      "org.jsoup.parser.TokeniserState$12",
      "org.jsoup.parser.TokeniserState$1",
      "org.jsoup.parser.TokeniserState$13",
      "org.jsoup.parser.TokeniserState$14",
      "org.jsoup.parser.TokeniserState$15",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.TokeniserState$10",
      "org.jsoup.parser.TokeniserState$11",
      "org.jsoup.nodes.DocumentType",
      "org.jsoup.parser.TokeniserState$9",
      "org.jsoup.parser.TokeniserState$8",
      "org.jsoup.Connection$Request",
      "org.jsoup.parser.TokeniserState$7",
      "org.jsoup.parser.TokeniserState$6",
      "org.jsoup.parser.TokeniserState$5",
      "org.jsoup.HttpStatusException",
      "org.jsoup.parser.TokeniserState$4",
      "org.jsoup.select.QueryParser",
      "org.jsoup.parser.TokeniserState$3",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.safety.Whitelist$AttributeValue",
      "org.jsoup.select.Evaluator$IsOnlyChild",
      "org.jsoup.parser.TokeniserState$16",
      "org.jsoup.parser.TokeniserState$17",
      "org.jsoup.parser.TokeniserState$18",
      "org.jsoup.parser.TokeniserState$19",
      "org.jsoup.nodes.Entities$1",
      "org.jsoup.parser.TokeniserState$23",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.parser.TokeniserState$24",
      "org.jsoup.Connection$Method",
      "org.jsoup.parser.TokeniserState$25",
      "org.jsoup.parser.TokeniserState$26",
      "org.jsoup.parser.TokeniserState$20",
      "org.jsoup.parser.TokeniserState$21",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.parser.TokeniserState$22",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.select.NodeFilter",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.jsoup.parser.TokeniserState$27",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.TokeniserState$28",
      "org.jsoup.parser.TokeniserState$29",
      "org.jsoup.parser.TokeniserState$34",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.jsoup.parser.TokeniserState$35",
      "org.jsoup.parser.TokeniserState$36",
      "org.jsoup.parser.TokeniserState$37",
      "org.jsoup.parser.TokeniserState$30",
      "org.jsoup.parser.TokeniserState$31",
      "org.jsoup.parser.TokeniserState$32",
      "org.jsoup.parser.TokeniserState$33",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.select.Evaluator$MatchText",
      "org.jsoup.safety.Cleaner$ElementMeta",
      "org.jsoup.select.Evaluator",
      "org.jsoup.Connection",
      "org.jsoup.select.Evaluator$IsRoot",
      "org.jsoup.parser.TokeniserState$38",
      "org.jsoup.parser.TokeniserState$39",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.parser.TokeniserState$45",
      "org.jsoup.parser.TokeniserState$46",
      "org.jsoup.parser.TokeniserState$47",
      "org.jsoup.parser.TokeniserState$48",
      "org.jsoup.parser.TokeniserState$41",
      "org.jsoup.select.Evaluator$IsLastChild",
      "org.jsoup.parser.TokeniserState$42",
      "org.jsoup.select.Evaluator$IsNthLastChild",
      "org.jsoup.parser.TokeniserState$43",
      "org.jsoup.parser.TokeniserState$44",
      "org.jsoup.parser.TokeniserState$40",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.HtmlTreeBuilderState$2",
      "org.jsoup.parser.HtmlTreeBuilderState$1",
      "org.jsoup.parser.HtmlTreeBuilderState$4",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.parser.HtmlTreeBuilderState$3",
      "org.jsoup.parser.HtmlTreeBuilderState$9",
      "org.jsoup.parser.HtmlTreeBuilderState$6",
      "org.jsoup.parser.TokeniserState$49",
      "org.jsoup.parser.HtmlTreeBuilderState$5",
      "org.jsoup.parser.HtmlTreeBuilderState$8",
      "org.jsoup.parser.HtmlTreeBuilderState$7"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Jsoup_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.Jsoup",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.parser.Parser",
      "org.jsoup.nodes.Node",
      "org.jsoup.nodes.Element",
      "org.jsoup.nodes.Document",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.parser.Tag",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.parser.Token$Comment",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.select.Elements",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.HtmlTreeBuilderState$24",
      "org.jsoup.safety.Whitelist",
      "org.jsoup.safety.Whitelist$TypedValue",
      "org.jsoup.safety.Whitelist$TagName",
      "org.jsoup.safety.Whitelist$AttributeKey",
      "org.jsoup.safety.Whitelist$Protocol",
      "org.jsoup.safety.Whitelist$AttributeValue",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.safety.Cleaner",
      "org.jsoup.safety.Cleaner$CleaningVisitor",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.nodes.Node$OuterHtmlVisitor",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.nodes.Entities$1",
      "org.jsoup.internal.ConstrainableInputStream",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.Connection$Method",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.jsoup.parser.ParseError",
      "org.jsoup.parser.HtmlTreeBuilderState$Constants",
      "org.jsoup.HttpStatusException",
      "org.jsoup.select.Selector",
      "org.jsoup.select.QueryParser",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.select.CombiningEvaluator$Or",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.helper.Validate",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.nodes.Entities",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.nodes.Document$QuirksMode"
    );
  }
}
