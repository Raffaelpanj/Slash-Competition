package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int N,jum,cad,msk;
        boolean check = true;
        N = keyboard.nextInt();

        if(N>=1 && N<=100){
            int[] P = new int[N];
            for(int i=0; i<N; i++){
                msk = keyboard.nextInt();
                if(msk<=200 && msk>=-200){
                    P[i] = msk;
                }else{
                    check = false;
                }
            }
            for(int i=N-1; i>0; i--){
                for(int j=1; j<i; j++){
                    if(P[j]>P[j+1]){
                        cad = P[j];
                        P[j] = P[j+1];
                        P[j+1] = cad;
                    }
                }
            }
            jum = P[1];
            for(int i=2; i<N; i++){
                jum = jum+P[i];
            }if(check) {
                if (P[0] - jum >= 0) {
                    System.out.println("menang");
                } else {
                    System.out.println("kalah");
                }
            }
        }
    }
}
