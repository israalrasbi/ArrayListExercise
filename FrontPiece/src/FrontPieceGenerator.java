import java.util.ArrayList;
import java.util.Scanner;

public class FrontPieceGenerator {
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
        //print result
        System.out.println("New array: " + frontPiece(arr));

    }

    public static ArrayList<Integer> frontPiece(ArrayList<Integer> arr){
        ArrayList<Integer>newArr = new ArrayList<>();
        int arrLen = arr.size();
        //if the array length is 0, return an empty array
        //this will avoid ArrayIndexOutOfBoundsException error
        if (arr.isEmpty()) {
            return newArr;
        }
        //if the array is less than 2, then take whatever element is there
        if (arrLen < 2){
            //added item to the list
            newArr.add(arr.get(0));
            //return the list
            return newArr;
        }
        //else, the array has more than 2 items
        newArr.add(arr.get(0));
        newArr.add(arr.get(1));
        return newArr;
    }
}