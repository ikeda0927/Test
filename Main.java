package com.company;

public class Main {

    private static int counter1 =0;
    private static int COUNTER1 =10;
    private static boolean counter1Judge=true;

    public static void main(String[] args) {
	// write your code here
        while(counter1Judge){
            if(counter1<COUNTER1){
                counter1++;
            }else{
                System.out.println("counter1 Max");
                counter1Judge = false;
            }
        }
    }
}
