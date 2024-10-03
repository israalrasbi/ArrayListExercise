import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxTriple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        //ask the user to enter the elements
        System.out.println("Enter numbers to the list, when finished enter -1:  ");

        //add the elements
        while (true) {
            try {
                int number = sc.nextInt();
                if (number == -1) {
                    break;
                }
                arr.add(number);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                sc.next();
            }
        }

        //check that the size is odd
        if (arr.size() % 2 != 0) {
            //if odd, then call the function
            System.out.println("The maximum element is: " + maxTriple(arr));
        }
        //otherwise, print a message
        else {
            System.out.println("The list size should be odd");
        }
    }

    public static int maxTriple(ArrayList<Integer> arr) {
        //define variables to store the value of first, last, and middle element
        int firstElement = arr.getFirst();
        int lastElement = arr.get(arr.size() - 1);
        int middleElement = arr.get(arr.size() / 2);
        //return the max using the math library
        return Math.max(firstElement, Math.max(lastElement, middleElement));
    }
}