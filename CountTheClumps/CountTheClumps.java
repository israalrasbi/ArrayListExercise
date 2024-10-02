import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountTheClumps {
    public static void main(String[] args) {
        //initialize the array list
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to the list, when finished enter -1: ");
        while(true){
            int number = sc.nextInt();
            //if the user enter -1 exit the loop
            if(number == -1){
                break;
            }
            //otherwise, add the number to the arrayList
            arr.add(number);
        }

        //print results
        System.out.println("Number of clumps in the array: " + countClumps(arr));

    }
    public static int countClumps(ArrayList<Integer> arr){
        //define variables
        int arrLen =arr.size();
        int count = 0; //this to keep track of clumps in the array
        int i =0; //this will be used in the loops to access the elements

        //outer while loop will iterate through the elements of the array
        while(i<arrLen){
            //define variables
            int currentElement = arr.get(i); //this will store the current elements that will be used to compare
            int size = 0; //this will keep track of consecutive elements

            //inner while loop will count clumps
            //i<arrLen >> to avoid out of bound errors
            //currentElement == arr.get(i)>>check if we are still in the clump or not
            while((i<arrLen) && (currentElement == arr.get(i))){
                i++;
                size++; //this is to count how many times the element is encountered
            }
            //the clump should always be more than one, if yes increment the counter
            if(size>1){
                count++;
            }
        }

        return count;
    }
}
