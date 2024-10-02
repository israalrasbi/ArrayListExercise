import java.util.*;

public class RearrangeAnArray {
    public static void main(String[] args) {
        //define the array list that will contain the user input
        ArrayList<Integer> numbers = new ArrayList<>();
        //define a scanner that will be used to take the user input
        Scanner sc = new Scanner(System.in);
        //ask the user to enter the elements
        System.out.println("Enter numbers to the list, when finished enter -1: ");
        while(true){
            int num = sc.nextInt();
            //if the user enter -1, then exit the loop
            if(num == -1){
                break;
            }
            //otherwise add the items
            numbers.add(num);
        }
        //print results
        System.out.println("Rearrange array: " + (rearrangeArray(numbers)));

    }

    public static ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
        //outer loop will access the element of the array
        //the goal is to find 4 and place it in the right position which is after 3
        for(int i = 0; i < arr.size(); i++) {
            //the inner loop will check if there is a 3
            //the loop will start from 0, so we can search from the left or the right of the current element
            for(int j=0; j<arr.size(); j++) {
                //check if the current element is 4, and the other element is 3
                if(arr.get(i) ==4 && arr.get(j) == 3) {
                    //swap the 4 with the element next to 3
                    //arr[i] is the 4
                    //arr[j+1] is the element next to 3
                    Collections.swap(arr, j+1, i);
                }
            }
        }
        //return the rearranged array
        return arr;
    }
}
