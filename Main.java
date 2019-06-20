package com.company;

public class Main {

    private static int counter1 =0;
    private static int COUNTER1 =10;
    private static boolean counter1Judge=true;
    private static int counter2 =0;
    private static int COUNTER2 =20;
    private static boolean counter2Judge=true;
    private static int counter4 =0;
    private static int COUNTER4 =40;
    private static boolean counter4Judge=true;

    public static void main(String[] args) {
	// write your code here
        while(counter1Judge || counter2Judge){
            if(counter1<COUNTER1){
                counter1++;
            }else{
                System.out.println("counter1 Max");
                counter1Judge = false;
            }
            if(counter2<COUNTER1){
                counter2++;
            }else{
                System.out.println("counter2 Max");
                counter2Judge = false;
            }
        }
    }
}
