package com.company;

public class Main {

    private static int counter1 =0;
    private static int COUNTER1 =10;
    private static boolean counter1Judge=true;
    private static int counter2 =0;
    private static int COUNTER2 =20;
    private static boolean counter2Judge=true;
    private static int counter3 =0;
    private static int COUNTER3 =30;
    private static boolean counter3Judge=true;
    private static int counter4 =0;
    private static int COUNTER4 =40;
    private static boolean counter4Judge=true;
    private static int counter5 =0;
    private static int COUNTER5 =50;
    private static boolean counter5Judge=true;

    public static void main(String[] args) {
	// write your code here
        while(counter1Judge || counter2Judge || counter3Judge||counter4Judge||counter5Judge){
            if(counter1<COUNTER1){
                counter1++;
            }else if(counter1Judge){
                System.out.println("counter1 Max");
                counter1Judge = false;
            }
            if(counter2<COUNTER2){
                counter2++;
            }else if(counter2Judge){
                System.out.println("counter2 Max");
                counter2Judge = false;
            }
            if(counter3<COUNTER3){
                counter3++;
            }else if(counter3Judge){
                System.out.println("counter3 Max");
                counter3Judge = false;
            }
            if(counter4<COUNTER4){
                counter4++;
            }else if(counter4Judge){
                System.out.println("counter4 Max");
                counter4Judge = false;
            }
            if(counter5<COUNTER5){
                counter5++;
            }else if(counter5Judge){
                System.out.println("counter5 Max");
                counter5Judge = false;
            }

        }
	    System.out.println("abcd");
    }
}
