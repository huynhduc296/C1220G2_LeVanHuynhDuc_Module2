package _03_mang_phuong_thuc.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Max_mang_2_chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số cột");
        int col=scanner.nextInt();
        System.out.println("Nhập vào số hàng");
        int row=scanner.nextInt();
        int arr1[][]=new int[col][row];
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.println("Nhập phần tư thứ"+i+" "+j);
                 arr1[i][j]=scanner.nextInt();
            }
        }
        int max=arr1[0][0];
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                if(arr1[i][j]>max){
                    max= arr1[i][j];
                }
            }
        }
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println(max);
    }
}
