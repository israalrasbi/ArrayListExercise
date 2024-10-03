import java.util.ArrayList;
import java.util.Scanner;


public class CommonEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //define the arrays
        ArrayList<Integer> a = readArray(sc, "first");
        ArrayList<Integer> b = readArray(sc, "second");
        //print the result
        System.out.println("Does the arrays have common ends? " + commonEnd(a, b));

    }

    public static boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
        //define variables to take the length of both arrays
        int aLen = a.size();
        int bLen = b.size();
        return a.get(0) == b.get(0) || a.get(aLen - 1) == b.get(bLen - 1);
    }

    public static ArrayList<Integer> readArray(Scanner sc, String arrayName) {
        //define the new array
        ArrayList<Integer> arr = new ArrayList<>();
        //ask the user to enter the element
        System.out.println("Enter numbers for the " + arrayName + " array, when finished enter -1: ");
        while (true) {
            int number = sc.nextInt();
            //if user enter -1, then exit
            if (number == -1) {
                break;
            }
            //otherwise, add elements
            arr.add(number);
        }
        return arr;
    }
}