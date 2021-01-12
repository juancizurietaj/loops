package com.ironhack;

// create a new project where you iterate over an array of integers and update each position of this array
// by multiplying that value by the value of the next position.
// The last positicion must be multiplied by the first position of the array.

public class Main {

    public static void main(String[] args) {
	int[] arrayInt = {5, 4, 3, 2, 1};

    //	=== For ===
        System.out.println("===Part A===");

        int index = arrayInt[0];
        for(int i=0; i<arrayInt.length; i++){
            if(i+1 == arrayInt.length){
                System.out.println(arrayInt[i] * index);;
            }else{
                System.out.println(arrayInt[i] * arrayInt[i+1]);
            }
        }

        System.out.println("===Part B===");


        int[] result = new int[arrayInt.length];
        for(int i = 0; i < arrayInt.length; i++) {
            result[arrayInt.length-1-i] = arrayInt[i];
        }

        for(int num:result)
            System.out.println(num);

        System.out.println("===Part B 2===");
        for(int i=arrayInt.length-1;i<arrayInt.length;i--){
            if (i >= 0) {
                System.out.println(arrayInt[i]);
            }
        }

    }
}

