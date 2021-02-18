package com.mycompany.algo_ana_des_project;

public class threeway_quicksort {
    
    public void sort(int[] input, int lowIndex, int highIndex) {
        if (highIndex<=lowIndex) return;
        int lt=lowIndex;
        int gt=highIndex;
        int i=lowIndex+1;
        int pivotIndex=lowIndex;
        int pivotValue=input[pivotIndex];
        while (i<=gt){
            if (input[i]<pivotValue){
              int temp = input[i];
              input[i] = input[lt];
              input[lt] = temp;
              i++;
              lt++;
            }
            else if (pivotValue<input[i]){
              int temp = input[i];
              input[i] = input[gt];
              input[gt] = temp;
              gt--;
            }     
            else{
                i++;
            }
        }
        sort (input, lowIndex, lt-1);
        sort (input, gt+1, highIndex);
    }
}
