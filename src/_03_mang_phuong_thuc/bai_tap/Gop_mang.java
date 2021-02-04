package _03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};
        int arr3[]=new int[8];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]);
        }
    }
}
