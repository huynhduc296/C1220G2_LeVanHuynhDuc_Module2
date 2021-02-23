package _03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Tim_min_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("dộ dài của mảng:");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tư thứ" + i + " ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");

        }
        System.out.println("");
        int min;
        min=arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min is: "+ min);
            }
        }

