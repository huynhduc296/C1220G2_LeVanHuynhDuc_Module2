package _03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Them_phan_tu_mang {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,0,0,0};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập phần tử muốn thêm vào mảng");
       int value =scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm vào mảng");
        int index =scanner.nextInt();
        if( index <= 1&& index >= arr.length-1){
            System.out.println("Nhập k quá độ dài của mảng");
        }else {
            for(int i=arr.length-1;i>index;i--){
                arr[i]=arr[i-1];
            }
            arr[index]=value;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
