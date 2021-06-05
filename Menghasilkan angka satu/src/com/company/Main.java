package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int N,ratus,puluh,satu,k=0;
        boolean check = false;
        boolean win = false;
        N = keyboard.nextInt();
        if(N>=1 && N<=100){
            for(int i=100; i<10000; i++){
                int hsl = i;
                while(!check){
                    ratus = hsl/100;
                    puluh = (hsl-ratus*100)/10;
                    satu = (hsl-ratus*100-puluh*10);
                    hsl = (ratus*ratus)+(puluh*puluh)+(satu*satu);
                    if(hsl == 1){
                        check = true;
                        win = true;
                    }else if(hsl<10){
                        check = true;
                    }
                }
                if (win){
                    System.out.print(i+" ");
                    k++;
                }
                if(k==N){
                    break;
                }
                check = false;
                win  = false;
            }
        }
    }
}