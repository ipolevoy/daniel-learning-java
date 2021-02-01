class StrBuff {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");

		System.out.println(str.length() + "is" + str);
		str.setLength(10);
		System.out.println(str.length() + str.toString());
	
		String theStr = "Chain";

		int result = theStr.codePointAt(0);
		System.out.println(result);

		int result3 = theStr.codePointBefore(1);
		System.out.println(result3);
	
		int result4 = theStr.codePointCount(0,4);
		System.out.println(result4);
	
		char result2 = theStr.charAt(0);
		System.out.println(result2);

		int result5 = str.offsetByCodePoints(2,4);
		System.out.println(result5);
	}
}
