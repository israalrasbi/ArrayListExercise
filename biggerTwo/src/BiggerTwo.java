import java.util.ArrayList;
import java.util.Scanner;

public class BiggerTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //define the arrays
        ArrayList<Integer> a = readArray(sc, "first");
        ArrayList<Integer> b = readArray(sc, "second");
        //print the result
        System.out.println("The bigger array is:  " + biggerTwo(a, b));
    }

    public static ArrayList<Integer> biggerTwo(ArrayList<Integer> a, ArrayList<Integer> b) {
        //calculate the sum of each array
        int sumOfA = a.get(0) + a.get(1);
        int sumOfB = b.get(0) + b.get(1);

        //check if the sum of a is bigger, then return a
        if (sumOfA > sumOfB) {
            return a;
        }
        //check if the sum of b is bigger, then return b
        else if (sumOfA < sumOfB) {
            return b;
        }
        //else, both has the same sum, then return a
        else {
            return a;
        }

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