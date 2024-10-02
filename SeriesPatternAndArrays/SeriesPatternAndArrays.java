import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SeriesPatternAndArrays {
    public static void main(String[] args) {
        //ask the user for input
        Scanner sc = new Scanner(System.in);
        int number=0;
        while(true) {
            System.out.print("Enter a number: ");
            try{
                number = sc.nextInt();
                //the number should be bigger or equal to zero
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("invalid input, try again");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input");
                //clear the user choice
                sc.next();
            }
        }
        //print the result
        System.out.print("New array: " + (seriesUp(number)));


    }

    public static ArrayList<Integer> seriesUp(int n) {
        //define a new array list
        ArrayList<Integer> arr = new ArrayList<>();

        //outer loop will iterate through the numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            //inner loop will add the sequence
            for (int j = 1; j <= i; j++) {
                //add elements to the array
                arr.add(j);
            }
        }
        //return the array
        return arr;
    }
}
