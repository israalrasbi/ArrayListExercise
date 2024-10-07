import java.util.ArrayList;
import java.util.Scanner;

public class FirstElementsExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //define the arrays
        ArrayList<Integer>a = readArray(sc,"first");
        ArrayList<Integer>b = readArray(sc,"second");
        //print the result
        System.out.println("New list: " + front11(a, b));

    }

    public static ArrayList<Integer> front11(ArrayList<Integer> a, ArrayList<Integer> b) {
        //initialize an array list that will store the result
        ArrayList<Integer> result = new ArrayList<>();

        //if both lists are empty, return an empty ArrayList
        if (a.isEmpty() && b.isEmpty()) {
            return result;
        }

        //If list 'a' is not empty, add its first element to the result
        if (!a.isEmpty()) {
            result.add(a.get(0));
        }

        //If list 'b' is not empty, add its first element to the result
        if (!b.isEmpty()) {
            result.add(b.get(0));
        }

        return result;
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