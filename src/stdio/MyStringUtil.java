//package stdio;

import java.io.IOException;

public class MyStringUtil {
	StringBuffer sbs = new StringBuffer();
	void stringReverse(StringBuffer sb) {
		for (int i = sb.length() -1; i >= 0; i--) {
			sbs.append(sb.charAt(i));
		//System.out.println(i);
		}
		System.out.println(sbs);
	}
	
	void printString(StringBuffer sb) {
		for (int i = 0; i <= sbs.length() - 1; i++) {
			System.out.print(sbs.charAt(i));
		}
		System.out.println(sbs);
	}
	void subStr(int offset, StringBuffer sb) { 
		for (int i = 0; i <= offset; i++) {
         	       System.out.print(sbs.charAt(i));
		}
	}
}
