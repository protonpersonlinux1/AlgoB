package Algo;
import java.util.Scanner;

public class InsertionSort {
    
    void InsertLogic(int arr[]){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = arr[i] - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("enter the no, of elements: ");
        int n = scn.nextInt();

        
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("enter the elements of the array: \n");
            arr[i] = scn.nextInt();
        }

        SelectSort s = new SelectSort();

        s.sort(arr);
        s.printArray(arr);
    }

        void sort(int arr[]){
            int n = arr.length;

            for(int i = 0; i < n - 1; i++){
                int min_idx = i;

                for(int j = i + 1; j < n; j++){
                    if(arr[j] < arr[min_idx]){
                        min_idx = j;
                    }
                }

                int temp = arr[min_idx];
                arr[min_idx] = arr[i]; 
                arr[i] = temp;
            }
        }
        void printArray(int arr[]){
            int n = arr.length;

            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            System.out.println();
            }
        }
}
