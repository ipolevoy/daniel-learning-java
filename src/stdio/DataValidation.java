//package stdio;

import java.lang.Math;
import java.util.Scanner;

public class DataValidation {

            boolean isNumber(String str) {
                try {
                    double x = Double.parseDouble(str);
                }
                catch(NumberFormatException nfe) {
                    return false;
                    
                }
                    return true;
    }
}   

