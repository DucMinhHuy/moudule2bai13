package baitapoption;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter");
        int length = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            System.out.println(arr[i]);
        }
        System.out.println(binarySearch(arr,0,length,5));
    }


    static int binarySearch ( int[] list,int low,int height, int value){
//            value = sc.nextInt();


                int mid = (height - low) / 2;
                if (list[mid] == value) return mid;
                if (list[mid] > value) return binarySearch(list,mid +1,height, value);
                if (list[mid] < value) return binarySearch(list,0,mid -1, value);

            return -1;
        }


}