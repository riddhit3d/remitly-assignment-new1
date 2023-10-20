import static org.junit.Assert.*;

import static org.junit.Assert.*;
import java.util.regex.Pattern;


	public class Test {

	    private static final String REGEX_PATTERN = "^(?=.*[A-Za-z])(?=.*\\\\d)[A-Za-z\\\\d]{7,10}$";
	    private static final Pattern PATTERN = Pattern.compile(REGEX_PATTERN);

	    @org.junit.Test
   public void testValidStrings() {
	    	
	    
    assertFalse(PATTERN.matcher("1234acdhw").matches());
	        assertFalse(PATTERN.matcher("tripathi1234").matches());
        assertFalse(PATTERN.matcher("riddhi12re").matches());
	    }

	    @org.junit.Test
	    public void testInvalidStrings() {
	        assertFalse(PATTERN.matcher("A123456").matches());
	        assertFalse(PATTERN.matcher("abcde85").matches());
	      
	        assertFalse(PATTERN.matcher("A123456789").matches());
	        assertFalse(PATTERN.matcher("Aa1!").matches());
	        assertFalse(PATTERN.matcher("AbcDefGhIj").matches());
	        assertFalse(PATTERN.matcher("@A1b2c3D4e").matches());
        assertFalse(PATTERN.matcher("AbcDef!g").matches());
	    }
	  
	}


