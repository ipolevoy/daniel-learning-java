package packages;


import looping.Util;

public class SomeClass {

    public static void main(String[] args) {


        System.out.println(Util.purpose());

        System.out.println(Util.class.getCanonicalName());
        System.out.println(Util.class.getName());
        System.out.println(Util.class.getSimpleName());

    }
}
