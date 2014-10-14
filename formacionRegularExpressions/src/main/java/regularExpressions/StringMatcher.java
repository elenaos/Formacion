package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
	  // returns true if the string matches exactly "true"
	  public boolean isTrue(String s){
	    return s.matches("true");
	   
	  }
	  // returns true if the string matches exactly "true" or "True"
	  public boolean isTrueVersion2(String s){
	    return s.matches("[tT]rue");
	  }

	  // returns true if the string matches exactly "true" or "True"
	  // or "yes" or "Yes"
	  public boolean isTrueOrYes(String s){
	    return s.matches("[tT]rue|[yY]es");
	  }

	  // returns true if the string contains exactly "true"
	  public boolean containsTrue(String s){
	    return s.matches(".*true.*");
	  }
	  

	  // returns true if the string contains of three letters
	  public boolean isThreeLetters(String s){
	    return s.matches("[a-zA-Z]{3}");
	    // simpler from for
//	    return s.matches("[a-Z][a-Z][a-Z]");
	  }



	  // returns true if the string does not have a number at the beginning
	  public boolean isNoNumberAtBeginning(String s){
	    return s.matches("^[^\\d].*");
	  }
	  // returns true if the string contains a arbitrary number of characters except b
	  public boolean isIntersection(String s){
	    return s.matches("([\\w&&[^b]])*");
	  }
	  // returns true if the string contains a number less then 300
	  public boolean isLessThenThreeHundret(String s){
	    return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
	  }
	  
	  public String replace(String regex,String input,String replace){
		  Pattern p = Pattern.compile(regex);
	        // get a matcher object
	        Matcher m = p.matcher(input);
	        input = m.replaceAll(replace);
	        return input;
	  }
	  public String split(String regex, String input){
		  String aux="";
		  Pattern p = Pattern.compile(regex);
	        String[] items = p.split(input);
	        for(String s : items) {
	           aux=aux+s;
	          
	        }
		  return aux;
	  }
	  public  boolean regexTestHarness(String regex, String input){
		  //Escrbir patron
          Pattern pattern = 
          Pattern.compile(regex);
          //escribir string en el que buscar
          Matcher matcher = 
          pattern.matcher(input);
          boolean found = false;
          while (matcher.find() ) {
        
           /*   System.out.format("I found the text" +
                  " \"%s\" starting at " +
                  "index %d and ending at index %d.%n",
                  matcher.group(),
                  matcher.start(),
                  matcher.end());
             */ found = true;
             
          }
          if(!found){
              System.out.format("No match found.%n");
          }
          
		  return found;
	  }

	} 