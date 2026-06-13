package Algo;

public class Merger {
    public static void main(String[] args) {

        int[] arr1 = {4, 3, 7, 9, 4};
        int[] arr2 = {5, 8, 1, 2, 9};

        Mergerer(arr1, arr2);
    }

    public static void bubbleSort(int[] arr){
        int temp;
        boolean swapped;

        for(int i = 0; i < arr.length - 1; i++){
            swapped = false;

            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }

    static void printArray(int[] arr, int size){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static void Mergerer(int[] arr1, int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        for(int i = 0; i < n1; i++){
            merged[i] = arr1[i];
        }

        for(int i = 0; i < n2; i++){
            merged[n1 + i] = arr2[i];
        }

        bubbleSort(merged);

        printArray(merged, merged.length);
    }
}