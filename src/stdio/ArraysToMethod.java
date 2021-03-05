package stdio;
import java.util.Scanner;

public class ArraysToMethod {
    public static void arrayMethod(int [] array, double num) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + num);
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] newArray = new int[size];
        
        for (int i = 0; i < size; i++) {
            newArray[i] = sc.nextInt() + 1000;
        }
        arrayMethod (newArray, 5.03);

 }       
}        
