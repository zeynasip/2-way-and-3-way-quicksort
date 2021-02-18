package com.mycompany.algo_ana_des_project;

public class test {
    
    public static void main(String[] args) {  
        
        random_arrays rndarr = new random_arrays();
        int seed = 100;
        for (int i = 1; i <= 10; i++) {
            int [] temp_arr = rndarr.make128mArray(seed*i);
            //twoway_quicksort quick_2way = new twoway_quicksort();
            //threeway_quicksort quick3way = new threeway_quicksort();
            random_twoway_quicksort rand2way = new random_twoway_quicksort();
            long start = System.currentTimeMillis();
            //quick_2way.sort(temp_arr, 0, temp_arr.length-1);
            //quick3way.sort(temp_arr, 0, temp_arr.length-1);
            rand2way.sort(temp_arr, 0, temp_arr.length-1);
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            System.out.println("-----------------------");
        }
    }
}
