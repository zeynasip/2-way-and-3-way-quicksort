package com.mycompany.algo_ana_des_project;

public class twoway_quicksort {
    
    int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1); 
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot 
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j] 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i+1);
    }
    
    void sort(int arr[], int left, int right){
        if (left < right){
            int pi = partition(arr, left, right);
            sort(arr, left, pi-1);
            sort(arr, pi+1, right);
        }
    }

}
