package _03_mang_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class Gia_tri_max {
    public static void main(String[] args) {
        int size;
        int []array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Đội dài của mảng");
            size=scanner.nextInt();
            if(size>20){
                System.out.print("độ dài k được lớn hơn 20");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Phần tử thứ"+(i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("các phẩn tử mảng");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\n");
        }
        int max=array[0];
        int index=1;
        for (int j=0;j<array.length;j++){
            if(array[j]>max){
                max=array[j];
              index=j+1;
            }
        }
        System.out.println("Phẩn tử lớn nhất trong mảng là"+max+"ở vị trí"+index);
    }
}
