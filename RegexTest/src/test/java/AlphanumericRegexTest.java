import static org.junit.Assert.*;

import org.junit.Test;




	public class AlphanumericRegexTest {

	    @Test
	    void validStringMatchesRegexPattern() {
	        String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{7,10}$";
	        assertTrue("Abc12345".matches(regex));
	    }
	}


