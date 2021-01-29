package strings;

class Strings {

    public static void main(String[] args) {

        //step 1
        String str = "daniel";
        String str1 = " and Michael";

        //step 2
        str = str + str1;
        System.out.println(str);


        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";

        String result = ((a + b) + c) + d;
        /*

        Concatenating strings with a plus operator creates tem objects that take some resources
        such as CPU and heap

        Step 1 (a + b) - creates a temp object "ab"
        Step 2 "ab" + c = "abc" - creates a temp object
        Step 3 "abc" + d - final string: "abcd"
        resuls: "ab" and "abc" are floating garbage
         */

        System.out.println(result); // "abcd"



        String x = "abc";
        String y = x.concat("d");

        System.out.println("y: " + y);
        System.out.println("x: " + x);
        System.out.println("abcdef".concat("g"));




        String str2 = "daniel";
        String concat = str + str1 + str2;
        int num = 75;
        double dbl = 34.24;
        String spaces = " Hello and Hi and Welcome ";


        System.out.println(str.charAt(3));
        System.out.println(concat);
        System.out.println(str.equals(str2) + " " + str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str2) + " " + str.equalsIgnoreCase(str1));
        System.out.println(str1.toUpperCase());
        System.out.println(spaces.trim());


        String bruh = new String("Wowzers");
        char[] array = bruh.toCharArray();

        for (char z : array) {
            System.out.println(array[5]);
            System.out.println(z);
        }
        System.out.print(array[6] + array[5] + array[4] + array[3] + array[2] + array[1] + array[0]);


    }
}		
