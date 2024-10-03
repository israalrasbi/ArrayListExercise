import java.util.*;

public class SwapEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>();
        System.out.println("Enter the elements of the array, when finished enter -1: ");
        while(true){
            int number = sc.nextInt();
            //if the user enter -1 exit the loop
            if(number == -1){
                break;
            }
            //otherwise, add the elements
            arr.add(number);
        }
        //print result
        System.out.println("Swapped array: " + (swapEnds(arr)));

    }

    public static ArrayList<Integer> swapEnds(ArrayList<Integer> arr) {
        //define a variable for the length
        int arrLen = arr.size();

        //check if the length is at least 1
        if (arrLen > 1) {
            //define variable temp that will be used for swapping
            int temp;
            //swap
            Collections.swap(arr, 0, arrLen - 1);
        }
        //return the swapped array
        return arr;
    }
}