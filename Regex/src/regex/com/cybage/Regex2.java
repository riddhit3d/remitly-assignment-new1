package regex.com.cybage;
import java.util.regex.*;

public class Regex2 {
    public static void main(String[] args) {
        // Regular expression pattern
        String regex = "^[A-Za-z0-9./-]{7,10}$";

        // Strings to validate
        String[] strings = {"1234567", "BE1234567", "A.B-C/Dddd", "TooShort", "Special!@#",
        		"riiiiiiiiiiidddiiiii5252526363","..//abcdridddjdhi","riddhi-","ridhi8585",
        		"yuio"
        		};

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Iterate through the strings and validate them using regex
        for (String str : strings) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()){
            	
                int length = str.replaceAll("[./-]", "").length();
                if (length < 7) {
                    System.out.println(str+"   length is less than required.");
                    break;
                } else if (length >  7 && length== 10) {
                }

                System.out.println(str + " is a valid string. Length (excluding special characters): " + length);
            } else {
                System.out.println(str + " is not a valid string.");
                
            }
        }
    }
}
