package strings;

/**
 * Read this: https://www.quora.com/How-do-you-declare-a-string-in-Java/answer/Igor-Polevoy
 */
public class Interning {

    public static void main(String[] args) {

        String x = "abc";
        String y = "abc";

        if(x.equals(y)) {
            System.out.println("equal"); // CORRECT
        }else {
            System.out.println("not equal");
        }

        if(x == y) {
            System.out.println("equal");  // CORRECT
        }else {
            System.out.println("not equal");
        }
    }


}
