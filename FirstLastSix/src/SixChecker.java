import java.util.ArrayList;
import java.util.Scanner;


public class SixChecker {
    public static void main(String[] args) {
        //initialize the array
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Check if the number six is in the start or the end of the array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to the list, when finished enter -1: ");

        while(true){
            int num = sc.nextInt();
            //if the user enter -1, then exit the loop
            if(num == -1){
                break;
            }
            //else add the number to the list
            else{
                arr.add(num);
            }
        }
        System.out.println("Does 6 in the start or the end of the array? " + firstLast6(arr));

    }
    public static boolean firstLast6 (ArrayList<Integer> arr){
        return arr.get(0) == 6 || arr.get(arr.size()-1) == 6;
    }
}