package looping;

public class ForLoop {

    public static void main(String[] args) {

        for (int x = 0; needExit(x); x++){
            System.out.println(x);
        }
    }

    private static boolean needExit(int x){
        boolean exit;
        exit = x < 10;
        return exit;
    }
}
