package strings;

public class Concatenating {

    public static void main(String[] args) {

        String x = "abc";
        String y = "xyz";
        String z = "sddsd";

        // not the best way to concat.
        System.out.println("Standard concatenation: " + x + y + z);

        //Better way to concatenate;
        StringBuffer sb = new StringBuffer(256);// default is 16 chars
        sb.append(x).append(y).append(z);

        System.out.println("StringBuffer concatenation: " + sb.toString());
    }
}
