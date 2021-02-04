package _03_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class Xoa_phan_tu_mang {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,2,3,5,5,2};
        Scanner scanner=new Scanner(System.in);
        System.out.println("phần tủ muốn tìm trong mảng");
            int value= scanner.nextInt();
            for(int i=0;i<arr.length;i++){
                if(value==arr[i]){
                    for(int j=i;j<arr.length-1;j++){
                       arr[j]=arr[j+1];
                    }
                    arr[arr.length-1]=0;
                }
            }
            for (int i=0; i<arr.length;i++){
                System.out.print(arr[i]);
            }
    }
}
