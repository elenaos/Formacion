package regularExpressions;

public class RegexMatcher {
	  private final String regex;

	    public RegexMatcher(final String regex) {
	        this.regex = regex;
	    }

	 
	    public static RegexMatcher matchesRegex(final String regex) {
	        return new RegexMatcher(regex);
	    }
}
