package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {


    public static void main(String args[]) {
        // String to be scanned to find the pattern.
        String line1 = "This order was placed for QT3000! OK?";
        String pattern1 = ".*order.*";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern1);
        // Now create matcher object.
        Matcher m = r.matcher(line1);
        String out = m.matches() ? "Found an \"order\"" : "did not find anything!";
        System.out.println(out);

    }
}



