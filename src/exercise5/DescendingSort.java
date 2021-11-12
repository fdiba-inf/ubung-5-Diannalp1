package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
       // int numberCount = input.nextInt();
        int size = input.nextInt();
        int arr[] = new int[size];
        int temp;

        //int[] numbers = new int[numberCount];
        System.out.println("Enter numbers: ");
        for (int index = 0; index < size; index++) {
            arr[index] = input.nextInt();
        }
        for (int index = 0; index < size; index++) {
          for (int j = 0; j < size-1; j++) {
            if(arr[j] < arr[j+1]) {
              temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
              
            }
          }
        }

        // Sort numbers in descending order

        String arrAsString = Arrays.toString(arr);
        System.out.println("Sorted numbers: " + arrAsString);
    }
}
