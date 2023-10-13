package regex.com.cybage;


import java.util.regex.*;

public class  Regexexamplelength {
    public static void main(String[] args) {
       // Regular expression pattern
        String regex = "^[A-Za-z0-9]+([-./]?[A-Za-z0-9]+)*$";

        // Strings to validate
        String[] strings = {"12345", "Hello-World", "Special!@#", "A.B-C/D","riiiiiiiiiiiiiiiidddhiiii41414152"};

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Iterate through the strings and validate them using regex
        for (String str : strings) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                int length = str.replaceAll("[-./]", "").length();
                System.out.println(str + " is a valid string. Length: " + length);
            } else {
                System.out.println(str + " is not a valid string.");
            }
        }
    }
}
