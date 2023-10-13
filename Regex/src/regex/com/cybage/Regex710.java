package regex.com.cybage;

import java.util.regex.*;
public class Regex710 {
    public static void main(String[] args) {
        // Regular expression pattern
    	 String regex = "^[A-Za-z0-9][-./]?[A-Za-z0-9]{5,8}$";

        // Strings to validate
        String[] strings = {"1234567", "BE1234567", "AB-C/D", "TooShort", "TooLong123456","a.."};

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Iterate through the strings and validate them using regex
        for (String str : strings) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                int length = str.replaceAll("[-./]", "").length();
                System.out.println(str + " is a valid string. Length without special characters: " + length);
            } else {
                System.out.println(str + " is not a valid string.");
            }
        }
    }
}
