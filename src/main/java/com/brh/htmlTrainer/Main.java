package com.brh.htmlTrainer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static int sum( int v1, int v2){
        return v1 + v2;
    }

    public static  int multiply (int v1, int v2){
        return v1 * v2;
    }

    public static Car getNewCar(){
        return new Car();
    }

    public static int[] getNumbersArray( int min, int max ){

        int[] array = new int[max-min+1];

        for(int i = 0; i < array.length ; i++){
            array[i] = min+i;
        }

        return array;
    }
}