package regularExpressions;

import static org.junit.Assert.*;




public class StringMatcherTestv3 {

	 private StringMatcher m;

	
	  public void setup(){
	    m = new StringMatcher();
	  }

	 public void testIsTrue() {
	    assertTrue(m.isTrue("true"));
	    assertFalse(m.isTrue("true2"));
	    assertFalse(m.isTrue("True"));
	  }


	  public void testIsTrueVersion2() {
	    assertTrue(m.isTrueVersion2("true"));
	    assertFalse(m.isTrueVersion2("true2"));
	    assertTrue(m.isTrueVersion2("True"));;
	  }


	  public void testIsTrueOrYes() {
	    assertTrue(m.isTrueOrYes("true"));
	    assertTrue(m.isTrueOrYes("yes"));
	    assertTrue(m.isTrueOrYes("Yes"));
	    assertFalse(m.isTrueOrYes("no"));
	  }


	  public void testContainsTrue() {
	    assertTrue(m.containsTrue("thetruewithin"));
	  }


	  public void testIsThreeLetters() {
	    assertTrue(m.isThreeLetters("abc"));
	    assertFalse(m.isThreeLetters("abcd"));
	  }


	  public void testisNoNumberAtBeginning() {
	    assertTrue(m.isNoNumberAtBeginning("abc"));
	    assertFalse(m.isNoNumberAtBeginning("1abcd"));
	    assertTrue(m.isNoNumberAtBeginning("a1bcd"));
	    assertTrue(m.isNoNumberAtBeginning("asdfdsf"));
	  }

	
	  public void testisIntersection() {
	    assertTrue(m.isIntersection("1"));
	    assertFalse(m.isIntersection("abcksdfkdskfsdfdsf"));
	    assertTrue(m.isIntersection("skdskfjsmcnxmvjwque484242"));
	  }


	  public void testLessThenThreeHundred() {
	    assertTrue(m.isLessThenThreeHundret("288"));
	    assertFalse(m.isLessThenThreeHundret("3288"));
	    assertFalse(m.isLessThenThreeHundret("328 8"));
	    assertTrue(m.isLessThenThreeHundret("1"));
	    assertTrue(m.isLessThenThreeHundret("99"));
	    assertFalse(m.isLessThenThreeHundret("300"));
	  }

	  public void testReplace(){
		  assertEquals("The cat says meow. All cats say meow.", m.replace("dog","The dog says meow. All dogs say meow.", "cat"));
	  }
	  public void testSplit(){
		  assertEquals("one:two:three:four:five","onetwothreefourfive");
	  }
}
