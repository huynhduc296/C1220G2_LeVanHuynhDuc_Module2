package _02_vong_lap_java.baitap;

import java.util.Scanner;

public class So_nguyen_to_20 {
    public static void main(String[] args) {
        int num = 20;
        int count=1;
        int n=2;
        while (count<=num){
            int CountNumber =0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                  CountNumber++;
                }
            }
            if(CountNumber==2){
                System.out.print(n+"  ");
                count++;
            }
            n++;
        }

    }
}
