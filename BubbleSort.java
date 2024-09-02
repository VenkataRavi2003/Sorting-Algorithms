import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int size;
            while(true){
                System.out.print("\nEnter the size of array : ");
                size = sc.nextInt();
                if(size > 0)break;
                else{
                    System.out.println("\n"+size+" -> size must be greater than zero!!");
                }
            }
            
            int arr[] = new int[size];
            System.out.println("\nEnter the elements into array : ");
            takeInput(arr,sc);
            
            System.out.println("\nBefore Sorting : \n"+Arrays.toString(arr));
            bubbleSort(arr);
            System.out.println("\nAfter Sorting : \n"+Arrays.toString(arr));
        }
    }
    public static void takeInput(int arr[],Scanner sc){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getValidInput(sc);
        }
    }
    public static int getValidInput(Scanner sc){
       while(true){
           try{
               return sc.nextInt();
           }catch(InputMismatchException ime){
               System.out.println("\nInvalid input! please enter valid integer as input.");
               sc.next();
           }
       }
    }
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }   
            }   
        }
    }
}
