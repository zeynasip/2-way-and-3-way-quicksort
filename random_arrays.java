package com.mycompany.algo_ana_des_project;
import java.util.Random;

public class random_arrays {
    
    public int[] make4mArray(int seed){
        Random rd = new Random();
        rd.setSeed(seed);
        int[] arr = new int[4000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }
   
    public int[] make8mArray(int seed){
        Random rd = new Random();
        rd.setSeed(seed);
        int[] arr = new int[8000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }
       
    public int[] make16mArray(int seed){
        Random rd = new Random();
        rd.setSeed(seed);
        int[] arr = new int[16000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }
        
    public int[] make32mArray(int seed){
        Random rd = new Random();
        rd.setSeed(seed);
        int[] arr = new int[32000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }
        
    public int[] make64mArray(int seed){
        Random rd = new Random();
        rd.setSeed(seed);
        int[] arr = new int[64000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }
      
    public int[] make128mArray(int seed){
        Random rd = new Random();
        rd.setSeed(seed);
        int[] arr = new int[128000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }
    
    public int[] make64mIncArray(int seed){
        Random rd = new Random();
        rd.setSeed(seed);
        int[] arr = new int[64000000];
        int val = rd.nextInt();
        for (int i = 0; i < 64000000; i++) arr[i] = val++;
        return arr;
    }
    
    public int[] make64mDecArray(int seed){
        int[] arr = new int[64000000];
        for (int i = 64000000; i > 0; i--) {
            arr[arr.length-i] = i;
        }
        return arr;
    }

    int[] nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}