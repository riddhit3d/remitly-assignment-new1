package regex.com.cybage;


import java.util.regex.*;


public class RegexAplhanumeric {
    public static void main(String[] args) {
        // Regular expression pattern
        String regex = "(?:[-./]?[A-Za-z0-9]){7,10}$";

        // Strings to validate
        String[] strings = {"1234567", "BE1234567", "A.B-C/D", "TooShort","TooooooooLonggggggggggg","...///"};

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Iterate through the strings and validate them using regex
        for (String str : strings) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println(str + " is a valid string.");
            } else {
                System.out.println(str + " is not a valid string.");
            }
        }
    }
}

