

		package regex.com.cybage;
		import java.util.regex.*;

		public class Regex {
		    public static void main(String[] args) {
		        // Regular expression pattern
		        String regex = "^[A-Za-z0-9./-]{1,10}$";

		        // Strings to validate
		        String[] strings = {"1230dfg","rid","1234567", "BE1234567", "A.B-C/Dddd", "TooShort", "Special!@#","riiiiiiiiiiidddiiiii5252526363","..//abcdriddhi","riddhi-",
		        		"ridd1","yuop"};

		        Pattern pattern = Pattern.compile(regex);

		        for (String str : strings) {
		            Matcher matcher = pattern.matcher(str);
		            if (matcher.matches()){
		            	
		                int length = str.replaceAll("[./-]", "").length();
		                
		                System.out.println( str   +"matched but length is not in range");
		                 if (length >= 7 && length<= 10) {
		               

		                System.out.println(str + " is a valid string. Length (excluding special characters): " + length);
		            }}
		           
		            else
		            {
		                System.out.println(str + " is not a valid string.");
		                
		            }
		        }
		    }
		}
