package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter numbers: ");
        for(int i = 0; i < size; i++) {
          arr[i] = input.nextInt();
        }
        System.out.print("Search for number: ");
        int search = input.nextInt();
        int index = -1;

        for (int i = 0; i < size; i++) {
          if (arr[i] == search) {
            index = i;
            break;
          }
        }
        System.out.println("Number index: " + index);
    }
}
